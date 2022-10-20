package bcom.test;
import bcom.mapper.UserMapperII;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
/**
 * @author kinoz
 * @Date 2022/10/20 20:49
 * @apiNote
 */
public class SqlTest {
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
        UserMapperII mapper = sqlSession.getMapper(UserMapperII.class);
        //测试CRUD功能
        mapper.insertUser();
        //mapper.delUser();
        //手动提交事务 sqlSession.commit();
    }
}
