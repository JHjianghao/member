package com.personnel.service;

import com.personnel.dao.EnterpriseTalentDao;
import com.personnel.dao.EnterpriseTalentDaoImpl;
import com.personnel.pojo.EnterpriseTalent;

import java.util.List;

public class EnterpriseTalentServiceImpl implements EnterpriseTalentService {
    private EnterpriseTalentDao enterpriseTalentDao = new EnterpriseTalentDaoImpl();
    @Override
    public List<EnterpriseTalent> findAll(int index) {
        return enterpriseTalentDao.findAll(index);
    }

    @Override
    public int count() {
        return enterpriseTalentDao.count();
    }

    @Override
    public List<EnterpriseTalent> findAlls() {
        return enterpriseTalentDao.findAlls();
    }

    @Override
    public List<EnterpriseTalent> findById(long departmentId) {
        return enterpriseTalentDao.findById(departmentId);
    }

    @Override
    public int addEnterpriseTalent(EnterpriseTalent enterpriseTalent) {
        return enterpriseTalentDao.addEnterpriseTalent(enterpriseTalent);
    }

    @Override
    public int updateEnterpriseTalent(EnterpriseTalent enterpriseTalent) {
        return enterpriseTalentDao.updateEnterpriseTalent(enterpriseTalent);
    }

    @Override
    public int deleteEnterpriseTalent(long id) {
        return enterpriseTalentDao.deleteEnterpriseTalent(id);
    }

    @Override
    public EnterpriseTalent Id(long id) {
        return enterpriseTalentDao.Id(id);
    }
}
