package com.mvc.service;

import com.mvc.pojo.RedPacket;

public interface RedPacketService {
    public RedPacket getRedPacket(Long id);
    public int decreaseRedPacket(Long id);
}
