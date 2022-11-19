package cum.mapper;

import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/19 16:14
 * @apiNote
 */
public interface CUSMapper {
    //获取一张指定表的所有数据
    List<Object> allEmpByTable(@Param("TableName")String TableName);

    //获取所有员工数据
    List<Employee> allEmp();
}
