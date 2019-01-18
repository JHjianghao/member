package com.member.pojo;

import java.util.Date;

public class Members {
    private long id;
    private long memberNumber;
    private String nickName;
    private Date createTime;
    private long goodsId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(long memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}
