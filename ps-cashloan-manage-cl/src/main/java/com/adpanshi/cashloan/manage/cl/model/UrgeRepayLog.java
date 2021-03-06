package com.adpanshi.cashloan.manage.cl.model;

import java.io.Serializable;
import java.util.Date;

public class UrgeRepayLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.due_id
     *
     * @mbg.generated
     */
    private Long dueId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.borrow_id
     *
     * @mbg.generated
     */
    private Long borrowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.promise_time
     *
     * @mbg.generated
     */
    private Date promiseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_urge_repay_log.way
     *
     * @mbg.generated
     */
    private String way;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_urge_repay_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.id
     *
     * @return the value of cl_urge_repay_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.id
     *
     * @param id the value for cl_urge_repay_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.due_id
     *
     * @return the value of cl_urge_repay_log.due_id
     *
     * @mbg.generated
     */
    public Long getDueId() {
        return dueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.due_id
     *
     * @param dueId the value for cl_urge_repay_log.due_id
     *
     * @mbg.generated
     */
    public void setDueId(Long dueId) {
        this.dueId = dueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.borrow_id
     *
     * @return the value of cl_urge_repay_log.borrow_id
     *
     * @mbg.generated
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.borrow_id
     *
     * @param borrowId the value for cl_urge_repay_log.borrow_id
     *
     * @mbg.generated
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.user_id
     *
     * @return the value of cl_urge_repay_log.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.user_id
     *
     * @param userId the value for cl_urge_repay_log.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.state
     *
     * @return the value of cl_urge_repay_log.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.state
     *
     * @param state the value for cl_urge_repay_log.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.remark
     *
     * @return the value of cl_urge_repay_log.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.remark
     *
     * @param remark the value for cl_urge_repay_log.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.promise_time
     *
     * @return the value of cl_urge_repay_log.promise_time
     *
     * @mbg.generated
     */
    public Date getPromiseTime() {
        return promiseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.promise_time
     *
     * @param promiseTime the value for cl_urge_repay_log.promise_time
     *
     * @mbg.generated
     */
    public void setPromiseTime(Date promiseTime) {
        this.promiseTime = promiseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.create_time
     *
     * @return the value of cl_urge_repay_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.create_time
     *
     * @param createTime the value for cl_urge_repay_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_urge_repay_log.way
     *
     * @return the value of cl_urge_repay_log.way
     *
     * @mbg.generated
     */
    public String getWay() {
        return way;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_urge_repay_log.way
     *
     * @param way the value for cl_urge_repay_log.way
     *
     * @mbg.generated
     */
    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_urge_repay_log
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
        UrgeRepayLog other = (UrgeRepayLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDueId() == null ? other.getDueId() == null : this.getDueId().equals(other.getDueId()))
            && (this.getBorrowId() == null ? other.getBorrowId() == null : this.getBorrowId().equals(other.getBorrowId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPromiseTime() == null ? other.getPromiseTime() == null : this.getPromiseTime().equals(other.getPromiseTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getWay() == null ? other.getWay() == null : this.getWay().equals(other.getWay()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_urge_repay_log
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDueId() == null) ? 0 : getDueId().hashCode());
        result = prime * result + ((getBorrowId() == null) ? 0 : getBorrowId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPromiseTime() == null) ? 0 : getPromiseTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getWay() == null) ? 0 : getWay().hashCode());
        return result;
    }
}