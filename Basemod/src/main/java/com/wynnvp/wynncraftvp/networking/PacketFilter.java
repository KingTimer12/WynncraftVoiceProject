package com.wynnvp.wynncraftvp.networking;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;

public class PacketFilter extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg == null) return;

        PacketIncoming<? extends Packet<?>> incoming = new PacketIncoming<>((Packet<?>) msg, Minecraft.getMinecraft().getConnection(), this, ctx);
        PacketManager.register(incoming).on(null);
        super.channelRead(ctx, msg);
    }
}
