package bom.test;

import bom.mapper.SQLMapper;
import bom.pojo.YongHu;
import bom.util.MybatisUtils;
import lombok.SneakyThrows;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

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
    @Test
    public void TableName(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<YongHu> user = mapper.getUserByTableName("user");
        user.forEach(data -> System.out.println(data));
    }
    @Test
    public void insertTest(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        mapper.insertUser(new YongHu(null,"李伟", "leewei123", 32, "女", "leewei32432423@qq.com"));
    }
}
