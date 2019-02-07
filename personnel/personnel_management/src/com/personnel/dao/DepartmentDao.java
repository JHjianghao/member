package com.personnel.dao;

import com.personnel.pojo.Department;
import com.personnel.pojo.EnterpriseTalent;

import java.util.List;

public interface DepartmentDao {
    /**
     * 分页查询
     * @param index
     * @return
     */
    List<Department> findAll(int index);

    /**
     * 查询数据有多少条
     * @return
     */
    int count();

    /**
     * 查询全部
     * @return
     */
    List<Department> findAlls();

    /**
     * 查询单条
     * @return
     */
    List<Department> findById(long id);

    /**
     * 添加
     * @param department
     * @return
     */
    int addDepartment(Department department);

    /**
     * 修改
     * @param department
     * @return
     */
    int updateDepartment(Department department);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteDepartment(long id);
}
