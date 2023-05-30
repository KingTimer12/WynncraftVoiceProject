package com.wynnvp.wynncraftvp.sound;

import com.wynnvp.wynncraftvp.ModCore;
import com.wynnvp.wynncraftvp.config.ConfigHandler;
import com.wynnvp.wynncraftvp.npc.NPCHandler;
import com.wynnvp.wynncraftvp.npc.QuestMarkHandler;
import com.wynnvp.wynncraftvp.sound.at.SoundAtArmorStand;
import com.wynnvp.wynncraftvp.sound.at.SoundAtPlayer;
import com.wynnvp.wynncraftvp.sound.line.LineData;
import com.wynnvp.wynncraftvp.sound.line.LineReporter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class SoundPlayer {

    private final List<String> latestSoundPlayed;
    private final LineReporter lineReporter;

    public SoundPlayer() {
        latestSoundPlayed = new ArrayList<>();
        lineReporter = new LineReporter();
    }

    //Code that is run to play all the sounds
    public void playSound(LineData lineData) {
        String line = lineData.getSoundLine();
        SoundsHandler soundsHandler = ModCore.instance.soundsHandler;
        if (!soundsHandler.get(line).isPresent()) {
            // System.out.println("Does not contain line: " + lineData.getRealLine());
            lineReporter.MissingLine(lineData);
            return;
        }
        if (isOnCoolDown(line)) {
            System.out.println("Sound: " + line + " is on cooldown.");
            return;
        }

        if (Minecraft.getMinecraft().player == null) {
            System.out.println("Player is null! Sound not played.");
            return;
        }

        if (Minecraft.getMinecraft().world == null) {
            System.out.println("World is null! Sound not played.");
            return;
        }

        //System.out.println("Playing sound: " + line);
        Minecraft.getMinecraft().getSoundHandler().stopSounds();
        soundsHandler.get(line).ifPresent(sound -> {
            final CustomSoundClass customSoundClass = sound.getCustomSoundClass();
            final SoundEvent soundEvent = customSoundClass.getSoundEvent();

            //If this sound contains info about a location to play it at
            if (sound.getPosition() != null){
                Vector3 posAsVector3 = sound.getPosition();
                Vec3d soundPos = new Vec3d(posAsVector3.x, posAsVector3.y, posAsVector3.z);
                playSoundAtCords(soundPos, sound);
                return;
            }

            //Solves ArmorStand problem with ??? as name
            //WARNING: not yet tested
            QuestMarkHandler.put(getQuest(sound.getId()));

             if (customSoundClass.isMovingSound() || ConfigHandler.playAllSoundsOnPlayer) {
                //Play the sound at the player
                Minecraft.getMinecraft().getSoundHandler().playSound(new SoundAtPlayer(soundEvent));
                addSoundToCoolDown(line);
                return;
            }

            String rawName = getRawName(sound.getId());
            if (NPCHandler.getNamesHandlers().containsKey(rawName)) {
                NPCHandler.find(rawName).ifPresent(vector -> {
                    if (Minecraft.getMinecraft().player.getDistanceSq(vector.x, vector.y, vector.z) >= ConfigHandler.blockCutOff * ConfigHandler.blockCutOff) {
                        playSoundAtCords(Minecraft.getMinecraft().player.getPositionVector(), sound);
                    } else {
                        Minecraft.getMinecraft().getSoundHandler().playSound(new SoundAtArmorStand(soundEvent, rawName, sound));
                    }
                });
            } else {
                playSoundAtCords(Minecraft.getMinecraft().player.getPositionVector(), sound);
            }
            addSoundToCoolDown(line);
        });
    }

    private void playSoundAtCords(Vec3d blockPos, SoundObject soundObject) {
        SoundEvent soundEvent = soundObject.getCustomSoundClass().getSoundEvent();
        EntityPlayerSP player = Minecraft.getMinecraft().player;
        float volume = soundObject.getFallOff() == 0 ? ConfigHandler.blockCutOff / 16f : soundObject.getFallOff() / 16f;
        player.getEntityWorld().playSound(blockPos.x, blockPos.y, blockPos.z, soundEvent, SoundCategory.VOICE, volume, 1, false);
    }

    private String getQuest(String id) {
        String result = "none";
        if (id.contains("-")) {
            String[] args = id.split("-");
            result = args[0];
        }
        return result;
    }

    private String getRawName(String name) {
        return ModCore.instance.soundsHandler.findNPCName(name);
    }

    private void addSoundToCoolDown(String soundName) {
        if (latestSoundPlayed.size() >= ConfigHandler.maxCoolDownLines) {
            latestSoundPlayed.remove(0);
        }
        latestSoundPlayed.add(soundName);
    }

    private boolean isOnCoolDown(String soundName) {
        return latestSoundPlayed.contains(soundName);
    }

    public void clearCoolDown() {
        latestSoundPlayed.clear();
    }

}
