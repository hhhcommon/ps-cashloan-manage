package com.adpanshi.cashloan.manage.cl.model;

import java.io.Serializable;
import java.util.Date;

public class SysAttachment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.target_table
     *
     * @mbg.generated
     */
    private String targetTable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.target_field
     *
     * @mbg.generated
     */
    private String targetField;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.target_id
     *
     * @mbg.generated
     */
    private Long targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.attachment_type
     *
     * @mbg.generated
     */
    private String attachmentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.classify
     *
     * @mbg.generated
     */
    private Integer classify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.sub_classify
     *
     * @mbg.generated
     */
    private Integer subClassify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.file_path
     *
     * @mbg.generated
     */
    private String filePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.origin_name
     *
     * @mbg.generated
     */
    private String originName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.size
     *
     * @mbg.generated
     */
    private Long size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.suffix
     *
     * @mbg.generated
     */
    private String suffix;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.gmt_creater_time
     *
     * @mbg.generated
     */
    private Date gmtCreaterTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.gmt_update_time
     *
     * @mbg.generated
     */
    private Date gmtUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_sys_attachment.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_sys_attachment
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.id
     *
     * @return the value of cl_sys_attachment.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.id
     *
     * @param id the value for cl_sys_attachment.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.target_table
     *
     * @return the value of cl_sys_attachment.target_table
     *
     * @mbg.generated
     */
    public String getTargetTable() {
        return targetTable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.target_table
     *
     * @param targetTable the value for cl_sys_attachment.target_table
     *
     * @mbg.generated
     */
    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable == null ? null : targetTable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.target_field
     *
     * @return the value of cl_sys_attachment.target_field
     *
     * @mbg.generated
     */
    public String getTargetField() {
        return targetField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.target_field
     *
     * @param targetField the value for cl_sys_attachment.target_field
     *
     * @mbg.generated
     */
    public void setTargetField(String targetField) {
        this.targetField = targetField == null ? null : targetField.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.target_id
     *
     * @return the value of cl_sys_attachment.target_id
     *
     * @mbg.generated
     */
    public Long getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.target_id
     *
     * @param targetId the value for cl_sys_attachment.target_id
     *
     * @mbg.generated
     */
    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.attachment_type
     *
     * @return the value of cl_sys_attachment.attachment_type
     *
     * @mbg.generated
     */
    public String getAttachmentType() {
        return attachmentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.attachment_type
     *
     * @param attachmentType the value for cl_sys_attachment.attachment_type
     *
     * @mbg.generated
     */
    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType == null ? null : attachmentType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.classify
     *
     * @return the value of cl_sys_attachment.classify
     *
     * @mbg.generated
     */
    public Integer getClassify() {
        return classify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.classify
     *
     * @param classify the value for cl_sys_attachment.classify
     *
     * @mbg.generated
     */
    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.sub_classify
     *
     * @return the value of cl_sys_attachment.sub_classify
     *
     * @mbg.generated
     */
    public Integer getSubClassify() {
        return subClassify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.sub_classify
     *
     * @param subClassify the value for cl_sys_attachment.sub_classify
     *
     * @mbg.generated
     */
    public void setSubClassify(Integer subClassify) {
        this.subClassify = subClassify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.file_path
     *
     * @return the value of cl_sys_attachment.file_path
     *
     * @mbg.generated
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.file_path
     *
     * @param filePath the value for cl_sys_attachment.file_path
     *
     * @mbg.generated
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.origin_name
     *
     * @return the value of cl_sys_attachment.origin_name
     *
     * @mbg.generated
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.origin_name
     *
     * @param originName the value for cl_sys_attachment.origin_name
     *
     * @mbg.generated
     */
    public void setOriginName(String originName) {
        this.originName = originName == null ? null : originName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.size
     *
     * @return the value of cl_sys_attachment.size
     *
     * @mbg.generated
     */
    public Long getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.size
     *
     * @param size the value for cl_sys_attachment.size
     *
     * @mbg.generated
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.status
     *
     * @return the value of cl_sys_attachment.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.status
     *
     * @param status the value for cl_sys_attachment.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.suffix
     *
     * @return the value of cl_sys_attachment.suffix
     *
     * @mbg.generated
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.suffix
     *
     * @param suffix the value for cl_sys_attachment.suffix
     *
     * @mbg.generated
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.gmt_creater_time
     *
     * @return the value of cl_sys_attachment.gmt_creater_time
     *
     * @mbg.generated
     */
    public Date getGmtCreaterTime() {
        return gmtCreaterTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.gmt_creater_time
     *
     * @param gmtCreaterTime the value for cl_sys_attachment.gmt_creater_time
     *
     * @mbg.generated
     */
    public void setGmtCreaterTime(Date gmtCreaterTime) {
        this.gmtCreaterTime = gmtCreaterTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.gmt_update_time
     *
     * @return the value of cl_sys_attachment.gmt_update_time
     *
     * @mbg.generated
     */
    public Date getGmtUpdateTime() {
        return gmtUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.gmt_update_time
     *
     * @param gmtUpdateTime the value for cl_sys_attachment.gmt_update_time
     *
     * @mbg.generated
     */
    public void setGmtUpdateTime(Date gmtUpdateTime) {
        this.gmtUpdateTime = gmtUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_sys_attachment.remarks
     *
     * @return the value of cl_sys_attachment.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_sys_attachment.remarks
     *
     * @param remarks the value for cl_sys_attachment.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_sys_attachment
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
        SysAttachment other = (SysAttachment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTargetTable() == null ? other.getTargetTable() == null : this.getTargetTable().equals(other.getTargetTable()))
            && (this.getTargetField() == null ? other.getTargetField() == null : this.getTargetField().equals(other.getTargetField()))
            && (this.getTargetId() == null ? other.getTargetId() == null : this.getTargetId().equals(other.getTargetId()))
            && (this.getAttachmentType() == null ? other.getAttachmentType() == null : this.getAttachmentType().equals(other.getAttachmentType()))
            && (this.getClassify() == null ? other.getClassify() == null : this.getClassify().equals(other.getClassify()))
            && (this.getSubClassify() == null ? other.getSubClassify() == null : this.getSubClassify().equals(other.getSubClassify()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
            && (this.getOriginName() == null ? other.getOriginName() == null : this.getOriginName().equals(other.getOriginName()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSuffix() == null ? other.getSuffix() == null : this.getSuffix().equals(other.getSuffix()))
            && (this.getGmtCreaterTime() == null ? other.getGmtCreaterTime() == null : this.getGmtCreaterTime().equals(other.getGmtCreaterTime()))
            && (this.getGmtUpdateTime() == null ? other.getGmtUpdateTime() == null : this.getGmtUpdateTime().equals(other.getGmtUpdateTime()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_sys_attachment
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTargetTable() == null) ? 0 : getTargetTable().hashCode());
        result = prime * result + ((getTargetField() == null) ? 0 : getTargetField().hashCode());
        result = prime * result + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        result = prime * result + ((getAttachmentType() == null) ? 0 : getAttachmentType().hashCode());
        result = prime * result + ((getClassify() == null) ? 0 : getClassify().hashCode());
        result = prime * result + ((getSubClassify() == null) ? 0 : getSubClassify().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getOriginName() == null) ? 0 : getOriginName().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSuffix() == null) ? 0 : getSuffix().hashCode());
        result = prime * result + ((getGmtCreaterTime() == null) ? 0 : getGmtCreaterTime().hashCode());
        result = prime * result + ((getGmtUpdateTime() == null) ? 0 : getGmtUpdateTime().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }
}