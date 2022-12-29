package cum.test;

import cum.mapper.DynamicSQL;
import cum.pojo.Employee;
import cum.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/29 15:10
 * @apiNote 动态sql
 * 使用if标签
 * 使用where嵌套if标签
 * 使用choose when otherwise标签
 */
public class DynamicTest {
    SqlSession sqlSession = MybatisUtils.openSession(true);
    DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);

    @Test
    public void by_Condition(){
        List<Employee> data = mapper.getEmpByCondition(new Employee(null, "刘萌萌", 23, "女", "123@qq.com","淮阴师范学院",null));
        //List<Employee> data = mapper.getEmpByCondition(new Employee(null, null, 18, "男", "xxx@qq.com", null));
        //List<Employee> data = mapper.getEmpByCondition(new Employee(null, null, null, null,null,null));
        System.out.println(data);
    }

    @Test
    public void by_Choose(){
        Employee data = mapper.getEmpByChoose(new Employee(null, "京都散", null, "女", "xxx@qq.com","淮阴师范学院",null));
        System.out.println(data);
    }


}
