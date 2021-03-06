package com.adpanshi.cashloan.manage.cl.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayCheckExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public PayCheckExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIsNull() {
            addCriterion("real_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIsNotNull() {
            addCriterion("real_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount =", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount <>", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountGreaterThan(BigDecimal value) {
            addCriterion("real_pay_amount >", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount >=", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountLessThan(BigDecimal value) {
            addCriterion("real_pay_amount <", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount <=", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIn(List<BigDecimal> values) {
            addCriterion("real_pay_amount in", values, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_pay_amount not in", values, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_pay_amount between", value1, value2, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_pay_amount not between", value1, value2, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andProcessResultIsNull() {
            addCriterion("process_result is null");
            return (Criteria) this;
        }

        public Criteria andProcessResultIsNotNull() {
            addCriterion("process_result is not null");
            return (Criteria) this;
        }

        public Criteria andProcessResultEqualTo(String value) {
            addCriterion("process_result =", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotEqualTo(String value) {
            addCriterion("process_result <>", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultGreaterThan(String value) {
            addCriterion("process_result >", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultGreaterThanOrEqualTo(String value) {
            addCriterion("process_result >=", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultLessThan(String value) {
            addCriterion("process_result <", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultLessThanOrEqualTo(String value) {
            addCriterion("process_result <=", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultLike(String value) {
            addCriterion("process_result like", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotLike(String value) {
            addCriterion("process_result not like", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultIn(List<String> values) {
            addCriterion("process_result in", values, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotIn(List<String> values) {
            addCriterion("process_result not in", values, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultBetween(String value1, String value2) {
            addCriterion("process_result between", value1, value2, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotBetween(String value1, String value2) {
            addCriterion("process_result not between", value1, value2, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessWayIsNull() {
            addCriterion("process_way is null");
            return (Criteria) this;
        }

        public Criteria andProcessWayIsNotNull() {
            addCriterion("process_way is not null");
            return (Criteria) this;
        }

        public Criteria andProcessWayEqualTo(String value) {
            addCriterion("process_way =", value, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayNotEqualTo(String value) {
            addCriterion("process_way <>", value, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayGreaterThan(String value) {
            addCriterion("process_way >", value, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayGreaterThanOrEqualTo(String value) {
            addCriterion("process_way >=", value, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayLessThan(String value) {
            addCriterion("process_way <", value, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayLessThanOrEqualTo(String value) {
            addCriterion("process_way <=", value, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayLike(String value) {
            addCriterion("process_way like", value, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayNotLike(String value) {
            addCriterion("process_way not like", value, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayIn(List<String> values) {
            addCriterion("process_way in", values, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayNotIn(List<String> values) {
            addCriterion("process_way not in", values, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayBetween(String value1, String value2) {
            addCriterion("process_way between", value1, value2, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessWayNotBetween(String value1, String value2) {
            addCriterion("process_way not between", value1, value2, "processWay");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("process_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("process_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(Date value) {
            addCriterion("process_time =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(Date value) {
            addCriterion("process_time <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(Date value) {
            addCriterion("process_time >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("process_time >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(Date value) {
            addCriterion("process_time <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("process_time <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<Date> values) {
            addCriterion("process_time in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<Date> values) {
            addCriterion("process_time not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(Date value1, Date value2) {
            addCriterion("process_time between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("process_time not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOrderNoLikeInsensitive(String value) {
            addCriterion("upper(order_no) like", value.toUpperCase(), "orderNo");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(state) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andProcessResultLikeInsensitive(String value) {
            addCriterion("upper(process_result) like", value.toUpperCase(), "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessWayLikeInsensitive(String value) {
            addCriterion("upper(process_way) like", value.toUpperCase(), "processWay");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cl_pay_check
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cl_pay_check
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}