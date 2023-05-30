package com.wynnvp.wynncraftvp.networking;

import com.wynnvp.wynncraftvp.networking.annotations.ListenPacket;
import com.wynnvp.wynncraftvp.networking.packet.VOWPacket;
import net.minecraft.network.Packet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class PacketManager {

    public static PacketManager register(PacketIncoming<?> packetIncoming) {
        return new PacketManager(packetIncoming);
    }

    private final PacketIncoming<?> INCOMING;

    public PacketManager(PacketIncoming<?> INCOMING) {
        this.INCOMING = INCOMING;
    }

    @SafeVarargs
    public final void on(Class<? extends VOWPacket>... packets) {
        Packet<?> packetIncoming = INCOMING.getPacket();
        Optional.ofNullable(packetIncoming).ifPresent(packet -> {
            Arrays.stream(packets)
                    .forEach(packetArray -> Arrays.stream(packetArray.getMethods())
                            .filter(method -> method.isAnnotationPresent(ListenPacket.class))
                            .filter(method -> packet.getClass() == method.getParameterTypes()[0])
                            .forEach(method -> {
                                try {
                                    method.invoke(packetArray.newInstance(), packet);
                                } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                                    e.printStackTrace();
                                }
                            }));
        });
    }

}
