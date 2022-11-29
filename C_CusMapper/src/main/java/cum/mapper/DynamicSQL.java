package cum.mapper;

import cum.pojo.Employee;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/29 14:54
 * @apiNote
 */
public interface DynamicSQL {

    /*
    * 多条件查询
    * */
    List<Employee> getEmpByCondition(Employee emp);

    /*
    * 测试choose when otherwise
    * */
    Employee getEmpByChoose(Employee emp);
}
