package com.learn.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author ：zb
 * @ClassName ：BCryptPasswordEncoderUtils
 * @description ：
 * @date ：2021/11/25 11:40
 */
public class BCryptPasswordEncoderUtils extends BCryptPasswordEncoder {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password = "123";
        String encode = bCryptPasswordEncoder.encode(password);
        //$2a$10$k1OHN3Onpf/Mejr3cmWhFekHToRTvYWUZkPwAqrJjbZn8zBWrKaTq
        //$2a$10$6pu1SzfCrPaxrrBgc2gef.WyZotABknPt///Bez7xaXNCk0pC2vvS
        System.out.println(encode);
        System.out.println(encode.length());
    }

}
