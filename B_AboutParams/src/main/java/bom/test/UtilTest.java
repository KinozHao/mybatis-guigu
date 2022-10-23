package bom.test;


import bom.mapper.ParameterMapper;
import bom.pojo.B_user;
import bom.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
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
        List<B_user> users = mapper.allUser();
        //4.遍历数据
        users.forEach(user -> System.out.println(user));

        B_user user = mapper.findUserById(1002);
        System.out.println(user);
    }
    @Test
    public void LoginTest(){
        SqlSession sqlSession = MybatisUtils.openSession(true);
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        //1.多参数使用默认格式
        B_user user1 = mapper.checkLoginIn("admin", "123456");
        System.out.println(user1);

        //2.多参数自定义Map集合
        HashMap<String, Object> data = new HashMap<>();
        data.put("username","admin");
        data.put("password","123456");
        B_user user2 = mapper.checkLoginInByMap(data);
        System.out.println(user2);

        //3.使用@Param注解(常用方式)
        B_user user3 = mapper.checkLoginInByParam("queen", "143");
        System.out.println(user3);

        //4.接口方法为实体类类型参数时
        //mapper.insertUser(new B_user(null, "queen", "143", 12, "女", "143@qq.com"));

    }
    @Test
    public void tttt(){
        //review equals()
        String name = "hello";
        if (name.equals(200)||name.equals("hello")){
            System.out.println("hello");
        }else {
            System.out.println("out");
        }
    }
}
