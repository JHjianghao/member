package com.member.dao;

import com.member.pojo.Goods;
import com.member.pojo.Members;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GoodsDaoImpl extends BaseDao implements GoodsDao {
    @Override
    public List<Goods> findAll() {
        String sql = "select * from goods";
        ResultSet resultSet = this.executeQuery(sql, null);
        Goods goods = null;
        List<Goods> list = new ArrayList<>();
        try {
            while (resultSet.next()) {
                goods = new Goods();
                goods.setId(resultSet.getLong(1));
                goods.setName(resultSet.getString(2));
                goods.setPrice(resultSet.getDouble(3));
                list.add(goods);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Goods findById(long id) {
        String sql = "select * from goods where id=?";
        Object[] objects = {id};
        Goods goods = null;
        ResultSet resultSet = this.executeQuery(sql, objects);
        try {
            while (resultSet.next()) {
                goods = new Goods();
                goods.setId(resultSet.getLong(1));
                goods.setName(resultSet.getString(2));
                goods.setPrice(resultSet.getDouble(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return goods;
    }

    @Override
    public int addMembers(Goods goods) {
        int receive = 0;
        String sql = "INSERT into goods VALUES(null,?,?);";
        Object[] objects = {goods.getName(), goods.getPrice()};
        receive = this.executeUpdate(sql, objects);
        return receive;
    }

    @Override
    public int updateMembers(Goods goods) {
        int receive = 0;
        String sql = "UPDATE goods SET name = ?,price = ? WHERE id = ?;";
        Object[] objects = {goods.getName(), goods.getPrice(),goods.getId()};
        receive = this.executeUpdate(sql, objects);
        return receive;
    }

    @Override
    public int deleteMembers(long id) {
        int receive = 0;
        String sql = "DELETE FROM goods WHERE id=?;";
        Object[] objects = {id};
        receive = this.executeUpdate(sql, objects);
        return receive;
    }
}
