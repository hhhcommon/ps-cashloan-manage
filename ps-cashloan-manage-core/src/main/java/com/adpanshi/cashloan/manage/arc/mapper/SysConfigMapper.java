package com.adpanshi.cashloan.manage.arc.mapper;


import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.arc.model.SysConfig;
import com.adpanshi.cashloan.manage.arc.model.SysConfigExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    long countByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    int deleteByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    List<SysConfig> selectByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    SysConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysConfig record);

    List<SysConfig> listSelective(Map<String, Object> map);
}