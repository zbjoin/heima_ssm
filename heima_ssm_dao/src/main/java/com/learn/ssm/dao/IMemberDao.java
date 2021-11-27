package com.learn.ssm.dao;

import com.learn.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：zb
 * @interfaceName ：IMemberDao
 * @description ：会员dao
 * @date ：2021/11/23 17:43
 */
public interface IMemberDao {

    //根据id查询会员信息
    @Select("select * from member where id=#{id}")
    public Member findById(Integer id) throws Exception;

}
