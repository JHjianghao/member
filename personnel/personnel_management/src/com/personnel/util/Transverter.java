package com.personnel.util;

import com.personnel.dao.DepartmentDao;
import com.personnel.dao.DepartmentDaoImpl;
import com.personnel.dao.EnterpriseTalentDao;
import com.personnel.dao.EnterpriseTalentDaoImpl;
import com.personnel.pojo.Department;
import com.personnel.pojo.EnterpriseTalent;
import com.personnel.service.DepartmentService;
import com.personnel.service.DepartmentServiceImpl;
import com.personnel.service.EnterpriseTalentService;
import com.personnel.service.EnterpriseTalentServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transverter {
    public static Map<Long,String> transverterS(){
        EnterpriseTalentService enterpriseTalent = new EnterpriseTalentServiceImpl();
        DepartmentService department = new DepartmentServiceImpl();
        Map<Long ,String> map =new HashMap<>();
        List<Department> departmentList = new ArrayList<>();
        List<EnterpriseTalent> enterpriseTalentList = new ArrayList<>();
        departmentList = department.findAlls();
        enterpriseTalentList = enterpriseTalent.findAlls();
        for (Department department1:departmentList){
            for (EnterpriseTalent enterpriseTalent1:enterpriseTalentList){
                if (enterpriseTalent1.getDepartmentId()==department1.getId()){
                    map.put(enterpriseTalent1.getDepartmentId(),department1.getName());
                }
            }
        }
        return map;
    }
    public static Map<String,Long> transverterR(){
        EnterpriseTalentService enterpriseTalent = new EnterpriseTalentServiceImpl();
        DepartmentService department = new DepartmentServiceImpl();
        Map<String ,Long> maps =new HashMap<>();
        List<Department> departmentList = new ArrayList<>();
        List<EnterpriseTalent> enterpriseTalentList = new ArrayList<>();
        departmentList = department.findAlls();
        enterpriseTalentList = enterpriseTalent.findAlls();
        for (Department department1:departmentList){
            for (EnterpriseTalent enterpriseTalent1:enterpriseTalentList){
                if (enterpriseTalent1.getDepartmentId()==department1.getId()){
                    maps.put(department1.getName(),enterpriseTalent1.getDepartmentId());
                }
            }
        }
        return maps;
    }
}
