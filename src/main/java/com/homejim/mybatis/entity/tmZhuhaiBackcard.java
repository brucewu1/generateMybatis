package com.homejim.mybatis.entity;

import java.util.Date;

public class tmZhuhaiBackcard {
    private Integer id;

    private String jobNum;

    private String cardNo;

    private String ordId;

    private String apudList;

    private Integer apduNum;

    private String status;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum == null ? null : jobNum.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId == null ? null : ordId.trim();
    }

    public String getApudList() {
        return apudList;
    }

    public void setApudList(String apudList) {
        this.apudList = apudList == null ? null : apudList.trim();
    }

    public Integer getApduNum() {
        return apduNum;
    }

    public void setApduNum(Integer apduNum) {
        this.apduNum = apduNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}