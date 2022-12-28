package cum.mapper;

import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author kinoz
 * @Date 2022/12/6 22:23
 * @apiNote Mybatis的缓存相关
 */
public interface Cache {

    //根据员工id查询
    Employee getEmpById(@Param("eid")Integer id);

    //插入新的员工信息
    void insertEmp(Employee emp);
}
