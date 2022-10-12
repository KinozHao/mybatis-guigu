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
 * @apiNote
 */
public class NormalTest {
    @SneakyThrows
    @Test
    public void insertUser(){
        //加载核心配置文件
        InputStream resource = Resources.getResourceAsStream("mybatis_config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory build = ssfb.build(resource);
        //获取SqlSession
        SqlSession sqlSession = build.openSession();
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        int line = mapper.insertUser();
        //通过sqlSession提交事务
        sqlSession.commit();
        System.out.println("受影响行数:"+line);
    }
}
