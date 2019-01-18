package com.member.dao;

import com.member.pojo.Goods;
import com.member.pojo.Members;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MembersDaoImpl extends BaseDao implements MembersDao {
    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<Members> findAll() {
        String sql = "select * from members";
        ResultSet resultSet = this.executeQuery(sql, null);
        Members members = null;
        List<Members> list = new ArrayList<>();
        try {
            while (resultSet.next()) {
                members = new Members();
                members.setId(resultSet.getLong(1));
                members.setMemberNumber(resultSet.getLong(2));
                members.setNickName(resultSet.getString(3));
                members.setCreateTime(resultSet.getDate(4));
                members.setGoodsId(resultSet.getInt(5));
                list.add(members);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 通过会员号查询
     *
     * @param MemberNumber
     * @return
     */
    @Override
    public List<Members> findById(long MemberNumber) {
        String sql = "select *  members where id = ?";
        Object[] objects = {MemberNumber};
        ResultSet resultSet = this.executeQuery(sql, objects);
        Members members = null;
        List<Members> list = new ArrayList<>();
        try {
            while (resultSet.next()) {
                members = new Members();
                members.setId(resultSet.getLong(1));
                members.setMemberNumber(resultSet.getLong(2));
                members.setNickName(resultSet.getString(3));
                members.setCreateTime(resultSet.getDate(4));
                members.setGoodsId(resultSet.getInt(5));
                list.add(members);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 添加
     *
     * @param members
     * @return
     */
    @Override
    public int addMembers(Members members) {
        int receive = 0;
        String sql = "INSERT into members VALUES(null,?,?,?,?);";
        Object[] objects = {members.getMemberNumber(), members.getNickName(), members.getCreateTime(), members.getGoodsId()};
        receive = this.executeUpdate(sql, objects);
        return receive;
    }

    /**
     * 修改
     *
     * @param members
     * @return
     */
    @Override
    public int updateMembers(Members members) {
        int receive = 0;
        String sql = "UPDATE members SET memberNumber = ?,nickName = ? ,createTime = ?,goodsId=? WHERE id = ?;";
        Object[] objects = {members.getMemberNumber(), members.getNickName(), members.getCreateTime(), members.getGoodsId(),members.getId()};
        receive = this.executeUpdate(sql, objects);
        return receive;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteMembers(long id) {
        int receive = 0;
        String sql = "DELETE FROM members WHERE id=?;";
        Object[] objects = {id};
        receive = this.executeUpdate(sql, objects);
        return receive;
    }

    /**
     *查看购买的商品
     * @return
     */
    @Override
    public Goods listGoods(long goodsId) {
        String sql = "select * from goods where id=?";
        Object[] objects = {goodsId};
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
}
