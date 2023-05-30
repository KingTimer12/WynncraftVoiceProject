package com.wynnvp.wynncraftvp.sound.at;

import com.wynnvp.wynncraftvp.config.ConfigHandler;
import com.wynnvp.wynncraftvp.npc.NPCHandler;
import com.wynnvp.wynncraftvp.sound.SoundObject;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class SoundAtArmorStand extends MovingSound {

    private final String rawName;

    public SoundAtArmorStand(SoundEvent soundEvent, String rawName, SoundObject soundObject) {
        super(soundEvent, SoundCategory.VOICE);
        this.volume = soundObject.getFallOff() == 0 ? ConfigHandler.blockCutOff / 16f : soundObject.getFallOff() / 16f;
        this.rawName = rawName;
    }

    @Override
    public void update() {
        if (this.rawName.isEmpty()) {
            return;
        }
        NPCHandler.find(rawName).ifPresent(vector -> {
            this.xPosF = vector.x;
            this.zPosF = vector.z;
            this.yPosF = vector.y;
        });
    }


}
