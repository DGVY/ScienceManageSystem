package com.mryao.gxkygl.dict.view;


import com.mryao.gxkygl.common.base.V;
import com.mryao.gxkygl.dict.entity.DataDictDetail;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author zhouyang
 * @Date 2017-04-12 下午1:10
 * @Description 用户视图
 * @Version 1.0
 */
public class DataDictTypeView {

    private String id;

    /**
     * 字典类型名称
     */
    @Size(min = 1,max = 50,groups = {V.Save.class},message = "字典类型名称[1,50]")
    @NotBlank(groups = {V.Save.class},message = "字典类型名称不能为空")
    private String name;

    /**
     * 字典类型code
     */
    @Size(min = 1,max = 50,groups = {V.Save.class},message = "字典类型code[1,50]")
    @NotBlank(groups = {V.Save.class},message = "字典类型code不能为空")
    private String code;

    private List<DataDictDetail> dataDictDetails;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataDictDetail> getDataDictDetails() {
        return dataDictDetails;
    }

    public void setDataDictDetails(List<DataDictDetail> dataDictDetails) {
        this.dataDictDetails = dataDictDetails;
    }
}
