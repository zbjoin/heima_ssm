package com.learn.ssm.domain;

/**
 * @author ：zb
 * @ClassName ：Member
 * @description ：会员信息
 * @date ：2021/11/23 3:39
 */
public class Member {

    private Integer id; //主键
    private String name;    //姓名
    private String nickname;    //昵称
    private String phoneNum;    //电话号码
    private String email;    //邮箱

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
