package bom.mapper;

import bom.pojo.B_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/10/21 10:21
 * @apiNote
 */
public interface ParameterMapper {

    List<B_user> allUser();
    B_user findUserById(int id);

    B_user checkLoginIn(String username, String password);
    B_user checkLoginInByMap(Map<String,Object> map);
    B_user checkLoginInByParam(@Param("username") String username,@Param("password") String password);

    int insertUser(B_user user);
}
