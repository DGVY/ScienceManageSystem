package com.mryao.gxkygl.project.dto;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/25 16:53
 * @Description: 成员
 * @Version: 1.0
 */
public class Member {

    //成员名字
    private String memberName;

    //电话
    private String phone;

    public static String toJsons(List<Member> memberList){
        return JSON.toJSONString(memberList);
    }

    public static List<Member> toMembers(String memberJSONs){
        return JSON.parseArray(memberJSONs,Member.class);
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


