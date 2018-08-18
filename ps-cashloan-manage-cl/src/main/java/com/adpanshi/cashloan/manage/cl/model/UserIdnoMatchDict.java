package com.adpanshi.cashloan.manage.cl.model;

import java.io.Serializable;
import java.util.Date;

public class UserIdnoMatchDict implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_idno_match_dict.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_idno_match_dict.province_name
     *
     * @mbg.generated
     */
    private String provinceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_idno_match_dict.province_start_no
     *
     * @mbg.generated
     */
    private Integer provinceStartNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_idno_match_dict.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_idno_match_dict.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_user_idno_match_dict
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_idno_match_dict.id
     *
     * @return the value of cl_user_idno_match_dict.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_idno_match_dict.id
     *
     * @param id the value for cl_user_idno_match_dict.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_idno_match_dict.province_name
     *
     * @return the value of cl_user_idno_match_dict.province_name
     *
     * @mbg.generated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_idno_match_dict.province_name
     *
     * @param provinceName the value for cl_user_idno_match_dict.province_name
     *
     * @mbg.generated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_idno_match_dict.province_start_no
     *
     * @return the value of cl_user_idno_match_dict.province_start_no
     *
     * @mbg.generated
     */
    public Integer getProvinceStartNo() {
        return provinceStartNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_idno_match_dict.province_start_no
     *
     * @param provinceStartNo the value for cl_user_idno_match_dict.province_start_no
     *
     * @mbg.generated
     */
    public void setProvinceStartNo(Integer provinceStartNo) {
        this.provinceStartNo = provinceStartNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_idno_match_dict.create_time
     *
     * @return the value of cl_user_idno_match_dict.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_idno_match_dict.create_time
     *
     * @param createTime the value for cl_user_idno_match_dict.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_idno_match_dict.state
     *
     * @return the value of cl_user_idno_match_dict.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_idno_match_dict.state
     *
     * @param state the value for cl_user_idno_match_dict.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_idno_match_dict
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
        UserIdnoMatchDict other = (UserIdnoMatchDict) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProvinceName() == null ? other.getProvinceName() == null : this.getProvinceName().equals(other.getProvinceName()))
            && (this.getProvinceStartNo() == null ? other.getProvinceStartNo() == null : this.getProvinceStartNo().equals(other.getProvinceStartNo()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_idno_match_dict
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProvinceName() == null) ? 0 : getProvinceName().hashCode());
        result = prime * result + ((getProvinceStartNo() == null) ? 0 : getProvinceStartNo().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }
}