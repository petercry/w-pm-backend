package com.flowyun.study.pm_blake.finance.contract.query;

import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.mp.base.module.BaseModuleConverter;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDO;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDTO;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public interface IWProjectContractQuery extends BaseModuleConverter<WProjectInfoDTO, WProjectInfoDO> {


    Collection<WProjectInfoDTO> queryAll();


    DataPage<WProjectInfoDTO> queryPage(Integer page, Integer pageNo);
}
