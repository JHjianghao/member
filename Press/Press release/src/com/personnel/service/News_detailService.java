package com.personnel.service;

import com.personnel.pojo.News_detail;

import java.util.List;

public interface News_detailService {
    /**
     * 分页查询
     * @param index
     * @return
     */
    List<News_detail> findAll(int index);

    /**
     * 查询数据有多少条
     * @return
     */
    int count();

    /**
     * 查询全部
     * @return
     */
    List<News_detail> findAlls();

    /**
     * 查询单条
     * @return
     */
    List<News_detail> findById(String title);

    /**
     * 安照id单条查询
     * @param id
     * @return
     */
    News_detail Id(long id);
    /**
     * 添加
     * @param news_detail
     * @return
     */
    int addEnterpriseTalent(News_detail news_detail);

    /**
     * 修改
     * @param news_detail
     * @return
     */
    int updateEnterpriseTalent(News_detail news_detail);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteEnterpriseTalent(long id);
}
