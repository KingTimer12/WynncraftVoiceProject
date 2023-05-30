package com.wynnvp.wynncraftvp.networking;

import com.wynnvp.wynncraftvp.networking.packet.custom.VOWPacketEntity;
import com.wynnvp.wynncraftvp.networking.packet.custom.VOWPacketEntityMetadata;
import com.wynnvp.wynncraftvp.networking.packet.custom.VOWPacketEntityTeleport;
import com.wynnvp.wynncraftvp.networking.packet.custom.VOWPacketEntityVelocity;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;

public class PacketIncoming<T extends Packet<?>> {

    final T packet;
    final NetHandlerPlayClient playClient;
    final ChannelHandler handler;
    final ChannelHandlerContext ctx;

    public PacketIncoming(T packet, NetHandlerPlayClient playClient, ChannelHandler handler, ChannelHandlerContext ctx) {
        this.packet = packet;
        this.playClient = playClient;
        this.handler = handler;
        this.ctx = ctx;
    }

    public Packet<?> getPacket() {
        Packet<?> packet = null;
        switch (this.packet.getClass().getSimpleName()) {
            case "SPacketEntity":
                packet = new VOWPacketEntity();
                break;
            case "SPacketEntityMetadata":
                packet = new VOWPacketEntityMetadata();
                break;
            case "SPacketEntityTeleport":
                packet = new VOWPacketEntityTeleport();
                break;
            case "SPacketEntityVelocity":
                packet = new VOWPacketEntityVelocity();
                break;
        }
        return packet;
    }

    public ChannelInboundHandler getHandler() {
        return (ChannelInboundHandler) handler;
    }

    public void emulateRead(Packet<?> packet) {
        try {
            ((ChannelInboundHandler) handler).channelRead(ctx, packet);
        } catch (Exception ignored) {
        }
    }

    public void transform(Packet<?> to) {
        emulateRead(to);
    }

}
