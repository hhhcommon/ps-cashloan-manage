package com.adpanshi.cashloan.manage.arc.mapper;


import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.arc.model.SysMenu;
import com.adpanshi.cashloan.manage.arc.model.SysMenuExample;
import java.util.List;
import java.util.Map;

import com.adpanshi.cashloan.manage.arc.model.expand.MenuModel;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface SysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    long countByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    int deleteByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    int insert(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    int insertSelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    SysMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysMenu record);
    /**
     *  根据角色ids查询菜单model list信息
     * @param roleIds
     * @return List<MenuModel>
     * @throws
     * @author Vic Tang
     * @date 2018/8/1 9:16
     * */
    List<MenuModel> getMenuListByRoleIds(List<Long> roleIds);
    /**
     *  根据角色id查询菜单
     * @param searchParam
     * @return List<Map<String,Object>>
     * @throws
     * @author Vic Tang
     * @date 2018/8/1 16:45
     * */
    List<Map<String,Object>> getMenuByRoleId(Map<String, Object> searchParam);

    List<Map<String,Object>> fetchRoleMenuHas(Long roleId);

    List<Map<String,Object>> fetchRolebtnHas(Long roleId);
}