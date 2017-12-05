package com.mryao.gxkygl.dict.service;


import com.mryao.gxkygl.common.base.service.IBaseService;
import com.mryao.gxkygl.dict.entity.DataDictDetail;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhouyang
 * @Date 2017-04-10 下午1:02
 * @Description 字典服务
 * @Version 1.0
 */
public interface IDataDictDetailService extends IBaseService<DataDictDetail> {

    /**
     * 根据id查询数据字典明细
     * @param id
     * @return
     */
    @Override
    DataDictDetail findById(Serializable id);

    /**
     * 根据字典类别id获取
     * @param typeId
     * @return
     */
    List<DataDictDetail> findByTypeId(String typeId);

    /**
     * 根据名称查询字典明细
     * @param name name
     * @return
     */
    DataDictDetail findByNameAndTypeId(String name, String typeId);

    /**
     * 根据code查询字典明细
     * @param name
     * @param typeId
     * @return
     */
    DataDictDetail findByCodeAndTypeId(String name, String typeId);

    /**
     * 保存字典明细
     * @param DataDictDetail
     * @return
     */
    DataDictDetail save(DataDictDetail DataDictDetail);

    /**
     * 更新字典类型
     * @param dataDictDetail
     * @return
     */
    DataDictDetail update(DataDictDetail dataDictDetail);

}
