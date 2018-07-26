import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

public class MaterialUtil {

	public static DyeColor getDyeColor(Material type){
		for(DyeColor color : DyeColor.values()){
			if(type.toString().startsWith(color.toString())) return color;
		}
		return DyeColor.WHITE;
	}

	public static EntityType getSpawnEggType(Material type){
		try {
			return EntityType.valueOf(type.toString().split("_SPAWN_EGG")[0]);
		} catch (Exception e){
		}
		return null;
	}

	public static boolean isSpawnEgg(Material type){
		return type.toString().contains("_SPAWN_EGG");
	}

	public static Material getSpawnEgg(EntityType type){
		return Material.getMaterial(type.toString()+"_SPAWN_EGG");
	}

	public static Material getBanner(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_BANNER;
			case ORANGE: return Material.ORANGE_BANNER;
			case MAGENTA: return Material.MAGENTA_BANNER;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_BANNER;
			case YELLOW: return Material.YELLOW_BANNER;
			case LIME: return Material.LIME_BANNER;
			case PINK: return Material.PINK_BANNER;
			case GRAY: return Material.GRAY_BANNER;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_BANNER;
			case CYAN: return Material.CYAN_BANNER;
			case PURPLE: return Material.PURPLE_BANNER;
			case BLUE: return Material.BLUE_BANNER;
			case BROWN: return Material.BROWN_BANNER;
			case GREEN: return Material.GREEN_BANNER;
			case RED: return Material.RED_BANNER;
			case BLACK: return Material.BLACK_BANNER;
		}
		return Material.WHITE_BANNER;
	}

	public static Material getBed(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_BED;
			case ORANGE: return Material.ORANGE_BED;
			case MAGENTA: return Material.MAGENTA_BED;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_BED;
			case YELLOW: return Material.YELLOW_BED;
			case LIME: return Material.LIME_BED;
			case PINK: return Material.PINK_BED;
			case GRAY: return Material.GRAY_BED;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_BED;
			case CYAN: return Material.CYAN_BED;
			case PURPLE: return Material.PURPLE_BED;
			case BLUE: return Material.BLUE_BED;
			case BROWN: return Material.BROWN_BED;
			case GREEN: return Material.GREEN_BED;
			case RED: return Material.RED_BED;
			case BLACK: return Material.BLACK_BED;
		}
		return Material.WHITE_BED;
	}

	public static Material getCarpet(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_CARPET;
			case ORANGE: return Material.ORANGE_CARPET;
			case MAGENTA: return Material.MAGENTA_CARPET;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_CARPET;
			case YELLOW: return Material.YELLOW_CARPET;
			case LIME: return Material.LIME_CARPET;
			case PINK: return Material.PINK_CARPET;
			case GRAY: return Material.GRAY_CARPET;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_CARPET;
			case CYAN: return Material.CYAN_CARPET;
			case PURPLE: return Material.PURPLE_CARPET;
			case BLUE: return Material.BLUE_CARPET;
			case BROWN: return Material.BROWN_CARPET;
			case GREEN: return Material.GREEN_CARPET;
			case RED: return Material.RED_CARPET;
			case BLACK: return Material.BLACK_CARPET;
		}
		return Material.WHITE_CARPET;
	}

	public static Material getConcrete(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_CONCRETE;
			case ORANGE: return Material.ORANGE_CONCRETE;
			case MAGENTA: return Material.MAGENTA_CONCRETE;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_CONCRETE;
			case YELLOW: return Material.YELLOW_CONCRETE;
			case LIME: return Material.LIME_CONCRETE;
			case PINK: return Material.PINK_CONCRETE;
			case GRAY: return Material.GRAY_CONCRETE;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_CONCRETE;
			case CYAN: return Material.CYAN_CONCRETE;
			case PURPLE: return Material.PURPLE_CONCRETE;
			case BLUE: return Material.BLUE_CONCRETE;
			case BROWN: return Material.BROWN_CONCRETE;
			case GREEN: return Material.GREEN_CONCRETE;
			case RED: return Material.RED_CONCRETE;
			case BLACK: return Material.BLACK_CONCRETE;
		}
		return Material.WHITE_CONCRETE;
	}

	public static Material getConcretePowder(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_CONCRETE_POWDER;
			case ORANGE: return Material.ORANGE_CONCRETE_POWDER;
			case MAGENTA: return Material.MAGENTA_CONCRETE_POWDER;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_CONCRETE_POWDER;
			case YELLOW: return Material.YELLOW_CONCRETE_POWDER;
			case LIME: return Material.LIME_CONCRETE_POWDER;
			case PINK: return Material.PINK_CONCRETE_POWDER;
			case GRAY: return Material.GRAY_CONCRETE_POWDER;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_CONCRETE_POWDER;
			case CYAN: return Material.CYAN_CONCRETE_POWDER;
			case PURPLE: return Material.PURPLE_CONCRETE_POWDER;
			case BLUE: return Material.BLUE_CONCRETE_POWDER;
			case BROWN: return Material.BROWN_CONCRETE_POWDER;
			case GREEN: return Material.GREEN_CONCRETE_POWDER;
			case RED: return Material.RED_CONCRETE_POWDER;
			case BLACK: return Material.BLACK_CONCRETE_POWDER;
		}
		return Material.WHITE_CONCRETE_POWDER;
	}

	public static Material getGlazedTerracotta(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_GLAZED_TERRACOTTA;
			case ORANGE: return Material.ORANGE_GLAZED_TERRACOTTA;
			case MAGENTA: return Material.MAGENTA_GLAZED_TERRACOTTA;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_GLAZED_TERRACOTTA;
			case YELLOW: return Material.YELLOW_GLAZED_TERRACOTTA;
			case LIME: return Material.LIME_GLAZED_TERRACOTTA;
			case PINK: return Material.PINK_GLAZED_TERRACOTTA;
			case GRAY: return Material.GRAY_GLAZED_TERRACOTTA;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_GLAZED_TERRACOTTA;
			case CYAN: return Material.CYAN_GLAZED_TERRACOTTA;
			case PURPLE: return Material.PURPLE_GLAZED_TERRACOTTA;
			case BLUE: return Material.BLUE_GLAZED_TERRACOTTA;
			case BROWN: return Material.BROWN_GLAZED_TERRACOTTA;
			case GREEN: return Material.GREEN_GLAZED_TERRACOTTA;
			case RED: return Material.RED_GLAZED_TERRACOTTA;
			case BLACK: return Material.BLACK_GLAZED_TERRACOTTA;
		}
		return Material.WHITE_GLAZED_TERRACOTTA;
	}

	public static Material getShulkerBox(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_SHULKER_BOX;
			case ORANGE: return Material.ORANGE_SHULKER_BOX;
			case MAGENTA: return Material.MAGENTA_SHULKER_BOX;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_SHULKER_BOX;
			case YELLOW: return Material.YELLOW_SHULKER_BOX;
			case LIME: return Material.LIME_SHULKER_BOX;
			case PINK: return Material.PINK_SHULKER_BOX;
			case GRAY: return Material.GRAY_SHULKER_BOX;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_SHULKER_BOX;
			case CYAN: return Material.CYAN_SHULKER_BOX;
			case PURPLE: return Material.PURPLE_SHULKER_BOX;
			case BLUE: return Material.BLUE_SHULKER_BOX;
			case BROWN: return Material.BROWN_SHULKER_BOX;
			case GREEN: return Material.GREEN_SHULKER_BOX;
			case RED: return Material.RED_SHULKER_BOX;
			case BLACK: return Material.BLACK_SHULKER_BOX;
		}
		return Material.WHITE_SHULKER_BOX;
	}

	public static Material getStainedGlass(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_STAINED_GLASS;
			case ORANGE: return Material.ORANGE_STAINED_GLASS;
			case MAGENTA: return Material.MAGENTA_STAINED_GLASS;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_STAINED_GLASS;
			case YELLOW: return Material.YELLOW_STAINED_GLASS;
			case LIME: return Material.LIME_STAINED_GLASS;
			case PINK: return Material.PINK_STAINED_GLASS;
			case GRAY: return Material.GRAY_STAINED_GLASS;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_STAINED_GLASS;
			case CYAN: return Material.CYAN_STAINED_GLASS;
			case PURPLE: return Material.PURPLE_STAINED_GLASS;
			case BLUE: return Material.BLUE_STAINED_GLASS;
			case BROWN: return Material.BROWN_STAINED_GLASS;
			case GREEN: return Material.GREEN_STAINED_GLASS;
			case RED: return Material.RED_STAINED_GLASS;
			case BLACK: return Material.BLACK_STAINED_GLASS;
		}
		return Material.WHITE_STAINED_GLASS;
	}

	public static Material getStainedGlassPane(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_STAINED_GLASS_PANE;
			case ORANGE: return Material.ORANGE_STAINED_GLASS_PANE;
			case MAGENTA: return Material.MAGENTA_STAINED_GLASS_PANE;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_STAINED_GLASS_PANE;
			case YELLOW: return Material.YELLOW_STAINED_GLASS_PANE;
			case LIME: return Material.LIME_STAINED_GLASS_PANE;
			case PINK: return Material.PINK_STAINED_GLASS_PANE;
			case GRAY: return Material.GRAY_STAINED_GLASS_PANE;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_STAINED_GLASS_PANE;
			case CYAN: return Material.CYAN_STAINED_GLASS_PANE;
			case PURPLE: return Material.PURPLE_STAINED_GLASS_PANE;
			case BLUE: return Material.BLUE_STAINED_GLASS_PANE;
			case BROWN: return Material.BROWN_STAINED_GLASS_PANE;
			case GREEN: return Material.GREEN_STAINED_GLASS_PANE;
			case RED: return Material.RED_STAINED_GLASS_PANE;
			case BLACK: return Material.BLACK_STAINED_GLASS_PANE;
		}
		return Material.WHITE_STAINED_GLASS_PANE;
	}

	public static Material getTerracotta(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_TERRACOTTA;
			case ORANGE: return Material.ORANGE_TERRACOTTA;
			case MAGENTA: return Material.MAGENTA_TERRACOTTA;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_TERRACOTTA;
			case YELLOW: return Material.YELLOW_TERRACOTTA;
			case LIME: return Material.LIME_TERRACOTTA;
			case PINK: return Material.PINK_TERRACOTTA;
			case GRAY: return Material.GRAY_TERRACOTTA;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_TERRACOTTA;
			case CYAN: return Material.CYAN_TERRACOTTA;
			case PURPLE: return Material.PURPLE_TERRACOTTA;
			case BLUE: return Material.BLUE_TERRACOTTA;
			case BROWN: return Material.BROWN_TERRACOTTA;
			case GREEN: return Material.GREEN_TERRACOTTA;
			case RED: return Material.RED_TERRACOTTA;
			case BLACK: return Material.BLACK_TERRACOTTA;
		}
		return Material.WHITE_TERRACOTTA;
	}

	public static Material getWallBanner(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_WALL_BANNER;
			case ORANGE: return Material.ORANGE_WALL_BANNER;
			case MAGENTA: return Material.MAGENTA_WALL_BANNER;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_WALL_BANNER;
			case YELLOW: return Material.YELLOW_WALL_BANNER;
			case LIME: return Material.LIME_WALL_BANNER;
			case PINK: return Material.PINK_WALL_BANNER;
			case GRAY: return Material.GRAY_WALL_BANNER;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_WALL_BANNER;
			case CYAN: return Material.CYAN_WALL_BANNER;
			case PURPLE: return Material.PURPLE_WALL_BANNER;
			case BLUE: return Material.BLUE_WALL_BANNER;
			case BROWN: return Material.BROWN_WALL_BANNER;
			case GREEN: return Material.GREEN_WALL_BANNER;
			case RED: return Material.RED_WALL_BANNER;
			case BLACK: return Material.BLACK_WALL_BANNER;
		}
		return Material.WHITE_WALL_BANNER;
	}

	public static Material getWool(DyeColor color){
		switch(color){
			case WHITE: return Material.WHITE_WOOL;
			case ORANGE: return Material.ORANGE_WOOL;
			case MAGENTA: return Material.MAGENTA_WOOL;
			case LIGHT_BLUE: return Material.LIGHT_BLUE_WOOL;
			case YELLOW: return Material.YELLOW_WOOL;
			case LIME: return Material.LIME_WOOL;
			case PINK: return Material.PINK_WOOL;
			case GRAY: return Material.GRAY_WOOL;
			case LIGHT_GRAY: return Material.LIGHT_GRAY_WOOL;
			case CYAN: return Material.CYAN_WOOL;
			case PURPLE: return Material.PURPLE_WOOL;
			case BLUE: return Material.BLUE_WOOL;
			case BROWN: return Material.BROWN_WOOL;
			case GREEN: return Material.GREEN_WOOL;
			case RED: return Material.RED_WOOL;
			case BLACK: return Material.BLACK_WOOL;
		}
		return Material.WHITE_WOOL;
	}

	public static boolean isBanner(Material type){
		switch(type){
			case WHITE_BANNER: return true;
			case ORANGE_BANNER: return true;
			case MAGENTA_BANNER: return true;
			case LIGHT_BLUE_BANNER: return true;
			case YELLOW_BANNER: return true;
			case LIME_BANNER: return true;
			case PINK_BANNER: return true;
			case GRAY_BANNER: return true;
			case LIGHT_GRAY_BANNER: return true;
			case CYAN_BANNER: return true;
			case PURPLE_BANNER: return true;
			case BLUE_BANNER: return true;
			case BROWN_BANNER: return true;
			case GREEN_BANNER: return true;
			case RED_BANNER: return true;
			case BLACK_BANNER: return true;
			default:break;
		}
		return false;
	}

	public static boolean isBed(Material type){
		switch(type){
			case WHITE_BED: return true;
			case ORANGE_BED: return true;
			case MAGENTA_BED: return true;
			case LIGHT_BLUE_BED: return true;
			case YELLOW_BED: return true;
			case LIME_BED: return true;
			case PINK_BED: return true;
			case GRAY_BED: return true;
			case LIGHT_GRAY_BED: return true;
			case CYAN_BED: return true;
			case PURPLE_BED: return true;
			case BLUE_BED: return true;
			case BROWN_BED: return true;
			case GREEN_BED: return true;
			case RED_BED: return true;
			case BLACK_BED: return true;
			default:break;
		}
		return false;
	}

	public static boolean isCarpet(Material type){
		switch(type){
			case WHITE_CARPET: return true;
			case ORANGE_CARPET: return true;
			case MAGENTA_CARPET: return true;
			case LIGHT_BLUE_CARPET: return true;
			case YELLOW_CARPET: return true;
			case LIME_CARPET: return true;
			case PINK_CARPET: return true;
			case GRAY_CARPET: return true;
			case LIGHT_GRAY_CARPET: return true;
			case CYAN_CARPET: return true;
			case PURPLE_CARPET: return true;
			case BLUE_CARPET: return true;
			case BROWN_CARPET: return true;
			case GREEN_CARPET: return true;
			case RED_CARPET: return true;
			case BLACK_CARPET: return true;
			default:break;
		}
		return false;
	}

	public static boolean isConcrete(Material type){
		switch(type){
			case WHITE_CONCRETE: return true;
			case ORANGE_CONCRETE: return true;
			case MAGENTA_CONCRETE: return true;
			case LIGHT_BLUE_CONCRETE: return true;
			case YELLOW_CONCRETE: return true;
			case LIME_CONCRETE: return true;
			case PINK_CONCRETE: return true;
			case GRAY_CONCRETE: return true;
			case LIGHT_GRAY_CONCRETE: return true;
			case CYAN_CONCRETE: return true;
			case PURPLE_CONCRETE: return true;
			case BLUE_CONCRETE: return true;
			case BROWN_CONCRETE: return true;
			case GREEN_CONCRETE: return true;
			case RED_CONCRETE: return true;
			case BLACK_CONCRETE: return true;
			default:break;
		}
		return false;
	}

	public static boolean isConcretePowder(Material type){
		switch(type){
			case WHITE_CONCRETE_POWDER: return true;
			case ORANGE_CONCRETE_POWDER: return true;
			case MAGENTA_CONCRETE_POWDER: return true;
			case LIGHT_BLUE_CONCRETE_POWDER: return true;
			case YELLOW_CONCRETE_POWDER: return true;
			case LIME_CONCRETE_POWDER: return true;
			case PINK_CONCRETE_POWDER: return true;
			case GRAY_CONCRETE_POWDER: return true;
			case LIGHT_GRAY_CONCRETE_POWDER: return true;
			case CYAN_CONCRETE_POWDER: return true;
			case PURPLE_CONCRETE_POWDER: return true;
			case BLUE_CONCRETE_POWDER: return true;
			case BROWN_CONCRETE_POWDER: return true;
			case GREEN_CONCRETE_POWDER: return true;
			case RED_CONCRETE_POWDER: return true;
			case BLACK_CONCRETE_POWDER: return true;
			default:break;
		}
		return false;
	}

	public static boolean isGlazedTerracotta(Material type){
		switch(type){
			case WHITE_GLAZED_TERRACOTTA: return true;
			case ORANGE_GLAZED_TERRACOTTA: return true;
			case MAGENTA_GLAZED_TERRACOTTA: return true;
			case LIGHT_BLUE_GLAZED_TERRACOTTA: return true;
			case YELLOW_GLAZED_TERRACOTTA: return true;
			case LIME_GLAZED_TERRACOTTA: return true;
			case PINK_GLAZED_TERRACOTTA: return true;
			case GRAY_GLAZED_TERRACOTTA: return true;
			case LIGHT_GRAY_GLAZED_TERRACOTTA: return true;
			case CYAN_GLAZED_TERRACOTTA: return true;
			case PURPLE_GLAZED_TERRACOTTA: return true;
			case BLUE_GLAZED_TERRACOTTA: return true;
			case BROWN_GLAZED_TERRACOTTA: return true;
			case GREEN_GLAZED_TERRACOTTA: return true;
			case RED_GLAZED_TERRACOTTA: return true;
			case BLACK_GLAZED_TERRACOTTA: return true;
			default:break;
		}
		return false;
	}

	public static boolean isShulkerBox(Material type){
		switch(type){
			case WHITE_SHULKER_BOX: return true;
			case ORANGE_SHULKER_BOX: return true;
			case MAGENTA_SHULKER_BOX: return true;
			case LIGHT_BLUE_SHULKER_BOX: return true;
			case YELLOW_SHULKER_BOX: return true;
			case LIME_SHULKER_BOX: return true;
			case PINK_SHULKER_BOX: return true;
			case GRAY_SHULKER_BOX: return true;
			case LIGHT_GRAY_SHULKER_BOX: return true;
			case CYAN_SHULKER_BOX: return true;
			case PURPLE_SHULKER_BOX: return true;
			case BLUE_SHULKER_BOX: return true;
			case BROWN_SHULKER_BOX: return true;
			case GREEN_SHULKER_BOX: return true;
			case RED_SHULKER_BOX: return true;
			case BLACK_SHULKER_BOX: return true;
			default:break;
		}
		return false;
	}

	public static boolean isStainedGlass(Material type){
		switch(type){
			case WHITE_STAINED_GLASS: return true;
			case ORANGE_STAINED_GLASS: return true;
			case MAGENTA_STAINED_GLASS: return true;
			case LIGHT_BLUE_STAINED_GLASS: return true;
			case YELLOW_STAINED_GLASS: return true;
			case LIME_STAINED_GLASS: return true;
			case PINK_STAINED_GLASS: return true;
			case GRAY_STAINED_GLASS: return true;
			case LIGHT_GRAY_STAINED_GLASS: return true;
			case CYAN_STAINED_GLASS: return true;
			case PURPLE_STAINED_GLASS: return true;
			case BLUE_STAINED_GLASS: return true;
			case BROWN_STAINED_GLASS: return true;
			case GREEN_STAINED_GLASS: return true;
			case RED_STAINED_GLASS: return true;
			case BLACK_STAINED_GLASS: return true;
			default:break;
		}
		return false;
	}

	public static boolean isStainedGlassPane(Material type){
		switch(type){
			case WHITE_STAINED_GLASS_PANE: return true;
			case ORANGE_STAINED_GLASS_PANE: return true;
			case MAGENTA_STAINED_GLASS_PANE: return true;
			case LIGHT_BLUE_STAINED_GLASS_PANE: return true;
			case YELLOW_STAINED_GLASS_PANE: return true;
			case LIME_STAINED_GLASS_PANE: return true;
			case PINK_STAINED_GLASS_PANE: return true;
			case GRAY_STAINED_GLASS_PANE: return true;
			case LIGHT_GRAY_STAINED_GLASS_PANE: return true;
			case CYAN_STAINED_GLASS_PANE: return true;
			case PURPLE_STAINED_GLASS_PANE: return true;
			case BLUE_STAINED_GLASS_PANE: return true;
			case BROWN_STAINED_GLASS_PANE: return true;
			case GREEN_STAINED_GLASS_PANE: return true;
			case RED_STAINED_GLASS_PANE: return true;
			case BLACK_STAINED_GLASS_PANE: return true;
			default:break;
		}
		return false;
	}

	public static boolean isTerracotta(Material type){
		switch(type){
			case WHITE_TERRACOTTA: return true;
			case ORANGE_TERRACOTTA: return true;
			case MAGENTA_TERRACOTTA: return true;
			case LIGHT_BLUE_TERRACOTTA: return true;
			case YELLOW_TERRACOTTA: return true;
			case LIME_TERRACOTTA: return true;
			case PINK_TERRACOTTA: return true;
			case GRAY_TERRACOTTA: return true;
			case LIGHT_GRAY_TERRACOTTA: return true;
			case CYAN_TERRACOTTA: return true;
			case PURPLE_TERRACOTTA: return true;
			case BLUE_TERRACOTTA: return true;
			case BROWN_TERRACOTTA: return true;
			case GREEN_TERRACOTTA: return true;
			case RED_TERRACOTTA: return true;
			case BLACK_TERRACOTTA: return true;
			default:break;
		}
		return false;
	}

	public static boolean isWallBanner(Material type){
		switch(type){
			case WHITE_WALL_BANNER: return true;
			case ORANGE_WALL_BANNER: return true;
			case MAGENTA_WALL_BANNER: return true;
			case LIGHT_BLUE_WALL_BANNER: return true;
			case YELLOW_WALL_BANNER: return true;
			case LIME_WALL_BANNER: return true;
			case PINK_WALL_BANNER: return true;
			case GRAY_WALL_BANNER: return true;
			case LIGHT_GRAY_WALL_BANNER: return true;
			case CYAN_WALL_BANNER: return true;
			case PURPLE_WALL_BANNER: return true;
			case BLUE_WALL_BANNER: return true;
			case BROWN_WALL_BANNER: return true;
			case GREEN_WALL_BANNER: return true;
			case RED_WALL_BANNER: return true;
			case BLACK_WALL_BANNER: return true;
			default:break;
		}
		return false;
	}

	public static boolean isWool(Material type){
		switch(type){
			case WHITE_WOOL: return true;
			case ORANGE_WOOL: return true;
			case MAGENTA_WOOL: return true;
			case LIGHT_BLUE_WOOL: return true;
			case YELLOW_WOOL: return true;
			case LIME_WOOL: return true;
			case PINK_WOOL: return true;
			case GRAY_WOOL: return true;
			case LIGHT_GRAY_WOOL: return true;
			case CYAN_WOOL: return true;
			case PURPLE_WOOL: return true;
			case BLUE_WOOL: return true;
			case BROWN_WOOL: return true;
			case GREEN_WOOL: return true;
			case RED_WOOL: return true;
			case BLACK_WOOL: return true;
			default:break;
		}
		return false;
	}

	public static boolean isBoat(Material type){
		switch(type){
			case ACACIA_BOAT: return true;
			case BIRCH_BOAT: return true;
			case DARK_OAK_BOAT: return true;
			case JUNGLE_BOAT: return true;
			case OAK_BOAT: return true;
			case SPRUCE_BOAT: return true;
			default:break;
		}
		return false;
	}

	public static boolean isButton(Material type){
		switch(type){
			case ACACIA_BUTTON: return true;
			case BIRCH_BUTTON: return true;
			case DARK_OAK_BUTTON: return true;
			case JUNGLE_BUTTON: return true;
			case OAK_BUTTON: return true;
			case SPRUCE_BUTTON: return true;
			case STONE_BUTTON: return true;
			default:break;
		}
		return false;
	}

	public static boolean isDoor(Material type){
		switch(type){
			case ACACIA_DOOR: return true;
			case BIRCH_DOOR: return true;
			case DARK_OAK_DOOR: return true;
			case IRON_DOOR: return true;
			case JUNGLE_DOOR: return true;
			case OAK_DOOR: return true;
			case SPRUCE_DOOR: return true;
			default:break;
		}
		return false;
	}

	public static boolean isFence(Material type){
		switch(type){
			case ACACIA_FENCE: return true;
			case BIRCH_FENCE: return true;
			case DARK_OAK_FENCE: return true;
			case JUNGLE_FENCE: return true;
			case NETHER_BRICK_FENCE: return true;
			case OAK_FENCE: return true;
			case SPRUCE_FENCE: return true;
			default:break;
		}
		return false;
	}

	public static boolean isFenceGate(Material type){
		switch(type){
			case ACACIA_FENCE_GATE: return true;
			case BIRCH_FENCE_GATE: return true;
			case DARK_OAK_FENCE_GATE: return true;
			case JUNGLE_FENCE_GATE: return true;
			case OAK_FENCE_GATE: return true;
			case SPRUCE_FENCE_GATE: return true;
			default:break;
		}
		return false;
	}

	public static boolean isLeaves(Material type){
		switch(type){
			case ACACIA_LEAVES: return true;
			case BIRCH_LEAVES: return true;
			case DARK_OAK_LEAVES: return true;
			case JUNGLE_LEAVES: return true;
			case OAK_LEAVES: return true;
			case SPRUCE_LEAVES: return true;
			default:break;
		}
		return false;
	}

	public static boolean isLog(Material type){
		switch(type){
			case ACACIA_LOG: return true;
			case BIRCH_LOG: return true;
			case DARK_OAK_LOG: return true;
			case JUNGLE_LOG: return true;
			case OAK_LOG: return true;
			case SPRUCE_LOG: return true;
			case STRIPPED_ACACIA_LOG: return true;
			case STRIPPED_BIRCH_LOG: return true;
			case STRIPPED_DARK_OAK_LOG: return true;
			case STRIPPED_JUNGLE_LOG: return true;
			case STRIPPED_OAK_LOG: return true;
			case STRIPPED_SPRUCE_LOG: return true;
			default:break;
		}
		return false;
	}

	public static boolean isPlanks(Material type){
		switch(type){
			case ACACIA_PLANKS: return true;
			case BIRCH_PLANKS: return true;
			case DARK_OAK_PLANKS: return true;
			case JUNGLE_PLANKS: return true;
			case OAK_PLANKS: return true;
			case SPRUCE_PLANKS: return true;
			default:break;
		}
		return false;
	}

	public static boolean isPressurePlate(Material type){
		switch(type){
			case ACACIA_PRESSURE_PLATE: return true;
			case BIRCH_PRESSURE_PLATE: return true;
			case DARK_OAK_PRESSURE_PLATE: return true;
			case HEAVY_WEIGHTED_PRESSURE_PLATE: return true;
			case JUNGLE_PRESSURE_PLATE: return true;
			case LIGHT_WEIGHTED_PRESSURE_PLATE: return true;
			case OAK_PRESSURE_PLATE: return true;
			case SPRUCE_PRESSURE_PLATE: return true;
			case STONE_PRESSURE_PLATE: return true;
			default:break;
		}
		return false;
	}

	public static boolean isSapling(Material type){
		switch(type){
			case ACACIA_SAPLING: return true;
			case BIRCH_SAPLING: return true;
			case DARK_OAK_SAPLING: return true;
			case JUNGLE_SAPLING: return true;
			case OAK_SAPLING: return true;
			case POTTED_ACACIA_SAPLING: return true;
			case POTTED_BIRCH_SAPLING: return true;
			case POTTED_DARK_OAK_SAPLING: return true;
			case POTTED_JUNGLE_SAPLING: return true;
			case POTTED_OAK_SAPLING: return true;
			case POTTED_SPRUCE_SAPLING: return true;
			case SPRUCE_SAPLING: return true;
			default:break;
		}
		return false;
	}

	public static boolean isSlab(Material type){
		switch(type){
			case ACACIA_SLAB: return true;
			case BIRCH_SLAB: return true;
			case BRICK_SLAB: return true;
			case COBBLESTONE_SLAB: return true;
			case DARK_OAK_SLAB: return true;
			case DARK_PRISMARINE_SLAB: return true;
			case JUNGLE_SLAB: return true;
			case NETHER_BRICK_SLAB: return true;
			case OAK_SLAB: return true;
			case PETRIFIED_OAK_SLAB: return true;
			case PRISMARINE_BRICK_SLAB: return true;
			case PRISMARINE_SLAB: return true;
			case PURPUR_SLAB: return true;
			case QUARTZ_SLAB: return true;
			case RED_SANDSTONE_SLAB: return true;
			case SANDSTONE_SLAB: return true;
			case SPRUCE_SLAB: return true;
			case STONE_BRICK_SLAB: return true;
			case STONE_SLAB: return true;
			default:break;
		}
		return false;
	}

	public static boolean isStairs(Material type){
		switch(type){
			case ACACIA_STAIRS: return true;
			case BIRCH_STAIRS: return true;
			case BRICK_STAIRS: return true;
			case COBBLESTONE_STAIRS: return true;
			case DARK_OAK_STAIRS: return true;
			case DARK_PRISMARINE_STAIRS: return true;
			case JUNGLE_STAIRS: return true;
			case NETHER_BRICK_STAIRS: return true;
			case OAK_STAIRS: return true;
			case PRISMARINE_BRICK_STAIRS: return true;
			case PRISMARINE_STAIRS: return true;
			case PURPUR_STAIRS: return true;
			case QUARTZ_STAIRS: return true;
			case RED_SANDSTONE_STAIRS: return true;
			case SANDSTONE_STAIRS: return true;
			case SPRUCE_STAIRS: return true;
			case STONE_BRICK_STAIRS: return true;
			default:break;
		}
		return false;
	}

	public static boolean isTrapdoor(Material type){
		switch(type){
			case ACACIA_TRAPDOOR: return true;
			case BIRCH_TRAPDOOR: return true;
			case DARK_OAK_TRAPDOOR: return true;
			case IRON_TRAPDOOR: return true;
			case JUNGLE_TRAPDOOR: return true;
			case OAK_TRAPDOOR: return true;
			case SPRUCE_TRAPDOOR: return true;
			default:break;
		}
		return false;
	}

	public static boolean isWood(Material type){
		switch(type){
			case ACACIA_WOOD: return true;
			case BIRCH_WOOD: return true;
			case DARK_OAK_WOOD: return true;
			case JUNGLE_WOOD: return true;
			case OAK_WOOD: return true;
			case SPRUCE_WOOD: return true;
			case STRIPPED_ACACIA_WOOD: return true;
			case STRIPPED_BIRCH_WOOD: return true;
			case STRIPPED_DARK_OAK_WOOD: return true;
			case STRIPPED_JUNGLE_WOOD: return true;
			case STRIPPED_OAK_WOOD: return true;
			case STRIPPED_SPRUCE_WOOD: return true;
			default:break;
		}
		return false;
	}
}
