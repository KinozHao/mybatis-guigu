package bom.test;

import bom.mapper.SQLMapper;
import bom.pojo.YongHu;
import bom.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;



/**
 * @author kinoz
 * @Date 2022/11/12 11:18
 * @apiNote
 */
public class SQLMapperTest {
    @Test
    public void byLike(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        //查询username中包含a的参数
        List<YongHu> a = mapper.getUserByLike("刘");
        a.forEach(System.out::println);
    }
    @Test
    public void delMore(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int i = mapper.DelMore("1055,1056");
    }

}
