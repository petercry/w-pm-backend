package com.flowyun.study.pmdemo.base.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.study.pmdemo.base.entity.WProjectInfoDO;
import com.flowyun.study.pmdemo.base.entity.WProjectInfoDTO;
import com.flowyun.study.pmdemo.base.mapper.WProjectInfoMapper;
import com.flowyun.mp.base.BaseQuery;
import com.flowyun.mp.base.module.AbstractModuleQuery;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口实现类
 * </p>
 *
 * @author peter
 * @since 2022-06-09
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
