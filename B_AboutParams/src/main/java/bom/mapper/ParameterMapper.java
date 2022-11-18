package bom.mapper;

import bom.pojo.YongHu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/10/21 10:21
 * @apiNote
 */
public interface ParameterMapper {

    //获取全部用户
    List<YongHu> allUser();
    //根据id获取用户
    YongHu findUserById(int id);
    //登录认证
    YongHu checkLoginIn(String username, String password);
    //登录认证(使用Map)
    YongHu checkLoginInByMap(Map<String,Object> map);
    //登录认证(使用Param注解)
    YongHu checkLoginInByParam(@Param("username") String username, @Param("password") String password);
    //添加用户(通过一个实体类)
    int insertUser(YongHu user);
}
