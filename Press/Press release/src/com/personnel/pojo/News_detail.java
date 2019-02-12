package com.personnel.pojo;

import java.util.Date;

/**
 * 新闻实体类
 */
public class News_detail {
    private long id;//id BIGINT COMMENT'新闻编号' AUTO_INCREMENT PRIMARY KEY,# 长整数 主键 自动增长
    private String title;//title VARCHAR(20) not null COMMENT'新闻标题',# 字符串 非空
    private String summary;//summary VARCHAR(200) COMMENT'新闻摘要',# 字符串
    private String author;//author VARCHAR(20) COMMENT'作者',# 字符串
    private Date createdate;//createdate datetime not null COMMENT'创建时间'# 日期 非空

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
