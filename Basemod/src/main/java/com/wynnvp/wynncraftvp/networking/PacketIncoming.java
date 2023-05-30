package com.wynnvp.wynncraftvp.networking;

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

    public T getPacket() {
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
