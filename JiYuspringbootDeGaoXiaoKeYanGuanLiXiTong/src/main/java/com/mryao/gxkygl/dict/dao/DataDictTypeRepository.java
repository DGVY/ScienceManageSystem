package com.mryao.gxkygl.dict.dao;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.dict.entity.DataDictType;

/**
 * @author Mocker
 * @Date 2016-12-10 下午5:01
 * @Version 1.0
 */
public interface DataDictTypeRepository extends BaseRepository<DataDictType> {

    DataDictType findByCode(String code);

    DataDictType findByName(String name);
}