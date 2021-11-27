package com.learn.ssm.service;

import com.learn.ssm.domain.Permission;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：IPermissionService
 * @description ：资源权限Service
 * @date ：2021/11/25 21:15
 */
public interface IPermissionService {

    List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;

    Permission findById(String id)throws Exception;

    void deleteById(String id)throws Exception;
}
