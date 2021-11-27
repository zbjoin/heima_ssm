package com.learn.ssm.dao;

import com.learn.ssm.domain.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ：zb
 * @interfaceName ：IPermissionDao
 * @description ：
 * @date ：2021/11/25 21:19
 */
public interface IPermissionDao {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId = #{id})")
    public List<Permission> findPermissionsByRoleId(String id) throws Exception;

    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    @Select("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission) throws Exception;

    @Select("select * from permission where id=#{id}")
    Permission findById(String id)throws Exception;

    @Delete("delete from permission where id = #{id}")
    void deleteById(String id)throws Exception;

    @Delete("delete from role_permission where permissionId = #{id}")
    void deleteFromRole_Permission(String id)throws Exception;
}
