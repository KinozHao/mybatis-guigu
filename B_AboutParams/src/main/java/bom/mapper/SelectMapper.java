package bom.mapper;

import bom.pojo.YongHu;
import org.apache.ibatis.annotations.MapKey;
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
    YongHu FindUserById(@Param("id") Integer id);

    //查询所有用户信息
    List<YongHu> All();

    //有多少条数据
    Integer DataCount();

    //根据id查询,为一个Map集合
    Map<String,Object> FindUserByIdMap(@Param("id") Integer id);

    /* 查询所有用户信息,使用Map集合
     * 此时查询到的数据存在多个Map集,若仅仅使用Map会报TooManyResultsException
     * 这个时候需要在方法外层添加list集合
     * 方式二:可以通过@Mapkey来标识唯一字段
     * */
    @MapKey("id")
    Map<String,Object> FindAllUserMap();
}
