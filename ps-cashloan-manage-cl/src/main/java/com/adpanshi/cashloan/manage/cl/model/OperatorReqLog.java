package com.adpanshi.cashloan.manage.cl.model;

import tool.util.DateUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * 运营商认证中间表实体
 * 
 * @author
 * @version 1.0.0
 * @date 2017-03-01 16:27:59
 */
 public class OperatorReqLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 用户标识
    */
    private Long userId;

    /**
    * 订单号
    */
    private String orderNo;
    
    /**
     * 响应码
     */
    private String respCode;
    
    /**
	 * 同步返回参数
	 */
	private String respParams;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
	 * 同步回调时间
	 */
	private Date respTime;
	
	/**
	 * 业务类型，ACCFUND公积金   OPERATOR运营商
	 */
    private String businessType;

	/**
	 * 查询次数
	 */
	private int times;
	
    public OperatorReqLog(){
    	super();
    }

    public OperatorReqLog(long userId, String orderNo, String respCode){
    	super();
    	this.userId = userId;
    	this.orderNo = orderNo;
    	this.respCode = respCode;
    	this.createTime = DateUtil.getNow();
    }

	/**
	 * 获取主键Id
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置主键Id
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取用户标识
	 * @return userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 设置用户标识
	 * @param userId
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 获取订单号
	 * @return orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * 设置订单号
	 * @param orderNo
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * 获取响应码
	 * @return respCode
	 */
	public String getRespCode() {
		return respCode;
	}

	/**
	 * 设置响应码
	 * @param respCode
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	/**
	 * 获取创建时间
	 * @return createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/** 
	 * 获取同步回调时间
	 * @return respTime
	 */
	public Date getRespTime() {
		return respTime;
	}

	/** 
	 * 设置同步回调时间
	 * @param respTime
	 */
	public void setRespTime(Date respTime) {
		this.respTime = respTime;
	}

	/** 
	 * 获取同步返回参数
	 * @return respParams
	 */
	public String getRespParams() {
		return respParams;
	}

	/** 
	 * 设置同步返回参数
	 * @param respParams
	 */
	public void setRespParams(String respParams) {
		this.respParams = respParams;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
}
