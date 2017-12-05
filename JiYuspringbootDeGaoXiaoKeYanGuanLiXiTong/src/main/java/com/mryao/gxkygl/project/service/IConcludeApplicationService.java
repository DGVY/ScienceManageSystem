package com.mryao.gxkygl.project.service;

import com.mryao.gxkygl.common.base.service.IBaseService;
import com.mryao.gxkygl.project.entity.ConcludeApplication; /**
 * @author: yaohuaiying
 * @Date: 2017/10/30 18:03
 * @Description:
 * @Version: 1.0
 */
public interface IConcludeApplicationService extends IBaseService<ConcludeApplication>{
    /**
     * 结题申请
     * @param concludeApplication
     * @return
     */
    ConcludeApplication toApplication(ConcludeApplication concludeApplication);

    /**
     * 结题通过
     * @param concludeApplication
     * @return
     */
    ConcludeApplication applicationPass(ConcludeApplication concludeApplication);

    /**
     * 结题未通过
     * @param concludeApplication
     * @return
     */
    ConcludeApplication applicationNotPass(ConcludeApplication concludeApplication);
}
