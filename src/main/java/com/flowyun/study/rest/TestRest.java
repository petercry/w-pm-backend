package com.flowyun.study.rest;

import com.flowyun.boot.framework.v2.result.RestResult;
import com.flowyun.study.pmdemo.IWProjectInfo;
import com.flowyun.study.pmdemo.base.entity.WProjectInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/test")
public class TestRest {
    @Autowired
    private IWProjectInfo iwProjectInfo;
    @GetMapping("/query")
    public RestResult query(){
        Collection<WProjectInfoDTO> list = iwProjectInfo.getQueryer().queryAll();
        return RestResult.success(list);
    }

}
