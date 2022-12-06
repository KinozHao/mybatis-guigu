package cum.test;

import cum.mapper.Cache;
import cum.pojo.Employee;
import cum.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @author kinoz
 * @Date 2022/12/6 22:26
 * @apiNote 缓存测试
 */
public class CacheTest {
    @Test
    public void byId_Test(){
        //Mybatis一级缓存默认自动开启,查询多条相同数据时,会从缓存中读取
        SqlSession sqlSession = MybatisUtils.openSession(true);
        Cache mapper = sqlSession.getMapper(Cache.class);
        Employee emp1 = mapper.getEmpById(15);
        System.out.println(emp1);
        Employee emp2 = mapper.getEmpById(15);
        System.out.println(emp2);
    }
}
