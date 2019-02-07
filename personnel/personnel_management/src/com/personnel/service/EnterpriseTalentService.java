package com.personnel.service;

import com.personnel.pojo.EnterpriseTalent;

import java.util.List;

public interface EnterpriseTalentService {
    /**
     * 分页查询
     * @param index
     * @return
     */
    List<EnterpriseTalent> findAll(int index);

    /**
     * 查询数据有多少条
     * @return
     */
    int count();

    /**
     * 查询全部
     * @return
     */
    List<EnterpriseTalent> findAlls();

    /**
     * 查询单条
     * @return
     */
    List<EnterpriseTalent> findById(long departmentId);

    /**
     * 添加
     * @param enterpriseTalent
     * @return
     */
    int addEnterpriseTalent(EnterpriseTalent enterpriseTalent);

    /**
     * 修改
     * @param enterpriseTalent
     * @return
     */
    int updateEnterpriseTalent(EnterpriseTalent enterpriseTalent);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteEnterpriseTalent(long id);
    /**
     * 安照id单条查询
     * @param id
     * @return
     */
    EnterpriseTalent Id(long id);
}
