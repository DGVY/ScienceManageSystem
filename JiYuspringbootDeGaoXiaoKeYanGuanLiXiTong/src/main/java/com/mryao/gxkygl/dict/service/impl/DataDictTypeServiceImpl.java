package com.mryao.gxkygl.dict.service.impl;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.common.base.service.Impl.BaseServiceImpl;
import com.mryao.gxkygl.dict.dao.DataDictTypeRepository;
import com.mryao.gxkygl.dict.entity.DataDictType;
import com.mryao.gxkygl.dict.service.IDataDictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/22 12:21
 * @Description:
 * @Version: 1.0
 */
@Service
public class DataDictTypeServiceImpl extends BaseServiceImpl<DataDictType> implements IDataDictTypeService {

    @Autowired
    private DataDictTypeRepository dataDictTypeRepository;

    public DataDictTypeServiceImpl(BaseRepository<DataDictType> repository) {
        super(repository);
    }

    @Override
    public DataDictType findByCode(String code) {
        return dataDictTypeRepository.findByCode(code);
    }

    @Override
    public DataDictType findByName(String name) {
        return dataDictTypeRepository.findByName(name);
    }
}
