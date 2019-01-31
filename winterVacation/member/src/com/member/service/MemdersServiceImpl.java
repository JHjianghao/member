package com.member.service;

import com.member.dao.MembersDao;
import com.member.dao.MembersDaoImpl;
import com.member.pojo.Goods;
import com.member.pojo.Members;

import java.util.List;

public class MemdersServiceImpl implements MembersService {
    private MembersDao membersDao = new MembersDaoImpl();
    @Override
    public List<Members> findAll(int index) {
        return membersDao.findAll(index);
    }
    public List<Members> findAlls() {
        return membersDao.findAlls();
    }
    @Override
    public List<Members> findById(long MemberNumber) {
        return membersDao.findById(MemberNumber);
    }

    @Override
    public int addMembers(Long MemberNumber, String NickName, Long goodsId) {
        return membersDao.addMembers(MemberNumber,NickName, goodsId);
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

    @Override
    public int count() {
        return membersDao.count();
    }
}
