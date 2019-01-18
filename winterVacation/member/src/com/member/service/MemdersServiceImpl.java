package com.member.service;

import com.member.dao.MembersDao;
import com.member.dao.MembersDaoImpl;
import com.member.pojo.Goods;
import com.member.pojo.Members;

import java.util.List;

public class MemdersServiceImpl implements MembersService {
    private MembersDao membersDao = new MembersDaoImpl();
    @Override
    public List<Members> findAll() {
        return membersDao.findAll();
    }

    @Override
    public List<Members> findById(long MemberNumber) {
        return membersDao.findById(MemberNumber);
    }

    @Override
    public int addMembers(Members members) {
        return membersDao.addMembers(members);
    }

    @Override
    public int updateMembers(Members members) {
        return membersDao.updateMembers(members);
    }

    @Override
    public int deleteMembers(long id) {
        return membersDao.deleteMembers(id);
    }

    @Override
    public Goods listGoods(long goodsId) {
        return membersDao.listGoods(goodsId);
    }
}
