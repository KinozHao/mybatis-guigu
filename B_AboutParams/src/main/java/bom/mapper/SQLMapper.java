package bom.mapper;

import bom.pojo.YongHu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/12 11:14
 * @apiNote 一些特殊sql,如下情况可能无法使用#{} 必须使用${}
 */
public interface SQLMapper {
    //根据用户名查询 sql中为模糊查询
    List<YongHu> getUserByLike(@Param("username") String username);

    //批量删除操作
    int DelMore(@Param("ids")String ids);

    //动态设置表名
    List<YongHu> getUserByTableName(@Param("tableName")String tableName);

    //添加功能获取自增的主键
    int insertUser(YongHu yongHu);
}
