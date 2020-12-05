package mounderfod.foodgloriousfood;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class FGFMain implements ModInitializer {

    public static final ItemGroup FGF_ITEMS = FabricItemGroupBuilder.build(
            new Identifier("fgf", "general"),
            () -> new ItemStack(Items.COOKED_BEEF));

    @Override
    public void onInitialize() {
        FGFFoodItems.init();
    }
}
