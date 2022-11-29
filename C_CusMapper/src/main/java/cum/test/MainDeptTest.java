package cum.test;

import cum.mapper.DeptMapper;
import cum.pojo.Department;
import cum.util.MybatisUtils;
import org.junit.jupiter.api.Test;

/**
 * @author kinoz
 * @Date 2022/11/28 19:58
 * @apiNote 以部门数据为主表(一对多)
 */
public class MainDeptTest {
    @Test
    //部门所有员工信息，通过collection
    public void use_Col(){
        DeptMapper mapper = MybatisUtils.openSession(true).getMapper(DeptMapper.class);
        Department depAndEmp = mapper.getDepAndEmp(1002);
        System.out.println(depAndEmp);
    }

    @Test
    //部门所有员工信息，通过分步查询
    public void use_Step(){
        DeptMapper mapper = MybatisUtils.openSession(true).getMapper(DeptMapper.class);
        Department depAndEmp = mapper.getDept_B(1002);
        System.out.println(depAndEmp.getD_name());
    }
}
