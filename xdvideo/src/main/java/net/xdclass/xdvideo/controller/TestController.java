package net.xdclass.xdvideo.controller;

import net.xdclass.xdvideo.config.WeChatConfig;
import net.xdclass.xdvideo.domain.JsonData;
import net.xdclass.xdvideo.domain.Video;
import net.xdclass.xdvideo.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @RequestMapping("test")
//    public String test(){
//        return "hello world!666";
//    }

    @Autowired
    private WeChatConfig weChatConfig;

    @RequestMapping("test_config")
    public JsonData testControl(){
        System.out.println(weChatConfig.getAppId());
        return JsonData.buildSuccess(weChatConfig.getAppId());
    }

    @Autowired
    private VideoMapper videoMapper;

    @RequestMapping("test_db")
    public Object test_db(){
        return videoMapper.findAll();
    }
}
