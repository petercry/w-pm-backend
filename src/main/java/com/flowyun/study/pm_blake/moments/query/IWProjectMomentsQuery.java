package com.flowyun.study.pm_blake.moments.query;

import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.mp.base.module.BaseModuleConverter;
import com.flowyun.study.pm_blake.moments.entity.WProjectMomentsDO;
import com.flowyun.study.pm_blake.moments.entity.WProjectMomentsDTO;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public interface IWProjectMomentsQuery extends BaseModuleConverter<WProjectMomentsDTO, WProjectMomentsDO> {


    Collection<WProjectMomentsDTO> queryAll();


    DataPage<WProjectMomentsDTO> queryPage(Integer page, Integer pageNo);
}
