package com.member.service;

import com.member.dao.GoodsDao;
import com.member.dao.GoodsDaoImpl;
import com.member.pojo.Goods;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    private GoodsDao goodsDao = new GoodsDaoImpl();

    @Override
    public List<Goods> findAll() {
        return goodsDao.findAll();
    }

    @Override
    public Goods findById(long id) {
        return goodsDao.findById(id);
    }

    @Override
    public int addMembers(Goods goods) {
        return goodsDao.addMembers(goods);
    }

    @Override
    public int updateMembers(Goods goods) {
        return goodsDao.updateMembers(goods);
    }

    @Override
    public int deleteMembers(long id) {
        return goodsDao.deleteMembers(id);
    }
}
