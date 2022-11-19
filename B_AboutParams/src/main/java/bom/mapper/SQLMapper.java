package bom.mapper;

import bom.pojo.YongHu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/12 11:14
 * @apiNote 模糊查询
 */
public interface SQLMapper {
    //根据用户名查询 sql中为模糊查询
    List<YongHu> getUserByLike(@Param("username") String username);

    //批量删除操作
    int DelMore(@Param("ids")String ids);
}
