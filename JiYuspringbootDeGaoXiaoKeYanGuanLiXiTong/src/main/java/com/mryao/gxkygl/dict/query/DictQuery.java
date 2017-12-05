package com.mryao.gxkygl.dict.query;

import com.mryao.gxkygl.common.query.Filter;
import com.mryao.gxkygl.common.query.Query;
import org.springframework.util.StringUtils;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/30 15:51
 * @Description:
 * @Version: 1.0
 */
public class DictQuery extends Query {

    private String name;

    private String code;

    private String typeId;


    @Override
    public void generateCondition() {
        if(!StringUtils.isEmpty(name)){
            addFilter(new Filter("name", Filter.Operator.eq,name));
        }
        if(!StringUtils.isEmpty(code)){
            addFilter(new Filter("code",Filter.Operator.eq,code));
        }
        if(!StringUtils.isEmpty(typeId)){
            addFilter(new Filter("typeId",Filter.Operator.eq,typeId));
        }
    }
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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
}
