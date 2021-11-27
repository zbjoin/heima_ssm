package com.learn.ssm.service;

import com.learn.ssm.domain.Role;
import com.learn.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：IUserService
 * @description ：UserInfo的Service
 * @date ：2021/11/24 15:04
 */
public interface IUserService extends UserDetailsService {

    List<UserInfo> findAll() throws Exception;

    void save (UserInfo userInfo) throws Exception;

    UserInfo findById(String id) throws Exception;

    List<Role> findOtherRoles(String userId)throws Exception;

    void addRoleToUser(String userId, String[] ids)throws Exception;
}
