package com.personnel.dao;

import com.personnel.pojo.Department;
import com.personnel.pojo.EnterpriseTalent;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl extends BaseDao implements DepartmentDao {
    @Override
    /**
     * 分页查询
     * @param index
     * @return
     */
    public List<Department> findAll(int index) {
        return null;
    }

    @Override
    /**
     * 查询数据有多少条
     * @return
     */
    public int count() {
        return 0;
    }

    @Override
    /**
     * 查询全部
     * @return
     */
    public List<Department> findAlls() {
        String sql = "select * from department";
        ResultSet resultSet = this.executeQuery(sql, null);
        Department department=null;
        List<Department> departmentlist = new ArrayList<>();
        try {
            while (resultSet.next()){
                department = new Department();
                department.setId(resultSet.getLong(1));
                department.setName(resultSet.getString(2));
                departmentlist.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departmentlist;
    }

    @Override
    /**
     * 查询单条
     * @return
     */
    public List<Department> findById(long id) {
        return null;
    }

    @Override
    /**
     * 添加
     * @param department
     * @return
     */
    public int addDepartment(Department department) {
        return 0;
    }

    @Override
    /**
     * 修改
     * @param department
     * @return
     */
    public int updateDepartment(Department department) {
        return 0;
    }

    @Override
    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteDepartment(long id) {
        return 0;
    }
}
