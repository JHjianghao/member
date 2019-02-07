package com.personnel.dao;

import com.personnel.pojo.EnterpriseTalent;
import com.personnel.util.Transverter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EnterpriseTalentDaoImpl extends BaseDao implements EnterpriseTalentDao {

    @Override
    /**
     * 分页查询
     * @param index
     * @return
     */
    public List<EnterpriseTalent> findAll(int index) {
        String sql = "select * from enterpriseTalent limit ?,3";
        Object[] objects = {index};
        ResultSet resultSet = this.executeQuery(sql, objects);
        EnterpriseTalent enterpriseTalent = null;
        List<EnterpriseTalent> enterpriseTalentlist = new ArrayList<>();
        try {
            while (resultSet.next()) {
                enterpriseTalent = new EnterpriseTalent();
                enterpriseTalent.setId(resultSet.getLong(1));
                enterpriseTalent.setName(resultSet.getString(2));
                enterpriseTalent.setWorkingLife(resultSet.getLong(3));
                enterpriseTalent.setWorkExperience(resultSet.getString(4));
                enterpriseTalent.setPersonalProfile(resultSet.getString(5));
                enterpriseTalent.setDepartmentId(resultSet.getLong(6));
                enterpriseTalent.setGraduateSchool(resultSet.getString(7));
                enterpriseTalentlist.add(enterpriseTalent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return enterpriseTalentlist;
    }

    @Override
    /**
     * 查询数据有多少条
     * @return
     */
    public int count() {
        int count = 0;
        String sql = "select count(1) from enterpriseTalent";
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
    public List<EnterpriseTalent> findAlls() {
        String sql = "select * from enterpriseTalent";
        ResultSet resultSet = this.executeQuery(sql, null);
        EnterpriseTalent enterpriseTalent = null;
        List<EnterpriseTalent> enterpriseTalentlist = new ArrayList<>();
        try {
            while (resultSet.next()) {
                enterpriseTalent = new EnterpriseTalent();
                enterpriseTalent.setId(resultSet.getLong(1));
                enterpriseTalent.setName(resultSet.getString(2));
                enterpriseTalent.setWorkingLife(resultSet.getLong(3));
                enterpriseTalent.setWorkExperience(resultSet.getString(4));
                enterpriseTalent.setPersonalProfile(resultSet.getString(5));
                enterpriseTalent.setDepartmentId(resultSet.getLong(6));
                enterpriseTalent.setGraduateSchool(resultSet.getString(7));
                enterpriseTalentlist.add(enterpriseTalent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return enterpriseTalentlist;
    }

    @Override
    /**
     * 查询单条
     * @return
     */
    public List<EnterpriseTalent> findById(long departmentId) {
        String sql = "select * from enterpriseTalent where departmentId like '%" + departmentId + "%'";
        ResultSet resultSet = this.executeQuery(sql, null);
        EnterpriseTalent enterpriseTalent = null;
        List<EnterpriseTalent> enterpriseTalentlist = new ArrayList<>();
        try {
            while (resultSet.next()) {
                enterpriseTalent = new EnterpriseTalent();
                enterpriseTalent.setId(resultSet.getLong(1));
                enterpriseTalent.setName(resultSet.getString(2));
                enterpriseTalent.setWorkingLife(resultSet.getLong(3));
                enterpriseTalent.setWorkExperience(resultSet.getString(4));
                enterpriseTalent.setPersonalProfile(resultSet.getString(5));
                enterpriseTalent.setDepartmentId(resultSet.getLong(6));
                enterpriseTalent.setGraduateSchool(resultSet.getString(7));
                enterpriseTalentlist.add(enterpriseTalent);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return enterpriseTalentlist;
    }

    @Override
    public EnterpriseTalent Id(long id) {
        String sql = "select * from enterpriseTalent where id=?";
        Object[] objects = {id};
        ResultSet resultSet = this.executeQuery(sql, objects);
        EnterpriseTalent enterpriseTalent = null;
        try {
            while (resultSet.next()) {
                enterpriseTalent = new EnterpriseTalent();
                enterpriseTalent.setId(resultSet.getLong(1));
                enterpriseTalent.setName(resultSet.getString(2));
                enterpriseTalent.setWorkingLife(resultSet.getLong(3));
                enterpriseTalent.setWorkExperience(resultSet.getString(4));
                enterpriseTalent.setPersonalProfile(resultSet.getString(5));
                enterpriseTalent.setDepartmentId(resultSet.getLong(6));
                enterpriseTalent.setGraduateSchool(resultSet.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return enterpriseTalent;
    }

    @Override
    /**
     * 添加
     * @param enterpriseTalent
     * @return
     */
    public int addEnterpriseTalent(EnterpriseTalent enterpriseTalent) {
        int number = 0;
        String sql = "insert into enterpriseTalent values(default,?,?,?,?,?,?)";
        Object[] objects = {enterpriseTalent.getName(), enterpriseTalent.getWorkingLife(),
                enterpriseTalent.getWorkExperience(), enterpriseTalent.getPersonalProfile(),
                enterpriseTalent.getDepartmentId(), enterpriseTalent.getGraduateSchool()};
        number = this.executeUpdate(sql, objects);
        return number;
    }

    @Override
    /**
     * 修改
     * @param enterpriseTalent
     * @return
     */
    public int updateEnterpriseTalent(EnterpriseTalent enterpriseTalent) {
        int number = 0;
        String sql = "update enterpriseTalent set name=?,workingLife=?," +
                "workExperience=?,personalProfile=?,departmentId=?,graduateSchool=? where id=?";
        Object[] objects = {enterpriseTalent.getName(), enterpriseTalent.getWorkingLife(),
                enterpriseTalent.getWorkExperience(), enterpriseTalent.getPersonalProfile(),
                enterpriseTalent.getDepartmentId(), enterpriseTalent.getGraduateSchool(),
                enterpriseTalent.getId()};
        number = this.executeUpdate(sql, objects);
        return number;
    }

    @Override
    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteEnterpriseTalent(long id) {
        int number = 0;
        String sql = "delete from enterpriseTalent where id=?";
        Object[] objects = {id};
        number = this.executeUpdate(sql, objects);
        return number;
    }
}
