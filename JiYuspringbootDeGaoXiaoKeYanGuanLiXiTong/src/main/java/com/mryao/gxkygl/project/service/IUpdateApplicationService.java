package com.mryao.gxkygl.project.service;

import com.mryao.gxkygl.common.base.service.IBaseService;
import com.mryao.gxkygl.project.entity.UpdateApplication;

/**
 * @author: yaohuaiying
 * @Date: 2017/10/30 18:01
 * @Description:
 * @Version: 1.0
 */
public interface IUpdateApplicationService extends IBaseService<UpdateApplication> {

    /**
     * 变更申请通过
     * @param updateApplication
     * @return
     */
    UpdateApplication applicationPass(UpdateApplication updateApplication);

    /**
     * 申请变更
     * @param updateApplication
     * @return
     */
    UpdateApplication toApplication(UpdateApplication updateApplication);

    /**
     * 变更申请未通过
     * @param updateApplication
     * @return
     */
    UpdateApplication applicationNotPass(UpdateApplication updateApplication);
}
