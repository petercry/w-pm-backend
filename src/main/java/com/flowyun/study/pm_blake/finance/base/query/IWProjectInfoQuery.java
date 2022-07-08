package com.flowyun.study.pm_blake.finance.base.query;

import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.mp.base.module.BaseModuleConverter;
import com.flowyun.study.pm_blake.finance.base.entity.WProjectInfoDO;
import com.flowyun.study.pm_blake.finance.base.entity.WProjectFinanceDTO;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public interface IWProjectInfoQuery  extends BaseModuleConverter<WProjectFinanceDTO, WProjectInfoDO> {


    Collection<WProjectFinanceDTO> queryAll();


    DataPage<WProjectFinanceDTO> queryPage(Integer page, Integer pageNo);
}
