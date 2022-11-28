package cum.mapper;

import cum.pojo.Department;
import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author kinoz
 * @Date 2022/11/28 15:21
 * @apiNote
 */
interface DeptMapper {
    //根据步骤查询员工和员工对应部门
    //2、查部门,通过d_id查询员工对应的部门信息
    Department getEmpAndDepByStep(@Param("did") Integer did);
}
