package com.personnel.service;

import com.personnel.dao.News_detailDao;
import com.personnel.dao.News_detailDaoImpl;
import com.personnel.pojo.News_detail;

import java.util.List;

public class News_detailServiceImpl implements News_detailService {
    private News_detailDao news_detailDao = new News_detailDaoImpl();
    @Override
    public List<News_detail> findAll(int index) {
        return news_detailDao.findAll(index);
    }

    @Override
    public int count() {
        return news_detailDao.count();
    }

    @Override
    public List<News_detail> findAlls() {
        return news_detailDao.findAlls();
    }

    @Override
    public List<News_detail> findById(String title) {
        return news_detailDao.findById(title);
    }

    @Override
    public News_detail Id(long id) {
        return news_detailDao.Id(id);
    }

    @Override
    public int addEnterpriseTalent(News_detail news_detail) {
        return news_detailDao.addEnterpriseTalent(news_detail);
    }

    @Override
    public int updateEnterpriseTalent(News_detail news_detail) {
        return news_detailDao.updateEnterpriseTalent(news_detail);
    }

    @Override
    public int deleteEnterpriseTalent(long id) {
        return news_detailDao.deleteEnterpriseTalent(id);
    }
}
