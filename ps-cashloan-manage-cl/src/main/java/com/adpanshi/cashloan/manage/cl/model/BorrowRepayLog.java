package com.adpanshi.cashloan.manage.cl.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BorrowRepayLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.repay_id
     *
     * @mbg.generated
     */
    private Long repayId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.borrow_id
     *
     * @mbg.generated
     */
    private Long borrowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.penalty_day
     *
     * @mbg.generated
     */
    private Integer penaltyDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.penalty_amout
     *
     * @mbg.generated
     */
    private BigDecimal penaltyAmout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.fee
     *
     * @mbg.generated
     */
    private BigDecimal fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.repay_way
     *
     * @mbg.generated
     */
    private String repayWay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.repay_account
     *
     * @mbg.generated
     */
    private String repayAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.serial_number
     *
     * @mbg.generated
     */
    private String serialNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.refund_deduction
     *
     * @mbg.generated
     */
    private BigDecimal refundDeduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.pay_time
     *
     * @mbg.generated
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.repay_time
     *
     * @mbg.generated
     */
    private Date repayTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.confirm_time
     *
     * @mbg.generated
     */
    private Date confirmTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_repay_log.confirm_id
     *
     * @mbg.generated
     */
    private Long confirmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_borrow_repay_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.id
     *
     * @return the value of cl_borrow_repay_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.id
     *
     * @param id the value for cl_borrow_repay_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.repay_id
     *
     * @return the value of cl_borrow_repay_log.repay_id
     *
     * @mbg.generated
     */
    public Long getRepayId() {
        return repayId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.repay_id
     *
     * @param repayId the value for cl_borrow_repay_log.repay_id
     *
     * @mbg.generated
     */
    public void setRepayId(Long repayId) {
        this.repayId = repayId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.borrow_id
     *
     * @return the value of cl_borrow_repay_log.borrow_id
     *
     * @mbg.generated
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.borrow_id
     *
     * @param borrowId the value for cl_borrow_repay_log.borrow_id
     *
     * @mbg.generated
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.user_id
     *
     * @return the value of cl_borrow_repay_log.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.user_id
     *
     * @param userId the value for cl_borrow_repay_log.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.amount
     *
     * @return the value of cl_borrow_repay_log.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.amount
     *
     * @param amount the value for cl_borrow_repay_log.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.penalty_day
     *
     * @return the value of cl_borrow_repay_log.penalty_day
     *
     * @mbg.generated
     */
    public Integer getPenaltyDay() {
        return penaltyDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.penalty_day
     *
     * @param penaltyDay the value for cl_borrow_repay_log.penalty_day
     *
     * @mbg.generated
     */
    public void setPenaltyDay(Integer penaltyDay) {
        this.penaltyDay = penaltyDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.penalty_amout
     *
     * @return the value of cl_borrow_repay_log.penalty_amout
     *
     * @mbg.generated
     */
    public BigDecimal getPenaltyAmout() {
        return penaltyAmout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.penalty_amout
     *
     * @param penaltyAmout the value for cl_borrow_repay_log.penalty_amout
     *
     * @mbg.generated
     */
    public void setPenaltyAmout(BigDecimal penaltyAmout) {
        this.penaltyAmout = penaltyAmout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.fee
     *
     * @return the value of cl_borrow_repay_log.fee
     *
     * @mbg.generated
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.fee
     *
     * @param fee the value for cl_borrow_repay_log.fee
     *
     * @mbg.generated
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.repay_way
     *
     * @return the value of cl_borrow_repay_log.repay_way
     *
     * @mbg.generated
     */
    public String getRepayWay() {
        return repayWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.repay_way
     *
     * @param repayWay the value for cl_borrow_repay_log.repay_way
     *
     * @mbg.generated
     */
    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay == null ? null : repayWay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.repay_account
     *
     * @return the value of cl_borrow_repay_log.repay_account
     *
     * @mbg.generated
     */
    public String getRepayAccount() {
        return repayAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.repay_account
     *
     * @param repayAccount the value for cl_borrow_repay_log.repay_account
     *
     * @mbg.generated
     */
    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount == null ? null : repayAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.serial_number
     *
     * @return the value of cl_borrow_repay_log.serial_number
     *
     * @mbg.generated
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.serial_number
     *
     * @param serialNumber the value for cl_borrow_repay_log.serial_number
     *
     * @mbg.generated
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.refund_deduction
     *
     * @return the value of cl_borrow_repay_log.refund_deduction
     *
     * @mbg.generated
     */
    public BigDecimal getRefundDeduction() {
        return refundDeduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.refund_deduction
     *
     * @param refundDeduction the value for cl_borrow_repay_log.refund_deduction
     *
     * @mbg.generated
     */
    public void setRefundDeduction(BigDecimal refundDeduction) {
        this.refundDeduction = refundDeduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.pay_time
     *
     * @return the value of cl_borrow_repay_log.pay_time
     *
     * @mbg.generated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.pay_time
     *
     * @param payTime the value for cl_borrow_repay_log.pay_time
     *
     * @mbg.generated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.repay_time
     *
     * @return the value of cl_borrow_repay_log.repay_time
     *
     * @mbg.generated
     */
    public Date getRepayTime() {
        return repayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.repay_time
     *
     * @param repayTime the value for cl_borrow_repay_log.repay_time
     *
     * @mbg.generated
     */
    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.create_time
     *
     * @return the value of cl_borrow_repay_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.create_time
     *
     * @param createTime the value for cl_borrow_repay_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.confirm_time
     *
     * @return the value of cl_borrow_repay_log.confirm_time
     *
     * @mbg.generated
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.confirm_time
     *
     * @param confirmTime the value for cl_borrow_repay_log.confirm_time
     *
     * @mbg.generated
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_repay_log.confirm_id
     *
     * @return the value of cl_borrow_repay_log.confirm_id
     *
     * @mbg.generated
     */
    public Long getConfirmId() {
        return confirmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_repay_log.confirm_id
     *
     * @param confirmId the value for cl_borrow_repay_log.confirm_id
     *
     * @mbg.generated
     */
    public void setConfirmId(Long confirmId) {
        this.confirmId = confirmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_repay_log
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
        BorrowRepayLog other = (BorrowRepayLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRepayId() == null ? other.getRepayId() == null : this.getRepayId().equals(other.getRepayId()))
            && (this.getBorrowId() == null ? other.getBorrowId() == null : this.getBorrowId().equals(other.getBorrowId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPenaltyDay() == null ? other.getPenaltyDay() == null : this.getPenaltyDay().equals(other.getPenaltyDay()))
            && (this.getPenaltyAmout() == null ? other.getPenaltyAmout() == null : this.getPenaltyAmout().equals(other.getPenaltyAmout()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getRepayWay() == null ? other.getRepayWay() == null : this.getRepayWay().equals(other.getRepayWay()))
            && (this.getRepayAccount() == null ? other.getRepayAccount() == null : this.getRepayAccount().equals(other.getRepayAccount()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getRefundDeduction() == null ? other.getRefundDeduction() == null : this.getRefundDeduction().equals(other.getRefundDeduction()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getRepayTime() == null ? other.getRepayTime() == null : this.getRepayTime().equals(other.getRepayTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getConfirmTime() == null ? other.getConfirmTime() == null : this.getConfirmTime().equals(other.getConfirmTime()))
            && (this.getConfirmId() == null ? other.getConfirmId() == null : this.getConfirmId().equals(other.getConfirmId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_repay_log
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRepayId() == null) ? 0 : getRepayId().hashCode());
        result = prime * result + ((getBorrowId() == null) ? 0 : getBorrowId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPenaltyDay() == null) ? 0 : getPenaltyDay().hashCode());
        result = prime * result + ((getPenaltyAmout() == null) ? 0 : getPenaltyAmout().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getRepayWay() == null) ? 0 : getRepayWay().hashCode());
        result = prime * result + ((getRepayAccount() == null) ? 0 : getRepayAccount().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getRefundDeduction() == null) ? 0 : getRefundDeduction().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getRepayTime() == null) ? 0 : getRepayTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getConfirmTime() == null) ? 0 : getConfirmTime().hashCode());
        result = prime * result + ((getConfirmId() == null) ? 0 : getConfirmId().hashCode());
        return result;
    }
}