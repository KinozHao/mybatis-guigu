package cum.mapper;

import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/28 20:41
 * @apiNote 多对一数据关系
 */
public interface ManyToOne {
    //员工以及员工对应的部门信息
    Employee getEmpAndDept(@Param("eid") Integer eid);

    //分步查询 员工和员工对应部门
    //1、查员工信息
    Employee getEmp_A(@Param("eid") Integer eid);

    //分步查询 部门和部门中员工信息
    //2、查所有员工，通过d_id查询所有员工
    List<Employee> getEmp_B(@Param("did") Integer did);
}
