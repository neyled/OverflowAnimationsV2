package cc.polyfrost.overflowanimations.config;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Checkbox;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.config.migration.VigilanceMigrator;
import cc.polyfrost.oneconfig.config.migration.VigilanceName;
import cc.polyfrost.overflowanimations.OverflowAnimations;

@SuppressWarnings("unused")
public class OldAnimationsSettings extends Config {

    @Switch(
            name = "1.7 2D Items",
            subcategory = "2D Items"
    )
    public static boolean items2D = false;

    @Checkbox(
            name = "1.7 Microextent 2D Sprites",
            subcategory = "2D Items"
    )
    public static boolean itemSprites = true;

    @Checkbox(
            name = "1.7 Microextent Projectile Sprites",
            subcategory = "2D Items"
    )
    public static boolean projectileSprites = true;

    @Switch(
            name = "1.7 Enchantment Glint",
            subcategory = "Enchantment Glint"
    )
    public static boolean enchantmentGlint = true;

    @Switch(
            name = "1.15+ New Armor Enchantment Glint",
            subcategory = "Enchantment Glint"
    )
    public static boolean enchantmentGlintNew = true;

    @Switch(name = "1.7 Item Positions", subcategory = "Position")
    @VigilanceName(name = "1.7 Item Position", category = "Animations", subcategory = "Position")
    public static boolean oldModel = true;

    @Switch(name = "1.7 Bow Pullback", subcategory = "Position")
    @VigilanceName(name = "1.7 Bow Pullback", category = "Animations", subcategory = "Position")
    public static boolean oldBow = true;

    @Switch(name = "1.7 Block Animation", subcategory = "Position")
    @VigilanceName(name = "1.7 Block Animation", category = "Animations", subcategory = "Position")
    public static boolean oldSwordBlock = true;

    @Switch(name = "1.7 Rod Position", subcategory = "Position")
    @VigilanceName(name = "1.7 Rod Position", category = "Animations", subcategory = "Position")
    public static boolean oldRod = true;

    @Switch(name = "1.7 3rd Person Block Animation", subcategory = "Position")
    @VigilanceName(name = "1.7 3rd Person Block Animation", category = "Animations", subcategory = "Position")
    public static boolean oldSwordBlock3 = true;

    @Switch(name = "1.7 Item Transformations", description = "Whether to apply 1.7 item transformations. Turn off to use resource packs that modify item transformations.", subcategory = "Position")
    public static boolean itemTransformations = true;

    @Switch(
            name = "1.7 Mixces First Person Item / Block Hand Positions",
            subcategory = "Position"
    )
    public static boolean mixcesFirstPersonAnimations = true;

    @Switch(
            name = "1.7 Mixces Third Person Item / Block Hand Positions",
            subcategory = "Position"
    )
    public static boolean mixcesAnimations = true;

    @Checkbox(
            name = "1.7 Mixces First Person Carpet Position",
            subcategory = "Position"
    )
    public static boolean firstPersonCarpetPosition = false;

    @Switch(
            name = "1.7 Projectiles",
            subcategory = "Position"
    )
    public static boolean oldProjectiles = true;

    @Switch(name = "1.7 Consume Animation", subcategory = "Interaction")
    @VigilanceName(name = "1.7 Consume Animation", category = "Animations", subcategory = "Interaction")
    public static boolean oldEating = true;

    @Switch(name = "1.7 Block-Hitting Animation", subcategory = "Interaction")
    @VigilanceName(name = "1.7 Block-Hitting Animation", category = "Animations", subcategory = "Interaction")
    public static boolean oldBlockhitting = true;

    @Switch(name = "1.7 Smoother Sneaking", subcategory = "Interaction")
    @VigilanceName(name = "1.7 Smoother Sneaking", category = "Animations", subcategory = "Interaction")
    public static boolean smoothSneaking = true;

    @Switch(name = "1.7 Longer Unsneak", subcategory = "Interaction")
    @VigilanceName(name = "1.7 Longer Unsneak", category = "Animations", subcategory = "Interaction")
    public static boolean longSneaking = true;

    @Switch(name = "1.7 Red Armor Tint", subcategory = "Interaction")
    @VigilanceName(name = "1.7 Red Armor Tint", category = "Animations", subcategory = "Interaction")
    public static boolean redArmor = true;

    @Switch(name = "1.7 Punching During Usage", subcategory = "Interaction")
    @VigilanceName(name = "1.7 Punching During Usage", category = "Animations", subcategory = "Interaction")
    public static boolean punching = true;

    @Checkbox(
            name = "1.7 Punching During Usage Particles", description = "Spawns Particles whilst Punching During Usage",
            subcategory = "Interaction"
    )
    public static boolean punchingParticles = true;

    @Switch(name = "1.7 Item Switching Animation", subcategory = "Interaction")
    @VigilanceName(name = "1.7 Item Switching Animation", category = "Animations", subcategory = "Interaction")
    public static boolean itemSwitch = true;

    @Switch(name = "Remove Health Bar Flashing", subcategory = "HUD")
    @VigilanceName(name = "Remove Health Bar Flashing", category = "Animations", subcategory = "HUD")
    public static boolean oldHealth = true;

    @Switch(name = "Remove Debug Screen Background", subcategory = "HUD")
    @VigilanceName(name = "Debug Screen", category = "Animations", subcategory = "HUD")
    public static boolean oldDebugScreen = true;

    @Switch(name = "Remove Debug Screen Crosshair", subcategory = "HUD")
    public static boolean oldDebugCrosshair = true;

    @Switch(name = "Remove Tab Menu Heads", subcategory = "HUD")
    @VigilanceName(name = "Tab Overlay", category = "Animations", subcategory = "HUD")
    public static boolean oldTab;

    @Switch(name = "Disable Punch During Usage in Adventure Mode", subcategory = "World")
    public static boolean adventurePunching = false;

    @Switch(name = "Disable Punching Particles During Usage in Adventure Mode", subcategory = "World")
    public static boolean adventureParticles = false;

    public OldAnimationsSettings() {
        super(new Mod(OverflowAnimations.NAME, ModType.PVP, "/overflowanimations_dark.svg", new VigilanceMigrator("./config/sk1eroldanimations.toml")), "overflowanimations.json");
        initialize();
        addDependency("firstPersonCarpetPosition", "mixcesAnimations");
        addDependency("itemSprites", "items2D");
        addDependency("projectileSprites", "oldProjectiles");
        addDependency("mixcesFirstPersonAnimations", "itemTransformations");
        addDependency("oldRod", "itemTransformations");
        addDependency("punchingParticles", "punching");
        addDependency("adventureParticles", "punchingParticles");
    }
}
