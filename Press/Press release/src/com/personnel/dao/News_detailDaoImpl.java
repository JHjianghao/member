package com.personnel.dao;

import com.personnel.pojo.News_detail;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class News_detailDaoImpl extends BaseDao implements News_detailDao {
    @Override
    public List<News_detail> findAll(int index) {
        String sql = "select * from news_detail limit ?,3";
        Object[] objects = {index};
        ResultSet resultSet = this.executeQuery(sql, objects);
        News_detail news_detail = null;
        List<News_detail> news_detailList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                news_detail = new News_detail();
                news_detail.setId(resultSet.getLong(1));
                news_detail.setTitle(resultSet.getString(2));
                news_detail.setSummary(resultSet.getString(3));
                news_detail.setAuthor(resultSet.getString(4));
                news_detail.setCreatedate(resultSet.getDate(5));
                news_detailList.add(news_detail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return news_detailList;
    }

    @Override
    /**
     * 查询数据有多少条
     * @return
     */
    public int count() {
        int count = 0;
        String sql = "select count(1) from news_detail";
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
    /**
     * 查询全部
     * @return
     */
    public List<News_detail> findAlls() {
        String sql = "select * from news_detail";
        ResultSet resultSet = this.executeQuery(sql, null);
        News_detail news_detail = null;
        List<News_detail> news_detailList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                news_detail = new News_detail();
                news_detail.setId(resultSet.getLong(1));
                news_detail.setTitle(resultSet.getString(2));
                news_detail.setSummary(resultSet.getString(3));
                news_detail.setAuthor(resultSet.getString(4));
                news_detail.setCreatedate(resultSet.getDate(5));
                news_detailList.add(news_detail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return news_detailList;
    }

    @Override
    /**
     * 查询单条
     * @return
     */
    public List<News_detail> findById(String title) {
        String sql = "select * from news_detail where title like '%" + title + "%'";
        ResultSet resultSet = this.executeQuery(sql, null);
        News_detail news_detail = null;
        List<News_detail> news_detailList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                news_detail = new News_detail();
                news_detail.setId(resultSet.getLong(1));
                news_detail.setTitle(resultSet.getString(2));
                news_detail.setSummary(resultSet.getString(3));
                news_detail.setAuthor(resultSet.getString(4));
                news_detail.setCreatedate(resultSet.getDate(5));
                news_detailList.add(news_detail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return news_detailList;
    }

    @Override
    /**
     * 通过id查询
     */
    public News_detail Id(long id) {
        String sql = "select * from news_detail where id=?";
        Object [] objects = {id};
        ResultSet resultSet = this.executeQuery(sql, objects);
        News_detail news_detail = null;
        try {
            while (resultSet.next()) {
                news_detail = new News_detail();
                news_detail.setId(resultSet.getLong(1));
                news_detail.setTitle(resultSet.getString(2));
                news_detail.setSummary(resultSet.getString(3));
                news_detail.setAuthor(resultSet.getString(4));
                news_detail.setCreatedate(resultSet.getDate(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return news_detail;
    }

    @Override
    /**
     * 添加
     * @param news_detail
     * @return
     */
    public int addEnterpriseTalent(News_detail news_detail) {
        int number = 0;
        String sql = "insert into news_detail values(default,?,?,?,default)";
        Object[] objects = { news_detail.getTitle(),news_detail.getSummary(),news_detail.getAuthor()};
        number = this.executeUpdate(sql, objects);
        return number;
    }

    @Override
    /**
     * 修改
     * @param air_quality_index
     * @return
     */
    public int updateEnterpriseTalent(News_detail news_detail) {
        int number = 0;
        String sql = "update news_detail set title=?,summary=?,author=? where id=?";
        Object[] objects = {news_detail.getTitle(),news_detail.getSummary(),
                news_detail.getAuthor(),news_detail.getId()};
        number = this.executeUpdate(sql, objects);
        return number;
    }

    @Override
    public int deleteEnterpriseTalent(long id) {
        int number = 0;
        String sql = "delete from news_detail where id=?";
        Object[] objects = {id};
        number = this.executeUpdate(sql, objects);
        return number;
    }
}
