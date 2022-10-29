package bom.mapper;

import bom.pojo.B_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/10/29 17:29
 * @apiNote
 */
public interface SelectMapper {
    //根据id查询
    B_user FindUserById(@Param("id") Integer id);

    //所有信息
    List<B_user> All();

    //有多少条数据
    Integer DataCount();

    //根据id查询 为一个Map集合
    Map<String,Object> FindUserByIdMap(@Param("id") Integer id);
}
