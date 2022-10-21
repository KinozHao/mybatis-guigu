package bom.test;


import bom.mapper.ParameterMapper;
import bom.pojo.User2;
import bom.util.MybatisUtils;
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
        //1.通过工具类类获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.openSession(true);
        //2.通过反射获取mapper对象
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        //3.使用mapper调用CRUD方法
        List<User2> users = mapper.allUser();
        //4.遍历数据
        users.forEach(user -> System.out.println(user));

        User2 user = mapper.findUserById(1002);
        System.out.println(user);
    }
}
