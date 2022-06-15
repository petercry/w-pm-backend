package com.flowyun.study.rest;

import com.flowyun.boot.framework.entity.result.DataPage;
import com.flowyun.boot.framework.utils.AssertUtils;
import com.flowyun.boot.framework.utils.ValidatorProfiles;
import com.flowyun.boot.framework.v2.result.RestResult;
import com.flowyun.study.pmdemo.IWProjectInfo;
import com.flowyun.study.pmdemo.base.entity.WProjectInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/pmdemo")
public class PmDemoRest {
    @Autowired
    private IWProjectInfo iwProjectInfo;
    /*
    查询所有项目记录
     */
    @GetMapping("/query")
    public RestResult query(){
        Collection<WProjectInfoDTO> list = iwProjectInfo.getQueryer().queryAll();
        return RestResult.success(list);
    }

    @PostMapping("/add")
    public RestResult add(@RequestBody WProjectInfoDTO dto){
        Boolean flag = iwProjectInfo.save(dto);
        return RestResult.success(flag);
    }

    @GetMapping("/page")
    public RestResult queryPage(@RequestParam("page") Integer page, @RequestParam("pageNo") Integer pageNo){
        DataPage<WProjectInfoDTO> pageRows = iwProjectInfo.getQueryer().queryPage(page, pageNo);
        return RestResult.success(pageRows);
    }

    @PostMapping("/updateById")
    public RestResult updateById(@RequestBody WProjectInfoDTO dto){
        AssertUtils.validate(dto, ValidatorProfiles.UPDATE);
        Boolean flag = iwProjectInfo.updateById(dto);
        return RestResult.success(flag);
    }

    @PostMapping("/delete")
    public RestResult delete(@RequestParam("id") Long id){
        boolean flag = iwProjectInfo.removeById(id);
        return RestResult.success(flag);
    }
}
