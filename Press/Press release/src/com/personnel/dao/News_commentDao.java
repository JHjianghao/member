package com.personnel.dao;

import com.personnel.pojo.News_comment;

import java.util.List;

public interface News_commentDao {
    /**
     * 分页查询
     * @param index
     * @return
     */
    List<News_comment> findAll(int index);

    /**
     * 查询数据有多少条
     * @return
     */
    int count();

    /**
     * 查询全部
     * @return
     */
    List<News_comment> findAlls();

    /**
     * 查询单条
     * @return
     */
    List<News_comment> findById(long districtId);

    /**
     * 安照id单条查询
     * @param newsid
     * @return
     */
    List<News_comment> Id(long newsid);
    /**
     * 添加
     * @param news_comment
     * @return
     */
    int addEnterpriseTalent(News_comment news_comment);

    /**
     * 修改
     * @param news_comment
     * @return
     */
    int updateEnterpriseTalent(News_comment news_comment);

    /**
     * 删除
     * @param newsid
     * @return
     */
    int deleteEnterpriseTalent(long newsid);
}
