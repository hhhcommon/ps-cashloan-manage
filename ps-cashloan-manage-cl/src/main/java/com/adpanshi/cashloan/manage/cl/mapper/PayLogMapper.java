package com.adpanshi.cashloan.manage.cl.mapper;

import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.cl.model.PayLog;
import com.adpanshi.cashloan.manage.cl.model.PayLogExample;
import java.util.List;
import java.util.Map;

import com.adpanshi.cashloan.manage.cl.model.expand.PayLogModel;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface PayLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    long countByExample(PayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    int deleteByExample(PayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    int insert(PayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    int insertSelective(PayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    List<PayLog> selectByExample(PayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    PayLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PayLog record, @Param("example") PayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PayLog record, @Param("example") PayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_pay_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PayLog record);

    /**
     * 列表查询
     *
     * @param searchMap
     * @return
     */
    List<PayLogModel> page(Map<String, Object> searchMap);
    /**
     * <p>根据orderNo、borrowId查找最近(创建时间:create_time倒序)的一条支付记录</p>
     * @param orderNo  订单号(必填)
     * @param borrowId 借款id(非必填)
     * @return PayLog
     * */
    PayLog findPayLogByLastOrderNoWithBorrowId(@Param("orderNo")String orderNo,@Param("borrowMainId")String borrowId);
}