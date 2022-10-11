package com.mapper;

/**
 * @author kinoz
 * @Date 2022/10/11 22:31
 * @apiNote
 */
public interface UserMapper {
    /*
    * 两个一致
    * 1.映射文件的namespace要和mapper接口的全类名一致
    * 2.映射文件中sql语句的id要和mapper接口中的方法名一致
    * */
    /*
    * 添加用户信息
    * */
    int insertUser();
}
