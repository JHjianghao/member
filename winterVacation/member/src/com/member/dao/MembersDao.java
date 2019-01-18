package com.member.dao;

import com.member.pojo.Goods;
import com.member.pojo.Members;

import java.util.List;

public interface MembersDao {
    /**
     * 查询全部
     * @return
     */
    List<Members> findAll();

    /**
     * 查询单条
     * @param MemberNumber
     * @return
     */
    List<Members> findById(long MemberNumber);

    /**
     * 添加
     * @param members
     * @return
     */
    int addMembers(Members members);

    /**
     * 修改
     * @param members
     * @return
     */
    int updateMembers(Members members);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteMembers(long id);

    /**
     * 购买
     * @return
     */
    Goods listGoods(long goodsId);
}
