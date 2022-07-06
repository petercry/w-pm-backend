package com.flowyun.study.pmdemo.base;

import com.flowyun.study.pmdemo.base.entity.WProjectInfoDO;
import com.flowyun.study.pmdemo.base.entity.WProjectInfoDTO;
import com.flowyun.study.pmdemo.base.mapper.WProjectInfoMapperDemo;
import com.flowyun.mp.base.BaseService;
import com.flowyun.mp.base.module.AbstractModuleService;

/**
 * <p>
 * 项目基本信息 服务实现类
 * </p>
 *
 * @author peter
 * @since 2022-06-09
 */
public class WProjectInfoServiceImpl extends AbstractModuleService<WProjectInfoMapperDemo, WProjectInfoDTO, WProjectInfoDO> implements IWProjectInfoService, BaseService<WProjectInfoDO> {

}
