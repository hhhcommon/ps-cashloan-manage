package com.adpanshi.cashloan.manage.cl.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BorrowRepay implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay.borrow_id
     *
     * @mbg.generated
     */
    private Long borrowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay.repay_time
     *
     * @mbg.generated
     */
    private Date repayTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay.penalty_amout
     *
     * @mbg.generated
     */
    private BigDecimal penaltyAmout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay.penalty_day
     *
     * @mbg.generated
     */
    private Integer penaltyDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_borrow_repay
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay.id
     *
     * @return the value of cl_borrow_repay.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay.id
     *
     * @param id the value for cl_borrow_repay.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay.user_id
     *
     * @return the value of cl_borrow_repay.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay.user_id
     *
     * @param userId the value for cl_borrow_repay.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay.borrow_id
     *
     * @return the value of cl_borrow_repay.borrow_id
     *
     * @mbg.generated
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay.borrow_id
     *
     * @param borrowId the value for cl_borrow_repay.borrow_id
     *
     * @mbg.generated
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay.amount
     *
     * @return the value of cl_borrow_repay.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay.amount
     *
     * @param amount the value for cl_borrow_repay.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay.repay_time
     *
     * @return the value of cl_borrow_repay.repay_time
     *
     * @mbg.generated
     */
    public Date getRepayTime() {
        return repayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay.repay_time
     *
     * @param repayTime the value for cl_borrow_repay.repay_time
     *
     * @mbg.generated
     */
    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay.state
     *
     * @return the value of cl_borrow_repay.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay.state
     *
     * @param state the value for cl_borrow_repay.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay.penalty_amout
     *
     * @return the value of cl_borrow_repay.penalty_amout
     *
     * @mbg.generated
     */
    public BigDecimal getPenaltyAmout() {
        return penaltyAmout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay.penalty_amout
     *
     * @param penaltyAmout the value for cl_borrow_repay.penalty_amout
     *
     * @mbg.generated
     */
    public void setPenaltyAmout(BigDecimal penaltyAmout) {
        this.penaltyAmout = penaltyAmout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay.penalty_day
     *
     * @return the value of cl_borrow_repay.penalty_day
     *
     * @mbg.generated
     */
    public Integer getPenaltyDay() {
        return penaltyDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay.penalty_day
     *
     * @param penaltyDay the value for cl_borrow_repay.penalty_day
     *
     * @mbg.generated
     */
    public void setPenaltyDay(Integer penaltyDay) {
        this.penaltyDay = penaltyDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_repay
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
        BorrowRepay other = (BorrowRepay) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBorrowId() == null ? other.getBorrowId() == null : this.getBorrowId().equals(other.getBorrowId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getRepayTime() == null ? other.getRepayTime() == null : this.getRepayTime().equals(other.getRepayTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getPenaltyAmout() == null ? other.getPenaltyAmout() == null : this.getPenaltyAmout().equals(other.getPenaltyAmout()))
            && (this.getPenaltyDay() == null ? other.getPenaltyDay() == null : this.getPenaltyDay().equals(other.getPenaltyDay()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_repay
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBorrowId() == null) ? 0 : getBorrowId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getRepayTime() == null) ? 0 : getRepayTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getPenaltyAmout() == null) ? 0 : getPenaltyAmout().hashCode());
        result = prime * result + ((getPenaltyDay() == null) ? 0 : getPenaltyDay().hashCode());
        return result;
    }
}