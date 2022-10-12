package com.mapper;


import com.entity.User;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/10/11 22:31
 * @apiNote
 *两个一致
 *1.映射文件的namespace要和mapper接口的全类名一致
 *2.映射文件中sql语句的id要和mapper接口中的方法名一致
 */
public interface UserMapper {

    //添加用户信息
    int insertUser();

    //根据id删除用户
    int dropUser();

    //更新用户信息
    int updateUser();

    //获取全部用户
    List<User> allUsers();
}
