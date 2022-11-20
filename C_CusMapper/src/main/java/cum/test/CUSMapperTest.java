package cum.test;

import cum.mapper.CUSMapper;
import cum.pojo.Employee;
import cum.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/19 16:17
 * @apiNote
 */
public class CUSMapperTest {
    @Test
    public void allUser_resultMap(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        CUSMapper mapper = sqlSession.getMapper(CUSMapper.class);
        List<Employee> employees = mapper.allEmp();
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void allUser_Alias(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        CUSMapper mapper = sqlSession.getMapper(CUSMapper.class);
        List<Employee> employees = mapper.allEmpByAlias();
        employees.forEach(System.out::println);
    }
}
