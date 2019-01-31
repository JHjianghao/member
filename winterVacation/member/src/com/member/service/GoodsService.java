package com.member.service;

import com.member.pojo.Goods;
import com.member.pojo.Members;

import java.util.List;

public interface GoodsService {
    /**
     * 查询全部
     * @return
     */
    List<Goods> findAll();

    /**
     * 查询单条
     * @param name
     * @return
     */
    Goods findById(String name);

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

    /**
     * 购买
     * @param members
     * @param goods
     * @return
     */
}
