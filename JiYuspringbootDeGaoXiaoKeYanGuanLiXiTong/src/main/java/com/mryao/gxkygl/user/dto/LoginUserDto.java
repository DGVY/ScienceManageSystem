package com.mryao.gxkygl.user.dto;

import com.mryao.gxkygl.user.entity.Role;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/15 16:50
 * @Description:
 * @Version: 1.0
 */
public class LoginUserDto implements Serializable{

    private SecurityUserDto securityUserDto;

    private Set<String> perCodes;

    private List<Role> roles;

    public LoginUserDto() {
    }

    public LoginUserDto(SecurityUserDto securityUserDto, Set<String> perCodes, List<Role> roles) {
        this.securityUserDto = securityUserDto;
        this.perCodes = perCodes;
        this.roles = roles;
    }

    public SecurityUserDto getSecurityUserDto() {
        return securityUserDto;
    }

    public void setSecurityUserDto(SecurityUserDto securityUserDto) {
        this.securityUserDto = securityUserDto;
    }

    public Set<String> getPerCodes() {
        return perCodes;
    }

    public void setPerCodes(Set<String> perCodes) {
        this.perCodes = perCodes;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
