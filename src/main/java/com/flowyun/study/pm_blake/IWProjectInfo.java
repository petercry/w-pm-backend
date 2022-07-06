package com.flowyun.study.pm_blake;

import com.flowyun.mp.base.module.IModuleManager;
import com.flowyun.study.pm_blake.base.IWProjectInfoService;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDTO;
import com.flowyun.study.pm_blake.base.query.IWProjectInfoQuery;

/**
 * <p>
 * 项目基本信息 管理接口
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public interface IWProjectInfo  extends IModuleManager<IWProjectInfoService, IWProjectInfoQuery, WProjectInfoDTO> {

}
