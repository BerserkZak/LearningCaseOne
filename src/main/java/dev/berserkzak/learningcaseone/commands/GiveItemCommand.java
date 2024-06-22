package dev.berserkzak.learningcaseone.commands;

import dev.berserkzak.learningcaseone.LearningCaseOne;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class GiveItemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if (sender instanceof Player) {

            Material materialType = Material.getMaterial(LearningCaseOne.getInstance().getConfig().getString("custom_iron_sword.type"));
            int materialAmount = LearningCaseOne.getInstance().getConfig().getInt("custom_iron_sword.amount");
            String materialName = LearningCaseOne.getInstance().getConfig().getString("custom_iron_sword.name");

            ItemStack itemStack = new ItemStack(materialType, materialAmount);
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName(materialName);
            itemStack.setItemMeta(itemMeta);

            ((Player) sender).getInventory().addItem(itemStack);
        }
        return false;
    }
}
