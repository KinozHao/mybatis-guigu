package cum.test;

import cum.mapper.DynamicSQL;
import cum.mapper.MultipleDelAndInsert;
import cum.pojo.Employee;
import cum.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/29 15:10
 * @apiNote 动态sql的测试
 */
public class DynamicTest {
    SqlSession sqlSession = MybatisUtils.openSession(true);
    DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
    @Test
    public void by_Condition(){
        List<Employee> data = mapper.getEmpByCondition(new Employee(null, "李武", 18, "男", "xxx@qq.com", null));
        //List<Employee> data = mapper.getEmpByCondition(new Employee(null, null, 18, "男", "xxx@qq.com", null));
        //List<Employee> data = mapper.getEmpByCondition(new Employee(null, null, null, null,null,null));
        System.out.println(data);
    }

    @Test
    public void by_Choose(){
        Employee data = mapper.getEmpByChoose(new Employee(null, "李武", null, "男", "xxx@qq.com", null));
        System.out.println(data);
    }

    @Test
    public void MultipleDel_Insert(){
        MultipleDelAndInsert mapperII = sqlSession.getMapper(MultipleDelAndInsert.class);
        //mapperII.deleteMoreByArray(new Integer[]{14});
        Employee employee1 = new Employee(null, "a1", 23, "男", "123@qq.com",null);
        Employee employee2 = new Employee(null, "a1", 23, "男", "123@qq.com",null);
        Employee employee3 = new Employee(null, "a1", 23, "男", "123@qq.com",null);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        int i = mapperII.insertMoreByList(employees);
    }
}
