package com.flowyun.study.rest;

import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.boot.framework.utils.AssertUtils;
import com.flowyun.boot.framework.utils.ValidatorProfiles;
import com.flowyun.boot.framework.v2.result.RestResult;
import com.flowyun.study.pm_blake.IWProjectInfo;
import com.flowyun.study.pm_blake.base.entity.WProjectInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/pm_blake")

public class PmRest {
    @Autowired
    private IWProjectInfo iwProjectInfo;
    /*
     * 查询全部项目列表
     * */
    @GetMapping("/query")
    public RestResult query(){
        Collection<WProjectInfoDTO> list = iwProjectInfo.getQueryer().queryAll();
        return RestResult.success(list);
    }
    /*
     * 添加项目
     * */
    @PostMapping("/add")
    public RestResult add(@RequestBody WProjectInfoDTO dto){
        Boolean flag = iwProjectInfo.save(dto);
        return RestResult.success(flag);
    }
    /*
     * 获取项目列表（带分页）
     * */
    @GetMapping("/page")
    public RestResult queryPage(@RequestParam("page") Integer page, @RequestParam("pageNo") Integer pageNo){
        DataPage<WProjectInfoDTO> pageRows = iwProjectInfo.getQueryer().queryPage(page, pageNo);
        return RestResult.success(pageRows);
    }
    /*
     * 修改项目
     * */
    @PostMapping("/updateById")
    public RestResult updateById(@RequestBody WProjectInfoDTO dto){
        AssertUtils.validate(dto, ValidatorProfiles.UPDATE);
        Boolean flag = iwProjectInfo.updateById(dto);
        return RestResult.success(flag);
    }
    /*
     * 删除项目
     * */
    @PostMapping("/delete")
    public RestResult delete(@RequestParam("id") Long id){
        boolean flag = iwProjectInfo.removeById(id);
        return RestResult.success(flag);
    }
}


