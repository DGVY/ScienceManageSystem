package com.mryao.gxkygl.dict.dao;

import com.mryao.gxkygl.common.base.dao.BaseRepository;
import com.mryao.gxkygl.dict.entity.DataDictDetail;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mocker
 * @Date 2016-12-10 下午5:01
 * @Version 1.0
 */
@Service
public interface DataDictDetailRepository extends BaseRepository<DataDictDetail> {

    List<DataDictDetail> findByTypeId(String typeId);

    DataDictDetail findByCodeAndTypeId(String code, String typeId);

    DataDictDetail findByNameAndTypeId(String name, String typeId);

}