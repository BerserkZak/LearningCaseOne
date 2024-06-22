package dev.berserkzak.learningcaseone;

import dev.berserkzak.learningcaseone.commands.GiveItemCommand;
import dev.berserkzak.learningcaseone.commands.HelloCommand;
import dev.berserkzak.learningcaseone.eventlisteners.MobSpawnListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class LearningCaseOne extends JavaPlugin {

    private static Plugin instance;

    public static Plugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new MobSpawnListener(), this);
        getCommand("sayHello").setExecutor(new HelloCommand());
        getCommand("giveItem").setExecutor(new GiveItemCommand());
    }

    @Override
    public void onDisable() {
    }
}
