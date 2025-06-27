package com.LIS.demo.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping
public class LoadController {


    @GetMapping("/load")
    void showLoadPage(){
        //生成一个非对称密钥，将公钥交给web页面，把登陆用户密码用md5加密后，再使用非对称加密，再post


    }

    @PostMapping("/loading")
    void load(@RequestParam(name="UserName",defaultValue = "empty",required = true) String name,
              @RequestParam(name="pwdMD5",defaultValue = "empty",required = true)String pwdMD5){


    }
}
