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
 * @apiNote 动态sql的测试
 */
public class DynamicTest {
    @Test
    public void by_Condition(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        List<Employee> data = mapper.getEmpByCondition(new Employee(null, "李武", 18, "男", "xxx@qq.com", null));
        //List<Employee> data = mapper.getEmpByCondition(new Employee(null, null, 18, "男", "xxx@qq.com", null));
        //List<Employee> data = mapper.getEmpByCondition(new Employee(null, null, null, null,null,null));
        System.out.println(data);
    }

    @Test
    public void by_Choose(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        Employee data = mapper.getEmpByChoose(new Employee(null, "李武", null, "男", "xxx@qq.com", null));
        System.out.println(data);
    }
}
