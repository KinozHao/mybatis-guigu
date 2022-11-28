package cum.mapper;

import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/19 16:14
 * @apiNote
 */
public interface EmpMapper {
    //获取一张指定表的所有数据
    List<Object> allEmpByTable(@Param("TableName")String TableName);

    //获取所有员工数据

    //使用字段别名
    List<Employee> allEmpByAlias();

    //使用resultMap
    List<Employee> allEmpByResultMap();

    //员工以及员工对应的部门信息
    Employee getEmpAndDep(@Param("eid") Integer eid);

    //根据步骤查询员工和员工对应部门
    //1、查员工信息
    Employee getEmpAndDepByStep(@Param("eid") Integer eid);
}
