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

    /*获取所有员工数据*/
    //1、使用字段别名
    List<Employee> allEmpByAlias();

    //2、使用resultMap
    List<Employee> allEmpByResultMap();


    /*多对一查询*/
    //员工以及员工对应的部门信息
    Employee getEmpAndDept(@Param("eid") Integer eid);

    //分步查询 员工和员工对应部门
    //1、查员工信息
    Employee getEmp_A(@Param("eid") Integer eid);

    //分步查询 部门和部门中员工信息
    //2、查所有员工，通过d_id查询所有员工
    List<Employee> getEmp_B(@Param("did") Integer did);
}
