package com.adpanshi.cashloan.manage.cl.pojo.equifaxReport;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

@XStreamAlias("sch:VoterID")
public class VoterID implements Serializable {
    @XStreamAlias("sch:IdNumber")
    private String idNumber;

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
