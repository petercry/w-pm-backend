package com.flowyun.study.pm_blake.moments;

import com.flowyun.mp.base.BaseService;
import com.flowyun.mp.base.module.AbstractModuleService;
import com.flowyun.study.pm_blake.moments.entity.WProjectMomentsDO;
import com.flowyun.study.pm_blake.moments.entity.WProjectMomentsDTO;
import com.flowyun.study.pm_blake.moments.mapper.WMomentsMapper;

/**
 * <p>
 * 项目基本信息 服务实现类
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public class WProjectMomentsServiceImpl extends AbstractModuleService<WMomentsMapper, WProjectMomentsDTO, WProjectMomentsDO> implements IWProjectMomentsService, BaseService<WProjectMomentsDO> {

}
