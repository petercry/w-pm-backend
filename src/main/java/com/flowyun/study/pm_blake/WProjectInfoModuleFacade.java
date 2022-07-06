package com.flowyun.study.pm_blake;

import com.flowyun.mp.base.module.AbstractModuleManager;
import com.flowyun.study.pm_blake.base.IWProjectInfoService;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDO;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDTO;
import com.flowyun.study.pm_blake.base.query.IWProjectInfoQuery;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 项目基本信息 服务实现类
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
@Component("PmBlakeComponent")
public class WProjectInfoModuleFacade extends AbstractModuleManager<IWProjectInfoService, IWProjectInfoQuery, WProjectInfoDTO, WProjectInfoDO> implements IWProjectInfo {

}
