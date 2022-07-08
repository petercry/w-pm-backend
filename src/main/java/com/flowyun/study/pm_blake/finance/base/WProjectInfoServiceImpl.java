package com.flowyun.study.pm_blake.finance.base;

import com.flowyun.mp.base.BaseService;
import com.flowyun.mp.base.module.AbstractModuleService;
import com.flowyun.study.pm_blake.finance.base.entity.WProjectInfoDO;
import com.flowyun.study.pm_blake.finance.base.entity.WProjectFinanceDTO;
import com.flowyun.study.pm_blake.finance.base.mapper.WProjectInfoMapper;

/**
 * <p>
 * 项目基本信息 服务实现类
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public class WProjectInfoServiceImpl extends AbstractModuleService<WProjectInfoMapper, WProjectFinanceDTO, WProjectInfoDO> implements IWProjectInfoService, BaseService<WProjectInfoDO> {

}
