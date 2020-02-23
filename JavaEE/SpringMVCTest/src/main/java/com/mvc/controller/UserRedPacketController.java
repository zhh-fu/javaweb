package com.mvc.controller;

import com.mvc.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/userRedPacket")
public class UserRedPacketController {
    @Autowired
    private UserRedPacketService userRedPacketService = null;

    @RequestMapping("/grapRedPacket")
    @ResponseBody
    public Map<String,Object> grapRedPacket(Long redPacketId,Long userId){
        int result = userRedPacketService.grabRedPacket(redPacketId, userId);
        Map<String,Object> resultMap = new HashMap<String,Object>();
        boolean flag = (result>0);
        resultMap.put("success",flag);
        resultMap.put("message",flag?"成功！":"失败！");
        return resultMap;
    }
}
