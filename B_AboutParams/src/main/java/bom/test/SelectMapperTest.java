package bom.test;

import bom.mapper.SelectMapper;
import bom.pojo.B_user;
import bom.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author kinoz
 * @Date 2022/10/29 17:36
 * @apiNote
 */
public class SelectMapperTest {
    @Test
     public void TestGetUserById(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.FindUserById(1056));
    }
    @Test
    public void TestGetAllUser(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<B_user> all = mapper.All();
        all.forEach(user -> System.out.println(user) );
    }
    @Test
    public void TestCount(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.DataCount());

    }

    @Test
    public void TestGetUserByIdMap(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.FindUserByIdMap(1056));
    }

    @Test
    public void TestGeAllUserMap(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> result = mapper.FindAllUserMap();
        System.out.println(result);
    }
}
