package com.flowyun.study.choice.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.mp.base.BaseQuery;
import com.flowyun.mp.base.module.AbstractModuleQuery;
import com.flowyun.study.choice.mapper.WProjectChoiceMapper;
import com.flowyun.study.choice.entity.WProjectChoiceDO;
import com.flowyun.study.choice.entity.WProjectChoiceDTO;

import java.util.Collection;

/**
 * <p>
 * 项目基本信息 查询接口实现类
 * </p>
 *
 * @author blake
 * @since 2022-06-21
 */
public class WProjectChoiceQueryer extends AbstractModuleQuery<WProjectChoiceMapper, WProjectChoiceDTO, WProjectChoiceDO> implements IWProjectChoiceQuery,BaseQuery<WProjectChoiceDO> {

    @Override
    public Collection<WProjectChoiceDTO> queryAll() {
        return this.converter.doBackwardAll(this.list());
    }

    @Override
    public DataPage<WProjectChoiceDTO> queryPage(Integer page, Integer pageNo) {
        IPage<WProjectChoiceDO> page1 = new Page<>(page, pageNo);
        DataPage<WProjectChoiceDO> pageRows = this.page(page1);
        return pageRows.converter(this.converter);
    }
}
