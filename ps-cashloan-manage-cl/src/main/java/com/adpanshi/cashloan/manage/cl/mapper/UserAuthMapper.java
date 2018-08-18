package com.adpanshi.cashloan.manage.cl.mapper;

import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.cl.model.UserAuth;
import com.adpanshi.cashloan.manage.cl.model.UserAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface UserAuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    long countByExample(UserAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    int deleteByExample(UserAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    int insert(UserAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    int insertSelective(UserAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    List<UserAuth> selectByExample(UserAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    UserAuth selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserAuth record, @Param("example") UserAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserAuth record, @Param("example") UserAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_auth
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserAuth record);
}