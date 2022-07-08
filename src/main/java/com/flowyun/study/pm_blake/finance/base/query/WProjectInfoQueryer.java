package com.flowyun.study.pm_blake.finance.base.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.mp.base.BaseQuery;
import com.flowyun.mp.base.module.AbstractModuleQuery;
import com.flowyun.study.pm_blake.finance.base.entity.WProjectInfoDO;
import com.flowyun.study.pm_blake.finance.base.entity.WProjectFinanceDTO;
import com.flowyun.study.pm_blake.finance.base.mapper.WProjectInfoMapper;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口实现类
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public class WProjectInfoQueryer  extends AbstractModuleQuery<WProjectInfoMapper, WProjectFinanceDTO, WProjectInfoDO> implements IWProjectInfoQuery,BaseQuery<WProjectInfoDO> {

    @Override
    public Collection<WProjectFinanceDTO> queryAll() {
        return this.converter.doBackwardAll(this.list());
    }

    @Override
    public DataPage<WProjectFinanceDTO> queryPage(Integer page, Integer pageNo) {
        IPage<WProjectInfoDO> page1 = new Page<>(page, pageNo);
        DataPage<WProjectInfoDO> pageRows = this.page(page1);
        return pageRows.converter(this.converter);
    }
}
