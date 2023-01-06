package top.kinoz.test;

import kinoz.tools.mybatis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import top.kinoz.mapper.empMapper;

/**
 * @author kinoz
 * @Date 2023/1/6 22:58
 * @apiNote 分页插件测试的使用
 */
public class PageHelperTest {
    @Test
    public void firstTest(){
        MybatisUtils.Config_File("mybatis_config.xml");
        SqlSession sqlSession = MybatisUtils.openSession(true);
        empMapper mapper = sqlSession.getMapper(empMapper.class);
    }
}
