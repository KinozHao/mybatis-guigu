package cum.test;

import cum.mapper.SQLMapper;
import cum.pojo.Employee;
import cum.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/19 16:17
 * @apiNote
 */
public class SQLMapperTest {
    @Test
    public void allUser(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        mapper.allEmp().forEach(System.out::println);

    }
}
