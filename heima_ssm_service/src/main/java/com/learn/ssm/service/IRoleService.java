package com.learn.ssm.service;

import com.learn.ssm.domain.Permission;
import com.learn.ssm.domain.Role;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：IRoleService
 * @description ：Role角色Service
 * @date ：2021/11/25 20:35
 */
public interface IRoleService {

    List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String id) throws Exception;

    void deleteRoleById(String roleId) throws Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
