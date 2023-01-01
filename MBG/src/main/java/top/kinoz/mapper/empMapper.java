package top.kinoz.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.kinoz.pojo.emp;
import top.kinoz.pojo.empExample;

public interface empMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int countByExample(empExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int deleteByExample(empExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int deleteByPrimaryKey(Integer eId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int insert(emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int insertSelective(emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    List<emp> selectByExample(empExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    emp selectByPrimaryKey(Integer eId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int updateByExampleSelective(@Param("record") emp record, @Param("example") empExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int updateByExample(@Param("record") emp record, @Param("example") empExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int updateByPrimaryKeySelective(emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int updateByPrimaryKey(emp record);
}