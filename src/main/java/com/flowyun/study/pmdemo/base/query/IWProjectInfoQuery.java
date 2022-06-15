package com.flowyun.study.pmdemo.base.query;

import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.study.pmdemo.base.entity.WProjectInfoDO;
import com.flowyun.study.pmdemo.base.entity.WProjectInfoDTO;
import com.flowyun.mp.base.module.BaseModuleConverter;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口
 * </p>
 *
 * @author peter
 * @since 2022-06-09
 */
public interface IWProjectInfoQuery  extends BaseModuleConverter<WProjectInfoDTO, WProjectInfoDO> {


    Collection<WProjectInfoDTO> queryAll();


    DataPage<WProjectInfoDTO> queryPage(Integer page, Integer pageNo);
}
