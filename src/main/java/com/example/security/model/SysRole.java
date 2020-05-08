package com.example.security.model;

import java.util.List;


public class SysRole {


    private List<SysPermission> permissionList;

    public List<SysPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<SysPermission> permissionList) {
        this.permissionList = permissionList;
    }
}
