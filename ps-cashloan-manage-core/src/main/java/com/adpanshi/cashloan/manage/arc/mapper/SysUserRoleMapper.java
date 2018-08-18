package com.adpanshi.cashloan.manage.arc.mapper;


import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.arc.model.SysUserRole;
import com.adpanshi.cashloan.manage.arc.model.SysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    long countByExample(SysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    int deleteByExample(SysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    int insertSelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    List<SysUserRole> selectByExample(SysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    SysUserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysUserRole record);
}