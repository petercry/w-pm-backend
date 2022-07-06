package com.flowyun.study.pm_blake.base;

import com.flowyun.mp.base.BaseService;
import com.flowyun.mp.base.module.AbstractModuleService;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDO;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDTO;
import com.flowyun.study.pm_blake.base.mapper.WProjectInfoMapper;

/**
 * <p>
 * 项目基本信息 服务实现类
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public class WProjectInfoServiceImpl extends AbstractModuleService<WProjectInfoMapper, WProjectInfoDTO, WProjectInfoDO> implements IWProjectInfoService, BaseService<WProjectInfoDO> {

}
