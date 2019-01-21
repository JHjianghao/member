package com.member.util;

import com.member.service.MembersService;
import com.member.service.MemdersServiceImpl;

public class Main {
    public static void main (String[] arge){
        MembersService membersService = new MemdersServiceImpl();
        System.out.println( membersService.findAll());
    }
}
