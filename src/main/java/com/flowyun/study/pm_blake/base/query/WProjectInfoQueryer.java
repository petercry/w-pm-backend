package com.flowyun.study.pm_blake.base.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.mp.base.BaseQuery;
import com.flowyun.mp.base.module.AbstractModuleQuery;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDO;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDTO;
import com.flowyun.study.pm_blake.base.mapper.WProjectInfoMapper;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口实现类
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public class WProjectInfoQueryer  extends AbstractModuleQuery<WProjectInfoMapper, WProjectInfoDTO, WProjectInfoDO> implements IWProjectInfoQuery,BaseQuery<WProjectInfoDO> {

    @Override
    public Collection<WProjectInfoDTO> queryAll() {
        return this.converter.doBackwardAll(this.list());
    }

    @Override
    public DataPage<WProjectInfoDTO> queryPage(Integer page, Integer pageNo) {
        IPage<WProjectInfoDO> page1 = new Page<>(page, pageNo);
        DataPage<WProjectInfoDO> pageRows = this.page(page1);
        return pageRows.converter(this.converter);
    }
}
