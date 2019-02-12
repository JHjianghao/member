package com.personnel.pojo;

import java.util.Date;

/**
 * 新闻评论实体类
 */
public class News_comment {
    private long id;//id BIGINT COMMENT'评论编号' AUTO_INCREMENT PRIMARY KEY,#id 评论编号 长整数 主键 自动增长
    private long newsid;//newsid BIGINT not null COMMENT '新闻编号',# 长整数 非空 对应新闻表的主键
    private String content;//content VARCHAR(200) not null COMMENT'评论内容',# 字符串 非空
    private String author;//author VARCHAR(20) COMMENT'评论人',# 字符串
    private Date createdate;//createdate datetime COMMENT'评论时间'# 日期 非空
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNewsid() {
        return newsid;
    }

    public void setNewsid(long newsid) {
        this.newsid = newsid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }


}
