package cum.mapper;


import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/29 19:10
 * @apiNote 批量删除和批量添加
 * 批量删除和添加:动态sql foreach的使用
 * 查询所有用户:sql标签使用
 */
public interface Multiple {
    //通过数组实现批量删除
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    //通过list实现批量添加
    int insertMoreByList(@Param("emps") Collection<Employee> emps);

    //查询所有用户 测试sql标签
    List<Employee> allUser();
}
