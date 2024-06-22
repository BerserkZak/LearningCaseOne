package dev.berserkzak.learningcaseone.eventlisteners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

public class MobSpawnListener implements Listener {

    @EventHandler
    public void onCreeperSpawn(EntitySpawnEvent e){
        if (e.getEntity() instanceof Creeper creeper) {
            creeper.setPowered(true);
        }
    }

    @EventHandler
    public void onZombieSpawn(EntitySpawnEvent e){
        if (e.getEntity() instanceof Zombie zombie) {
            zombie.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        }
    }

    @EventHandler
    public void onSpiderSpawn(EntitySpawnEvent e){
        if (e.getEntity() instanceof Spider spider) {
            spider.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(5);
        }
    }
}
