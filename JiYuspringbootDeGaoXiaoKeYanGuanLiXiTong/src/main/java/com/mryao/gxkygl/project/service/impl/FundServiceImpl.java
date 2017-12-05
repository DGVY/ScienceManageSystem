package com.mryao.gxkygl.project.service.impl;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.common.base.service.Impl.BaseServiceImpl;
import com.mryao.gxkygl.project.entity.Fund;
import com.mryao.gxkygl.project.service.IFundService;
import org.springframework.stereotype.Service;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/30 10:53
 * @Description:
 * @Version: 1.0
 */
@Service
public class FundServiceImpl extends BaseServiceImpl<Fund> implements IFundService {
    public FundServiceImpl(BaseRepository<Fund> repository) {
        super(repository);
    }
}
