package com.lsjs.zb.pojo;

public class CreditCreditDetail {
    private Integer creditId;

    private Integer creditDetailId;

    public CreditCreditDetail(Integer creditId, Integer creditDetailId) {
        this.creditId = creditId;
        this.creditDetailId = creditDetailId;
    }

    public CreditCreditDetail() {
        super();
    }

    public Integer getCreditId() {
        return creditId;
    }

    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

    public Integer getCreditDetailId() {
        return creditDetailId;
    }

    public void setCreditDetailId(Integer creditDetailId) {
        this.creditDetailId = creditDetailId;
    }
}