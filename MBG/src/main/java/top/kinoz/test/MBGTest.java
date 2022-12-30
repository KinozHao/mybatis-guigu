package top.kinoz.test;

import kinoz.tools.mybatis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import top.kinoz.mapper.empMapper;
import top.kinoz.pojo.emp;
import top.kinoz.pojo.empExample;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/12/29 16:48
 * @apiNote
 */
public class MBGTest {
    @Test
    public void firstTest(){
        //自定义工具类获取mybatis配置文件
        MybatisUtils.Config_File("mybatis_config.xml");
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.openSession(true);
        empMapper mapper = sqlSession.getMapper(empMapper.class);

        //查询所有数据
        /*List<emp> emps = mapper.selectByExample(null);
        emps.forEach(System.out::println);*/


        //根据条件查询
        empExample example = new empExample();
        example.createCriteria().andCollageEqualTo("南京大学").andSexEqualTo("女").andAgeLessThan(20);
        example.or().andCollageEqualTo("东南大学");
        List<emp> emps = mapper.selectByExample(example);
        emps.forEach(System.out::println);

    }
}
