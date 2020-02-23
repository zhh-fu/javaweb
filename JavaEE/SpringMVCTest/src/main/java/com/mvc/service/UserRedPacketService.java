package com.mvc.service;

import com.mvc.pojo.UserRedPacket;

public interface UserRedPacketService {
    public int grabRedPacket(Long redPacketId,Long userId);
}
