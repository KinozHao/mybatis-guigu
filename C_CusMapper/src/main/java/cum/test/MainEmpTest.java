package cum.test;

import cum.mapper.EmpMapper;
import cum.pojo.Employee;
import cum.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/19 16:17
 * @apiNote 以员工数据为主表(多对一)
 */
public class MainEmpTest {

    @Test
    public void Emp_Alias(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Employee> employees = mapper.allEmpByAlias();
        employees.forEach(System.out::println);
    }

    @Test
    public void Emp_resultMap(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Employee> employees = mapper.allEmpByResultMap();
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    @Test
    public void empAndDep(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Employee empAndDep = mapper.getEmpAndDept(1002);
        //只查询员工名称，若开启懒加载就只执行一条sql否则都会执行
        System.out.println(empAndDep.getName());
        System.out.println(empAndDep.getDept());
    }
}
