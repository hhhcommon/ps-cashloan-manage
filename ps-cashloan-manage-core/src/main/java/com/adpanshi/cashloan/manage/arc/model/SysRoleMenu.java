package com.adpanshi.cashloan.manage.arc.model;

import java.io.Serializable;

public class SysRoleMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_role_menu.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_role_menu.role_id
     *
     * @mbg.generated
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_role_menu.menu_id
     *
     * @mbg.generated
     */
    private Long menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_role_menu.is_menu
     *
     * @mbg.generated
     */
    private Byte isMenu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table arc_sys_role_menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_role_menu.id
     *
     * @return the value of arc_sys_role_menu.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_role_menu.id
     *
     * @param id the value for arc_sys_role_menu.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_role_menu.role_id
     *
     * @return the value of arc_sys_role_menu.role_id
     *
     * @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_role_menu.role_id
     *
     * @param roleId the value for arc_sys_role_menu.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_role_menu.menu_id
     *
     * @return the value of arc_sys_role_menu.menu_id
     *
     * @mbg.generated
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_role_menu.menu_id
     *
     * @param menuId the value for arc_sys_role_menu.menu_id
     *
     * @mbg.generated
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_role_menu.is_menu
     *
     * @return the value of arc_sys_role_menu.is_menu
     *
     * @mbg.generated
     */
    public Byte getIsMenu() {
        return isMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_role_menu.is_menu
     *
     * @param isMenu the value for arc_sys_role_menu.is_menu
     *
     * @mbg.generated
     */
    public void setIsMenu(Byte isMenu) {
        this.isMenu = isMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_role_menu
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysRoleMenu other = (SysRoleMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getIsMenu() == null ? other.getIsMenu() == null : this.getIsMenu().equals(other.getIsMenu()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_role_menu
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getIsMenu() == null) ? 0 : getIsMenu().hashCode());
        return result;
    }
}