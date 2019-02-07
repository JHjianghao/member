package com.personnel.service;

import com.personnel.dao.DepartmentDao;
import com.personnel.dao.DepartmentDaoImpl;
import com.personnel.pojo.Department;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao = new DepartmentDaoImpl();
    @Override
    public List<Department> findAll(int index) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<Department> findAlls() {
        return departmentDao.findAlls();
    }

    @Override
    public List<Department> findById(long id) {
        return null;
    }

    @Override
    public int addDepartment(Department department) {
        return 0;
    }

    @Override
    public int updateDepartment(Department department) {
        return 0;
    }

    @Override
    public int deleteDepartment(long id) {
        return 0;
    }
}
