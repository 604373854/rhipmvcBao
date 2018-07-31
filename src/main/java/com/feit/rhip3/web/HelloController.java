package com.feit.rhip3.web;

import com.feit.rhip3.core.config.SysConfig;
import com.feit.rhip3.domain.User;
import com.feit.rhip3.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private SysConfig sysConfig;
    @Autowired
    private UserService userService;

    @ApiOperation(value="index测试", notes="主要测试")
    @ApiImplicitParam(name = "str", value = "字符串信息", required = true, dataType = "String")
    @RequestMapping(value = "/index/{str}",method = RequestMethod.GET)
    public String index(@PathVariable String str) throws Exception{
        User user=userService.findByName(str);
//        System.out.println(sysConfig.getAaa());
//        if(1==1){
//            throw new Exception("1111111");
//        }
        return "你好=>"+(user==null?"":user.toString());
    }
}
