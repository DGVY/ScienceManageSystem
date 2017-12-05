package com.mryao.gxkygl.dict.service.impl;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.common.base.service.Impl.BaseServiceImpl;
import com.mryao.gxkygl.dict.dao.DataDictDetailRepository;
import com.mryao.gxkygl.dict.entity.DataDictDetail;
import com.mryao.gxkygl.dict.service.IDataDictDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouyang
 * @Date 2017-04-10 下午1:03
 * @Description 数据字典明细服务
 * @Version 1.0
 */
@Service
public class DataDictDetailServiceImpl extends BaseServiceImpl<DataDictDetail> implements IDataDictDetailService {

    @Autowired
    private DataDictDetailRepository dataDictDetailRepository;

    public DataDictDetailServiceImpl(BaseRepository<DataDictDetail> repository) {
        super(repository);
    }

    @Override
    public List<DataDictDetail> findByTypeId(String typeId) {
        return dataDictDetailRepository.findByTypeId(typeId);
    }

    @Override
    public DataDictDetail findByNameAndTypeId(String name, String typeId) {
        return dataDictDetailRepository.findByNameAndTypeId(name,typeId);
    }

    @Override
    public DataDictDetail findByCodeAndTypeId(String code, String typeId) {
        return dataDictDetailRepository.findByCodeAndTypeId(code,typeId);
    }
}
