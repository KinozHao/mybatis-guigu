package cum.test;

import cum.mapper.Cache;
import cum.pojo.Employee;
import cum.util.MybatisUtils;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

/**
 * @author kinoz
 * @Date 2022/12/6 22:26
 * @apiNote 缓存测试
 */
public class CacheTest {
    @Test
    public void Level1Cache_Test(){
        //Mybatis一级缓存默认自动开启,查询多条相同数据时,会从缓存中读取
        SqlSession sqlSession = MybatisUtils.openSession(true);
        Cache mapper = sqlSession.getMapper(Cache.class);
        //这条数据为首次获取
        Employee emp1 = mapper.getEmpById(15);
        System.out.println(emp1);

        //何时失效
        //1.通过sqlSession两次查询期间执行任意一次增删改操作
        //mapper.insertEmp(new Employee(null, "京都散", 13, "女", "167@qq.com",null));

        //2.通过clearCache方法,此方法只对一级缓存有效
        sqlSession.clearCache();

        //这条数据就通过了一级缓存来获取了(上面两种情况注释时)
        Employee emp2 = mapper.getEmpById(15);
        System.out.println(emp2);
    }

    @SneakyThrows
    @Test
    public void Level2Cache_Test(){
        InputStream resource = Resources.getResourceAsStream("config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
        //同一个factory出来的两个不同的SqlSession
        SqlSession sqlSession1 = build.openSession(true);
        SqlSession sqlSession2 = build.openSession(true);

        //当关闭sqlSession后即数据保存到二级缓存,查询只出现一次
        //Cache Hit Ratio is 0.5(default0.0)
        Cache mapper1 = sqlSession1.getMapper(Cache.class);
        System.out.println(mapper1.getEmpById(26));
        sqlSession1.close();

        Cache mapper2 = sqlSession2.getMapper(Cache.class);
        System.out.println(mapper2.getEmpById(26));
        sqlSession2.close();

    }
}
