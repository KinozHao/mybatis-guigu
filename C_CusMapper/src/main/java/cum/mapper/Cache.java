package cum.mapper;

import cum.pojo.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author kinoz
 * @Date 2022/12/6 22:23
 * @apiNote
 */
public interface Cache {

    Employee getEmpById(@Param("eid")Integer id);
}
