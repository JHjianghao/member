package com.member.dao;

import com.member.pojo.Goods;

import java.util.List;

public interface GoodsDao {
    /**
     * 查询全部
     * @return
     */
    List<Goods> findAll();

    /**
     * 查询单条
     * @param id
     * @return
     */
    Goods findById(long id);

    /**
     * 添加
     * @param goods
     * @return
     */
    int addMembers(Goods goods);

    /**
     * 修改
     * @param goods
     * @return
     */
    int updateMembers(Goods goods);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteMembers(long id);
}
