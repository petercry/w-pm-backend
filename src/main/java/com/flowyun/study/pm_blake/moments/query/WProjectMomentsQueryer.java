package com.flowyun.study.pm_blake.moments.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.mp.base.BaseQuery;
import com.flowyun.mp.base.module.AbstractModuleQuery;
import com.flowyun.study.pm_blake.moments.entity.WProjectMomentsDO;
import com.flowyun.study.pm_blake.moments.entity.WProjectMomentsDTO;
import com.flowyun.study.pm_blake.moments.mapper.WMomentsMapper;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口实现类
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public class WProjectMomentsQueryer extends AbstractModuleQuery<WMomentsMapper, WProjectMomentsDTO, WProjectMomentsDO> implements IWProjectMomentsQuery,BaseQuery<WProjectMomentsDO> {

    @Override
    public Collection<WProjectMomentsDTO> queryAll() {
        return this.converter.doBackwardAll(this.list());
    }

    @Override
    public DataPage<WProjectMomentsDTO> queryPage(Integer page, Integer pageNo) {
        IPage<WProjectMomentsDO> page1 = new Page<>(page, pageNo);
        DataPage<WProjectMomentsDO> pageRows = this.page(page1);
        return pageRows.converter(this.converter);
    }
}
