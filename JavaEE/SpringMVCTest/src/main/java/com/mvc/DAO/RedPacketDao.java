package com.mvc.DAO;

import com.mvc.pojo.RedPacket;

public interface RedPacketDao {
    public RedPacket getRedPacket(Long id);
    public int decreaseRedPacket(Long id);
}
