package com.flowyun.study.pmdemo;

import com.flowyun.study.pmdemo.base.entity.WProjectInfoDO;
import com.flowyun.study.pmdemo.base.entity.WProjectInfoDTO;
import com.flowyun.study.pmdemo.base.IWProjectInfoService;
import com.flowyun.study.pmdemo.base.query.IWProjectInfoQuery;
import com.flowyun.mp.base.module.AbstractModuleManager;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 项目基本信息 服务实现类
 * </p>
 *
 * @author peter
 * @since 2022-06-09
 */
@Component
public class WProjectInfoModuleFacade extends AbstractModuleManager<IWProjectInfoService, IWProjectInfoQuery, WProjectInfoDTO, WProjectInfoDO> implements IWProjectInfo {

}
