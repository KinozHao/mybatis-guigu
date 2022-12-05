package cum.test;

import cum.mapper.Multiple;
import cum.pojo.Employee;
import cum.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/12/5 21:50
 * @apiNote 动态SQL
 * 使用foreach标签批量删除、批量添加
 * 使用sql片段实现查询所有用户
 */
public class MultipleTest {
    SqlSession sqlSession = MybatisUtils.openSession(true);
    Multiple mapper = sqlSession.getMapper(Multiple.class);

    @Test
    public void Multiple_Insert(){
        Employee employee1 = new Employee(null, "a1", 23, "男", "123@qq.com",null);
        Employee employee2 = new Employee(null, "a1", 23, "男", "123@qq.com",null);
        Employee employee3 = new Employee(null, "a1", 23, "男", "123@qq.com",null);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        int i = mapper.insertMoreByList(employees);
    }
    @Test
    public void Multiple_Delete(){
        mapper.deleteMoreByArray(new Integer[]{21,22,23,24,25});
    }

    @Test
    public void sql_Title(){
        //测试sql片段，获取所有员工信息
        mapper.allUser().forEach(System.out::println);
    }
}
