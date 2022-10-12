import com.entity.User;
import com.mapper.UserMapper;
import com.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/10/11 22:47
 * @apiNote 测试Mybatis工具类
 */
public class UtilTest {
    @Test
    public void GetAllUser(){
        //1.通过公寓类获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.openSession();
        //2.通过反射获取mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //3.使用mapper调用CRUD方法
        List<User> users = mapper.allUsers();
        //4.提交事务
        sqlSession.commit();
        //5.遍历数据
        users.forEach(System.out::println);
        //6.关闭SqlSession
        MybatisUtils.closeSession(sqlSession);
    }
    @Test
    public void GetUserById(){
        SqlSession sqlSession = MybatisUtils.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1002);
        System.out.println(user);
        MybatisUtils.closeSession(sqlSession);
    }
}
