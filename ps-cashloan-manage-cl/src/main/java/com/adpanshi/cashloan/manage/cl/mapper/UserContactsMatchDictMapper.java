package com.adpanshi.cashloan.manage.cl.mapper;

import com.adpanshi.cashloan.common.mapper.RDBatisDao;
import com.adpanshi.cashloan.manage.cl.model.UserContactsMatchDict;
import com.adpanshi.cashloan.manage.cl.model.UserContactsMatchDictExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
@RDBatisDao
public interface UserContactsMatchDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    long countByExample(UserContactsMatchDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    int deleteByExample(UserContactsMatchDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    int insert(UserContactsMatchDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    int insertSelective(UserContactsMatchDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    List<UserContactsMatchDict> selectByExample(UserContactsMatchDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    UserContactsMatchDict selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserContactsMatchDict record, @Param("example") UserContactsMatchDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserContactsMatchDict record, @Param("example") UserContactsMatchDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserContactsMatchDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_contacts_match_dict
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserContactsMatchDict record);

    List<UserContactsMatchDict> listSelective(Map<String, Object> searchMap);;
}