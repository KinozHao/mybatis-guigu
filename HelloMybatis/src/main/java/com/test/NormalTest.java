package com.test;

import com.mapper.UserMapper;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

/**
 * @author kinoz
 * @Date 2022/10/12 15:24
 * @apiNote 使用sqlSession获取Mapper对象(底层是代理模式)
 * sqlSession默认不自动提交事务
 * 当需要自动提交使用openSession(true) true代表开启自动提交
 */
public class NormalTest {
    @SneakyThrows
    @Test
    public void insertUser(){
        //加载核心配置文件
        InputStream resource = Resources.getResourceAsStream("mybatis_config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory factory = builder.build(resource);
        //获取SqlSession,开启自动提交
        SqlSession sqlSession = factory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        //mapper.insertUser();
        mapper.dropUser();
        //mapper.updateUser();
        //mapper.allUsers();
        //手动提交事务 sqlSession.commit();
    }
}
