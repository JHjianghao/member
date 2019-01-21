package com.member.util;

import com.member.dao.GoodsDao;
import com.member.dao.GoodsDaoImpl;
import com.member.pojo.Goods;
import com.member.pojo.Members;
import com.member.service.MembersService;
import com.member.service.MemdersServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Judge {
    public static Map<Long,String> judges(){
        MembersService membersService = new MemdersServiceImpl();
        GoodsDao goods = new GoodsDaoImpl();
        Map<Long, String> map = new HashMap<>();
        List<Goods> goodsList=goods.findAll();
        List<Members> membersList=membersService.findAll();
        for (Goods goodsLists:goodsList){
            for (Members membersLists:membersList){
                if (membersLists.getGoodsId()==goodsLists.getId()){
                    map.put(membersLists.getGoodsId(),goodsLists.getName());
                }
            }
        }
        return map;
    }
}
