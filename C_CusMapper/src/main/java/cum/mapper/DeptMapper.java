package cum.mapper;

import cum.pojo.Department;
import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author kinoz
 * @Date 2022/11/28 15:21
 * @apiNote
 */
public interface DeptMapper {
    //分步查询 员工和员工对应部门
    //2、查部门,通过d_id查询员工对应的部门信息
    Department getDept_A(@Param("did") Integer did);

    //获取部门以及部门中所有员工的信息(部门为主表)
    Department getDepAndEmp(@Param("did") Integer did);

    //分步查询 部门和部门中员工信息
    //1、查部门，通过d_id查询所有部门
    Department getDept_B(@Param("did") Integer did);
}
