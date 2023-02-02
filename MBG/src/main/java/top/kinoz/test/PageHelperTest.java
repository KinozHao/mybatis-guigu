package top.kinoz.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import kinoz.tools.mybatis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import top.kinoz.mapper.empMapper;
import top.kinoz.pojo.emp;

import java.util.List;

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
        //代表开启分页插件,访问第一页,一页显示4条数据
        PageHelper.startPage(1,4);
        List<emp> emps = mapper.selectByExample(null);
        //获取分页相关的信息 emps表示分页数据，5表示导航分页的个数
        PageInfo<emp> info = new PageInfo<>(emps,5);
        System.out.println(info);
        emps.forEach(System.out::println);

        /*  info打印出来的信息
        * PageInfo{pageNum=2, pageSize=4, size=4, startRow=5, endRow=8, total=13, pages=4,
        * list=Page{count=true, pageNum=2, pageSize=4, startRow=4, endRow=8, total=13, pages=4, reasonable=false, pageSizeZero=false}
        * [emp{eId=19, eName='李斯', age=32, sex='男', email='li@qq.com', dId=1001, collage='中科院'},
        * emp{eId=20, eName='李武', age=21, sex='女', email='liu@qq.com', dId=1001, collage='上海交大'},
        * emp{eId=26, eName='刘萌萌', age=23, sex='女', email='123@qq.com', dId=1004, collage='南京大学'},
        * emp{eId=27, eName='王雅', age=23, sex='男', email='123@qq.com', dId=1006, collage='黄淮学院'}],
        * prePage=1, nextPage=3, isFirstPage=false, isLastPage=false, hasPreviousPage=true, hasNextPage=true,
        * navigatePages=5, navigateFirstPage=1, navigateLastPage=4, navigatepageNums=[1, 2, 3, 4]}
         * */
    }
}
