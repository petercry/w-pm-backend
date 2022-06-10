package com.flowyun.study.pmdemo;

import com.flowyun.study.pmdemo.base.entity.WProjectInfoDTO;
import com.flowyun.study.pmdemo.base.IWProjectInfoService;
import com.flowyun.study.pmdemo.base.query.IWProjectInfoQuery;
import com.flowyun.mp.base.module.IModuleManager;

/**
 * <p>
 * 项目基本信息 管理接口
 * </p>
 *
 * @author peter
 * @since 2022-06-09
 */
public interface IWProjectInfo  extends IModuleManager<IWProjectInfoService, IWProjectInfoQuery, WProjectInfoDTO> {

}
