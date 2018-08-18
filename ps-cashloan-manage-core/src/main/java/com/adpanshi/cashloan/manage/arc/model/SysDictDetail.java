package com.adpanshi.cashloan.manage.arc.model;

import java.io.Serializable;

public class SysDictDetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_dict_detail.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_dict_detail.item_code
     *
     * @mbg.generated
     */
    private String itemCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_dict_detail.item_value
     *
     * @mbg.generated
     */
    private String itemValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_dict_detail.parent_id
     *
     * @mbg.generated
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column arc_sys_dict_detail.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table arc_sys_dict_detail
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_dict_detail.id
     *
     * @return the value of arc_sys_dict_detail.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_dict_detail.id
     *
     * @param id the value for arc_sys_dict_detail.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_dict_detail.item_code
     *
     * @return the value of arc_sys_dict_detail.item_code
     *
     * @mbg.generated
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_dict_detail.item_code
     *
     * @param itemCode the value for arc_sys_dict_detail.item_code
     *
     * @mbg.generated
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_dict_detail.item_value
     *
     * @return the value of arc_sys_dict_detail.item_value
     *
     * @mbg.generated
     */
    public String getItemValue() {
        return itemValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_dict_detail.item_value
     *
     * @param itemValue the value for arc_sys_dict_detail.item_value
     *
     * @mbg.generated
     */
    public void setItemValue(String itemValue) {
        this.itemValue = itemValue == null ? null : itemValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_dict_detail.parent_id
     *
     * @return the value of arc_sys_dict_detail.parent_id
     *
     * @mbg.generated
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_dict_detail.parent_id
     *
     * @param parentId the value for arc_sys_dict_detail.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column arc_sys_dict_detail.state
     *
     * @return the value of arc_sys_dict_detail.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column arc_sys_dict_detail.state
     *
     * @param state the value for arc_sys_dict_detail.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_dict_detail
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
        SysDictDetail other = (SysDictDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItemCode() == null ? other.getItemCode() == null : this.getItemCode().equals(other.getItemCode()))
            && (this.getItemValue() == null ? other.getItemValue() == null : this.getItemValue().equals(other.getItemValue()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table arc_sys_dict_detail
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItemCode() == null) ? 0 : getItemCode().hashCode());
        result = prime * result + ((getItemValue() == null) ? 0 : getItemValue().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }
}