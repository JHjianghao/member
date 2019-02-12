package com.personnel.dao;

import com.personnel.pojo.News_comment;
import com.personnel.pojo.News_detail;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class News_commentDaoImpl extends BaseDao implements News_commentDao {
    @Override
    /**
     * 分页查询
     *
     * @param index
     * @return
     */
    public List<News_comment> findAll(int index) {
        String sql = "select * from news_comment limit ?,3";
        Object[] objects = {index};
        ResultSet resultSet = this.executeQuery(sql, objects);
        News_comment news_comment = null;
        List<News_comment> news_commentList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                news_comment = new News_comment();
                news_comment.setId(resultSet.getLong(1));
                news_comment.setNewsid(resultSet.getLong(2));
                news_comment.setContent(resultSet.getString(3));
                news_comment.setAuthor(resultSet.getString(4));
                news_comment.setCreatedate(resultSet.getDate(5));
                news_commentList.add(news_comment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return news_commentList;
    }

    @Override
    public int count() {
        int count = 0;
        String sql = "select count(1) from news_comment";
        ResultSet resultSet = executeQuery(sql, null);
        try {
            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<News_comment> findAlls() {
        return null;
    }

    @Override
    public List<News_comment> findById(long districtId) {
        return null;
    }

    @Override
    public List<News_comment> Id(long newsid) {
        String sql = "select * from news_comment where newsid=?";
        Object [] objects = {newsid};
        ResultSet resultSet = this.executeQuery(sql, objects);
        List<News_comment> news_commentList = new ArrayList<>();
        News_comment news_comment = null;
        try {
            while (resultSet.next()) {
                news_comment = new News_comment();
                news_comment.setId(resultSet.getLong(1));
                news_comment.setNewsid(resultSet.getLong(2));
                news_comment.setContent(resultSet.getString(3));
                news_comment.setAuthor(resultSet.getString(4));
                news_comment.setCreatedate(resultSet.getDate(5));
                news_commentList.add(news_comment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return news_commentList;
    }

    @Override
    public int addEnterpriseTalent(News_comment news_comment) {
        int number = 0;
        String sql = "insert into news_comment values(default,?,?,?,default)";
        Object[] objects = { news_comment.getNewsid(),news_comment.getContent(),news_comment.getAuthor()};
        number = this.executeUpdate(sql, objects);
        return number;
    }

    @Override
    public int updateEnterpriseTalent(News_comment news_comment) {
        return 0;
    }

    @Override
    public int deleteEnterpriseTalent(long newsid) {
        int number = 0;
        String sql = "delete from news_comment where newsid=?";
        Object[] objects = {newsid};
        number = this.executeUpdate(sql, objects);
        return number;
    }
}
