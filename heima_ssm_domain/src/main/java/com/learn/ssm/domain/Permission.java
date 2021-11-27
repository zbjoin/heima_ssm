package com.learn.ssm.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author ：zb
 * @ClassName ：Permission
 * @description ：资源权限实体类
 * @date ：2021/11/24 14:36
 */
public class Permission implements Serializable {

    private String id;      //主键
    private String permissionName;  //权限名
    private String url;     //资源路径
    private List<Role> roles;   //角色列表

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id='" + id + '\'' +
                ", permissionName='" + permissionName + '\'' +
                ", url='" + url + '\'' +
                ", roles=" + roles +
                '}';
    }
}
