package cum.mapper;


import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;

/**
 * @author kinoz
 * @Date 2022/11/29 19:10
 * @apiNote 批量删除和批量添加
 * 动态sql foreach的使用
 */
public interface MultipleDelAndInsert {
    //通过数据实现批量删除
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    //通过list实现批量添加
    int insertMoreByList(@Param("emps") Collection<Employee> emps);
}
