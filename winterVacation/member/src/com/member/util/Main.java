package com.member.util;

import com.member.pojo.Collect;
import com.member.pojo.Goods;
import com.member.pojo.Members;
import com.member.service.MembersService;
import com.member.service.MemdersServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] arge) {
       /* MembersService membersService = new MemdersServiceImpl();
        System.out.println(membersService.findAll(3));
        List<Members> membersList = null;
        List<Goods> goodsList = null;
        List<Collect> collectList = new ArrayList<Collect>();
        Collect collect = null;
        Map<Long, String> map = new HashMap<>();
        map = Judge.judges();
        membersList = membersService.findAll(3);
        for (Members members : membersList) {
            if (members != null) {
                collect = new Collect();
                System.out.println(123);
                System.out.println("-------" + members.getId() + "--------");
                collect.setId(members.getId());
                System.out.println(collect.getId() + "121312134");
                collect.setCreateTime(members.getCreateTime());
                collect.setName(map.get(members.getGoodsId()));
                System.out.println(collect.getName());
                collect.setNickName(members.getNickName());
                collect.setMemberNumber(members.getMemberNumber());
                collectList.add(collect);
            }
        }
        System.out.println(collectList);*/
       MembersService membersService=new MemdersServiceImpl();
       long a=9;
       long b=1;
       membersService.addMembers(a,"哈哈",b);
    }
}
