package com.mryao.gxkygl.user.service.impl;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.common.base.service.Impl.BaseServiceImpl;
import com.mryao.gxkygl.user.dao.UserRepository;
import com.mryao.gxkygl.user.dao.UserRoleRepository;
import com.mryao.gxkygl.user.entity.UserRole;
import com.mryao.gxkygl.user.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/7 14:11
 * @Description:
 * @Version: 1.0
 */
@Service
public class UserRoleServiceImpl extends BaseServiceImpl<UserRole> implements IUserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(BaseRepository<UserRole> repository) {
        super(repository);
    }

    @Override
    public Set<String> findRoleIdsByUserId(String id) {
        return userRoleRepository.findByUserId(id);
    }
}
