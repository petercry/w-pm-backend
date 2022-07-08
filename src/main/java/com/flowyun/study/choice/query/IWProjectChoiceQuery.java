package com.flowyun.study.choice.query;

import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.mp.base.module.BaseModuleConverter;
import com.flowyun.study.choice.entity.WProjectChoiceDO;
import com.flowyun.study.choice.entity.WProjectChoiceDTO;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public interface IWProjectChoiceQuery extends BaseModuleConverter<WProjectChoiceDTO, WProjectChoiceDO> {


    Collection<WProjectChoiceDTO> queryAll();


    DataPage<WProjectChoiceDTO> queryPage(Integer page, Integer pageNo);
}
