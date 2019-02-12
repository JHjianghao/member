package com.personnel.service;

import com.personnel.dao.News_commentDao;
import com.personnel.dao.News_commentDaoImpl;
import com.personnel.pojo.News_comment;

import java.util.List;

public class News_commentServiceImpl implements News_commentService {
    private News_commentDao news_commentDao = new News_commentDaoImpl();
    @Override
    public List<News_comment> findAll(int index) {
        return news_commentDao.findAll(index);
    }

    @Override
    public int count() {
        return news_commentDao.count();
    }

    @Override
    public List<News_comment> findAlls() {
        return news_commentDao.findAlls();
    }

    @Override
    public List<News_comment> findById(long districtId) {
        return news_commentDao.findById(districtId);
    }

    @Override
    public List<News_comment> Id(long newsid) {
        return news_commentDao.Id(newsid);
    }

    @Override
    public int addEnterpriseTalent(News_comment news_comment) {
        return news_commentDao.addEnterpriseTalent(news_comment);
    }

    @Override
    public int updateEnterpriseTalent(News_comment news_comment) {
        return news_commentDao.updateEnterpriseTalent(news_comment);
    }

    @Override
    public int deleteEnterpriseTalent(long newsid) {
        return news_commentDao.deleteEnterpriseTalent(newsid);
    }
}
