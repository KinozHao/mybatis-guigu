package bom.mapper;

import bom.pojo.User2;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/10/21 10:21
 * @apiNote
 */
public interface ParameterMapper {
    List<User2> allUser();

    User2 findUserById(int id);
}
