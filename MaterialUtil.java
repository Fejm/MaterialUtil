import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

public class MaterialUtil {

	public static DyeColor getDyeColor(Material type)
	{
		for(DyeColor color : DyeColor.values())
		{
			if(type.toString().startsWith(color.toString())) return color;
		}
		return DyeColor.WHITE;
	}

	public static EntityType getSpawnEggType(Material type)
	{
		try 
		{
			return EntityType.valueOf(type.toString().split("_SPAWN_EGG")[0]);
		} catch (Exception e)
		{
			return null;
		}
	}

	public static boolean isSpawnEgg(Material type)
	{
		return type.toString().contains("_SPAWN_EGG");
	}

	public static Material getSpawnEgg(EntityType type)
	{
		return Material.getMaterial(type.toString()+"_SPAWN_EGG");
	}

	public static Material getBanner(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_BANNER;
			case MAGENTA: 
				return Material.MAGENTA_BANNER;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_BANNER;
			case YELLOW: 
				return Material.YELLOW_BANNER;
			case LIME: 
				return Material.LIME_BANNER;
			case PINK: 
				return Material.PINK_BANNER;
			case GRAY: 
				return Material.GRAY_BANNER;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_BANNER;
			case CYAN: 
				return Material.CYAN_BANNER;
			case PURPLE: 
				return Material.PURPLE_BANNER;
			case BLUE: 
				return Material.BLUE_BANNER;
			case BROWN: 
				return Material.BROWN_BANNER;
			case GREEN: 
				return Material.GREEN_BANNER;
			case RED: 
				return Material.RED_BANNER;
			case BLACK: 
				return Material.BLACK_BANNER;
			default:
				return Material.WHITE_BANNER;	
		}	
	}

	public static Material getBed(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_BED;
			case MAGENTA: 
				return Material.MAGENTA_BED;
			case LIGHT_BLUE:
				return Material.LIGHT_BLUE_BED;
			case YELLOW: 
				return Material.YELLOW_BED;
			case LIME: 
				return Material.LIME_BED;
			case PINK: 
				return Material.PINK_BED;
			case GRAY: 
				return Material.GRAY_BED;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_BED;
			case CYAN: 
				return Material.CYAN_BED;
			case PURPLE: 
				return Material.PURPLE_BED;
			case BLUE: 
				return Material.BLUE_BED;
			case BROWN: 
				return Material.BROWN_BED;
			case GREEN: 
				return Material.GREEN_BED;
			case RED: 
				return Material.RED_BED;
			case BLACK: 
				return Material.BLACK_BED;
			default:
				return Material.WHITE_BED;
		}
	}

	public static Material getCarpet(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_CARPET;
			case MAGENTA: 
				return Material.MAGENTA_CARPET;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_CARPET;
			case YELLOW: 
				return Material.YELLOW_CARPET;
			case LIME: 
				return Material.LIME_CARPET;
			case PINK: 
				return Material.PINK_CARPET;
			case GRAY: 
				return Material.GRAY_CARPET;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_CARPET;
			case CYAN: 
				return Material.CYAN_CARPET;
			case PURPLE: 
				return Material.PURPLE_CARPET;
			case BLUE: 
				return Material.BLUE_CARPET;
			case BROWN: 
				return Material.BROWN_CARPET;
			case GREEN: 
				return Material.GREEN_CARPET;
			case RED: 
				return Material.RED_CARPET;
			case BLACK: 
				return Material.BLACK_CARPET;
			default:
				return Material.WHITE_CARPET;	
		}
	}

	public static Material getConcrete(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_CONCRETE;
			case MAGENTA: 
				return Material.MAGENTA_CONCRETE;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_CONCRETE;
			case YELLOW: 
				return Material.YELLOW_CONCRETE;
			case LIME: 
				return Material.LIME_CONCRETE;
			case PINK: 
				return Material.PINK_CONCRETE;
			case GRAY: 
				return Material.GRAY_CONCRETE;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_CONCRETE;
			case CYAN: 
				return Material.CYAN_CONCRETE;
			case PURPLE: 
				return Material.PURPLE_CONCRETE;
			case BLUE: 
				return Material.BLUE_CONCRETE;
			case BROWN: 
				return Material.BROWN_CONCRETE;
			case GREEN: 
				return Material.GREEN_CONCRETE;
			case RED: 
				return Material.RED_CONCRETE;
			case BLACK: 
				return Material.BLACK_CONCRETE;
			default:
				return Material.WHITE_CONCRETE;
		}	
	}

	public static Material getConcretePowder(DyeColor color){
		switch(color){
			case ORANGE: 
				return Material.ORANGE_CONCRETE_POWDER;
			case MAGENTA: 
				return Material.MAGENTA_CONCRETE_POWDER;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_CONCRETE_POWDER;
			case YELLOW: 
				return Material.YELLOW_CONCRETE_POWDER;
			case LIME: 
				return Material.LIME_CONCRETE_POWDER;
			case PINK: 
				return Material.PINK_CONCRETE_POWDER;
			case GRAY: 
				return Material.GRAY_CONCRETE_POWDER;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_CONCRETE_POWDER;
			case CYAN: 
				return Material.CYAN_CONCRETE_POWDER;
			case PURPLE: 
				return Material.PURPLE_CONCRETE_POWDER;
			case BLUE: 
				return Material.BLUE_CONCRETE_POWDER;
			case BROWN: 
				return Material.BROWN_CONCRETE_POWDER;
			case GREEN: 
				return Material.GREEN_CONCRETE_POWDER;
			case RED: 
				return Material.RED_CONCRETE_POWDER;
			case BLACK: 
				return Material.BLACK_CONCRETE_POWDER;
			default:
				return Material.WHITE_CONCRETE_POWDER;	
		}
	}

	public static Material getGlazedTerracotta(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_GLAZED_TERRACOTTA;
			case MAGENTA: 
				return Material.MAGENTA_GLAZED_TERRACOTTA;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_GLAZED_TERRACOTTA;
			case YELLOW: 
				return Material.YELLOW_GLAZED_TERRACOTTA;
			case LIME: 
				return Material.LIME_GLAZED_TERRACOTTA;
			case PINK: 
				return Material.PINK_GLAZED_TERRACOTTA;
			case GRAY: 
				return Material.GRAY_GLAZED_TERRACOTTA;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_GLAZED_TERRACOTTA;
			case CYAN: 
				return Material.CYAN_GLAZED_TERRACOTTA;
			case PURPLE: 
				return Material.PURPLE_GLAZED_TERRACOTTA;
			case BLUE: 
				return Material.BLUE_GLAZED_TERRACOTTA;
			case BROWN: 
				return Material.BROWN_GLAZED_TERRACOTTA;
			case GREEN: 
				return Material.GREEN_GLAZED_TERRACOTTA;
			case RED: 
				return Material.RED_GLAZED_TERRACOTTA;
			case BLACK: 
				return Material.BLACK_GLAZED_TERRACOTTA;
			default:
				return Material.WHITE_GLAZED_TERRACOTTA;
		}
	}

	public static Material getShulkerBox(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_SHULKER_BOX;
			case MAGENTA: 
				return Material.MAGENTA_SHULKER_BOX;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_SHULKER_BOX;
			case YELLOW: 
				return Material.YELLOW_SHULKER_BOX;
			case LIME: 
				return Material.LIME_SHULKER_BOX;
			case PINK: 
				return Material.PINK_SHULKER_BOX;
			case GRAY:
				return Material.GRAY_SHULKER_BOX;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_SHULKER_BOX;
			case CYAN: 
				return Material.CYAN_SHULKER_BOX;
			case PURPLE: 
				return Material.PURPLE_SHULKER_BOX;
			case BLUE: 
				return Material.BLUE_SHULKER_BOX;
			case BROWN: 
				return Material.BROWN_SHULKER_BOX;
			case GREEN:
				return Material.GREEN_SHULKER_BOX;
			case RED: 
				return Material.RED_SHULKER_BOX;
			case BLACK: 
				return Material.BLACK_SHULKER_BOX;
			default:
				return Material.WHITE_SHULKER_BOX;
		}
	}

	public static Material getStainedGlass(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_STAINED_GLASS;
			case MAGENTA: 
				return Material.MAGENTA_STAINED_GLASS;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_STAINED_GLASS;
			case YELLOW: 
				return Material.YELLOW_STAINED_GLASS;
			case LIME: 
				return Material.LIME_STAINED_GLASS;
			case PINK: 
				return Material.PINK_STAINED_GLASS;
			case GRAY: 
				return Material.GRAY_STAINED_GLASS;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_STAINED_GLASS;
			case CYAN: 
				return Material.CYAN_STAINED_GLASS;
			case PURPLE: 
				return Material.PURPLE_STAINED_GLASS;
			case BLUE: 
				return Material.BLUE_STAINED_GLASS;
			case BROWN: 
				return Material.BROWN_STAINED_GLASS;
			case GREEN: 
				return Material.GREEN_STAINED_GLASS;
			case RED: 
				return Material.RED_STAINED_GLASS;
			case BLACK: 
				return Material.BLACK_STAINED_GLASS;
			default:
				return Material.WHITE_STAINED_GLASS;
		}
	}

	public static Material getStainedGlassPane(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_STAINED_GLASS_PANE;
			case MAGENTA: 
				return Material.MAGENTA_STAINED_GLASS_PANE;
			case LIGHT_BLUE:
				return Material.LIGHT_BLUE_STAINED_GLASS_PANE;
			case YELLOW: 
				return Material.YELLOW_STAINED_GLASS_PANE;
			case LIME: 
				return Material.LIME_STAINED_GLASS_PANE;
			case PINK: 
				return Material.PINK_STAINED_GLASS_PANE;
			case GRAY: 
				return Material.GRAY_STAINED_GLASS_PANE;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_STAINED_GLASS_PANE;
			case CYAN: 
				return Material.CYAN_STAINED_GLASS_PANE;
			case PURPLE: 
				return Material.PURPLE_STAINED_GLASS_PANE;
			case BLUE: 
				return Material.BLUE_STAINED_GLASS_PANE;
			case BROWN: 
				return Material.BROWN_STAINED_GLASS_PANE;
			case GREEN: 
				return Material.GREEN_STAINED_GLASS_PANE;
			case RED: 
				return Material.RED_STAINED_GLASS_PANE;
			case BLACK: 
				return Material.BLACK_STAINED_GLASS_PANE;
			default:
				return Material.WHITE_STAINED_GLASS_PANE;
		}
	}

	public static Material getTerracotta(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_TERRACOTTA;
			case MAGENTA: 
				return Material.MAGENTA_TERRACOTTA;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_TERRACOTTA;
			case YELLOW: 
				return Material.YELLOW_TERRACOTTA;
			case LIME: 
				return Material.LIME_TERRACOTTA;
			case PINK: 
				return Material.PINK_TERRACOTTA;
			case GRAY: 
				return Material.GRAY_TERRACOTTA;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_TERRACOTTA;
			case CYAN: 
				return Material.CYAN_TERRACOTTA;
			case PURPLE: 
				return Material.PURPLE_TERRACOTTA;
			case BLUE: 
				return Material.BLUE_TERRACOTTA;
			case BROWN: 
				return Material.BROWN_TERRACOTTA;
			case GREEN: 
				return Material.GREEN_TERRACOTTA;
			case RED: 
				return Material.RED_TERRACOTTA;
			case BLACK: 
				return Material.BLACK_TERRACOTTA;
			default:
				return Material.WHITE_TERRACOTTA;
		}
	}

	public static Material getWallBanner(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_WALL_BANNER;
			case MAGENTA:
				return Material.MAGENTA_WALL_BANNER;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_WALL_BANNER;
			case YELLOW:
				return Material.YELLOW_WALL_BANNER;
			case LIME: 
				return Material.LIME_WALL_BANNER;
			case PINK: 
				return Material.PINK_WALL_BANNER;
			case GRAY: 
				return Material.GRAY_WALL_BANNER;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_WALL_BANNER;
			case CYAN: 
				return Material.CYAN_WALL_BANNER;
			case PURPLE: 
				return Material.PURPLE_WALL_BANNER;
			case BLUE: 
				return Material.BLUE_WALL_BANNER;
			case BROWN: 
				return Material.BROWN_WALL_BANNER;
			case GREEN: 
				return Material.GREEN_WALL_BANNER;
			case RED: 
				return Material.RED_WALL_BANNER;
			case BLACK: 
				return Material.BLACK_WALL_BANNER;
			default:
				return Material.WHITE_WALL_BANNER;
		}
	}

	public static Material getWool(DyeColor color)
	{
		switch(color)
		{
			case ORANGE: 
				return Material.ORANGE_WOOL;
			case MAGENTA: 
				return Material.MAGENTA_WOOL;
			case LIGHT_BLUE: 
				return Material.LIGHT_BLUE_WOOL;
			case YELLOW: 
				return Material.YELLOW_WOOL;
			case LIME: 
				return Material.LIME_WOOL;
			case PINK: 
				return Material.PINK_WOOL;
			case GRAY: 
				return Material.GRAY_WOOL;
			case LIGHT_GRAY: 
				return Material.LIGHT_GRAY_WOOL;
			case CYAN: 
				return Material.CYAN_WOOL;
			case PURPLE: 
				return Material.PURPLE_WOOL;
			case BLUE: 
				return Material.BLUE_WOOL;
			case BROWN: 
				return Material.BROWN_WOOL;
			case GREEN: 
				return Material.GREEN_WOOL;
			case RED: 
				return Material.RED_WOOL;
			case BLACK: 
				return Material.BLACK_WOOL;
			default:
				return Material.WHITE_WOOL;
		}
	}

	public static boolean isBanner(Material type)
	{
		switch(type)
		{
			case WHITE_BANNER:
			case ORANGE_BANNER:
			case MAGENTA_BANNER:
			case LIGHT_BLUE_BANNER:
			case YELLOW_BANNER:
			case LIME_BANNER:
			case PINK_BANNER:
			case GRAY_BANNER:
			case LIGHT_GRAY_BANNER:
			case CYAN_BANNER:
			case PURPLE_BANNER:
			case BLUE_BANNER:
			case BROWN_BANNER:
			case GREEN_BANNER:
			case RED_BANNER:
			case BLACK_BANNER: 
				return true;
			default:
				return false;
		}
		
	}

	public static boolean isBed(Material type)
	{
		switch(type)
		{
			case WHITE_BED:
			case ORANGE_BED:
			case MAGENTA_BED:
			case LIGHT_BLUE_BED:
			case YELLOW_BED:
			case LIME_BED:
			case PINK_BED:
			case GRAY_BED:
			case LIGHT_GRAY_BED:
			case CYAN_BED:
			case PURPLE_BED:
			case BLUE_BED:
			case BROWN_BED:
			case GREEN_BED:
			case RED_BED:
			case BLACK_BED: 
				return true;
			default:
				return false;
		}
	}
	
	public static boolean isCarpet(Material type)
	{
		switch(type)
		{
			case WHITE_CARPET:
			case ORANGE_CARPET:
			case MAGENTA_CARPET:
			case LIGHT_BLUE_CARPET:
			case YELLOW_CARPET:
			case LIME_CARPET:
			case PINK_CARPET:
			case GRAY_CARPET:
			case LIGHT_GRAY_CARPET:
			case CYAN_CARPET:
			case PURPLE_CARPET:
			case BLUE_CARPET:
			case BROWN_CARPET:
			case GREEN_CARPET:
			case RED_CARPET:
			case BLACK_CARPET: 
				return true;
			default:
				return false;
		}
	}

	public static boolean isConcrete(Material type)
	{
		switch(type)
		{
			case WHITE_CONCRETE:
			case ORANGE_CONCRETE:
			case MAGENTA_CONCRETE:
			case LIGHT_BLUE_CONCRETE:
			case YELLOW_CONCRETE:
			case LIME_CONCRETE:
			case PINK_CONCRETE:
			case GRAY_CONCRETE:
			case LIGHT_GRAY_CONCRETE:
			case CYAN_CONCRETE:
			case PURPLE_CONCRETE:
			case BLUE_CONCRETE:
			case BROWN_CONCRETE:
			case GREEN_CONCRETE:
			case RED_CONCRETE:
			case BLACK_CONCRETE:
				return true;
			default:		
				return false;
		}
	}

	public static boolean isConcretePowder(Material type)
	{
		switch(type)
		{
			case WHITE_CONCRETE_POWDER:
			case ORANGE_CONCRETE_POWDER:
			case MAGENTA_CONCRETE_POWDER:
			case LIGHT_BLUE_CONCRETE_POWDER:
			case YELLOW_CONCRETE_POWDER:
			case LIME_CONCRETE_POWDER:
			case PINK_CONCRETE_POWDER:
			case GRAY_CONCRETE_POWDER:
			case LIGHT_GRAY_CONCRETE_POWDER:
			case CYAN_CONCRETE_POWDER:
			case PURPLE_CONCRETE_POWDER:
			case BLUE_CONCRETE_POWDER:
			case BROWN_CONCRETE_POWDER:
			case GREEN_CONCRETE_POWDER:
			case RED_CONCRETE_POWDER:
			case BLACK_CONCRETE_POWDER:
				return true;
			default:
				return false;
		}
	}

	public static boolean isGlazedTerracotta(Material type)
	{
		switch(type)
		{
			case WHITE_GLAZED_TERRACOTTA:
			case ORANGE_GLAZED_TERRACOTTA:
			case MAGENTA_GLAZED_TERRACOTTA:
			case LIGHT_BLUE_GLAZED_TERRACOTTA:
			case YELLOW_GLAZED_TERRACOTTA:
			case LIME_GLAZED_TERRACOTTA:
			case PINK_GLAZED_TERRACOTTA:
			case GRAY_GLAZED_TERRACOTTA:
			case LIGHT_GRAY_GLAZED_TERRACOTTA:
			case CYAN_GLAZED_TERRACOTTA:
			case PURPLE_GLAZED_TERRACOTTA:
			case BLUE_GLAZED_TERRACOTTA:
			case BROWN_GLAZED_TERRACOTTA:
			case GREEN_GLAZED_TERRACOTTA:
			case RED_GLAZED_TERRACOTTA:
			case BLACK_GLAZED_TERRACOTTA: 
				return true;
			default:
				return false;
		}	
	}
	
	public static boolean isShulkerBox(Material type)
	{
		switch(type)
		{
			case WHITE_SHULKER_BOX:
			case ORANGE_SHULKER_BOX:
			case MAGENTA_SHULKER_BOX:
			case LIGHT_BLUE_SHULKER_BOX:
			case YELLOW_SHULKER_BOX:
			case LIME_SHULKER_BOX:
			case PINK_SHULKER_BOX:
			case GRAY_SHULKER_BOX:
			case LIGHT_GRAY_SHULKER_BOX:
			case CYAN_SHULKER_BOX:
			case PURPLE_SHULKER_BOX:
			case BLUE_SHULKER_BOX:
			case BROWN_SHULKER_BOX:
			case GREEN_SHULKER_BOX:
			case RED_SHULKER_BOX:
			case BLACK_SHULKER_BOX:
				return true;
			default:
				return false;
		}	
	}

	public static boolean isStainedGlass(Material type)
	{
		switch(type)
		{
			case WHITE_STAINED_GLASS:
			case ORANGE_STAINED_GLASS:
			case MAGENTA_STAINED_GLASS:
			case LIGHT_BLUE_STAINED_GLASS:
			case YELLOW_STAINED_GLASS:
			case LIME_STAINED_GLASS:
			case PINK_STAINED_GLASS:
			case GRAY_STAINED_GLASS:
			case LIGHT_GRAY_STAINED_GLASS:
			case CYAN_STAINED_GLASS:
			case PURPLE_STAINED_GLASS:
			case BLUE_STAINED_GLASS:
			case BROWN_STAINED_GLASS:
			case GREEN_STAINED_GLASS:
			case RED_STAINED_GLASS:
			case BLACK_STAINED_GLASS:
				return true;
			default:
				return false;
		}
	}

	public static boolean isStainedGlassPane(Material type)
	{
		switch(type)
		{
			case WHITE_STAINED_GLASS_PANE:
			case ORANGE_STAINED_GLASS_PANE:
			case MAGENTA_STAINED_GLASS_PANE:
			case LIGHT_BLUE_STAINED_GLASS_PANE:
			case YELLOW_STAINED_GLASS_PANE:
			case LIME_STAINED_GLASS_PANE:
			case PINK_STAINED_GLASS_PANE:
			case GRAY_STAINED_GLASS_PANE:
			case LIGHT_GRAY_STAINED_GLASS_PANE:
			case CYAN_STAINED_GLASS_PANE:
			case PURPLE_STAINED_GLASS_PANE:
			case BLUE_STAINED_GLASS_PANE:
			case BROWN_STAINED_GLASS_PANE:
			case GREEN_STAINED_GLASS_PANE:
			case RED_STAINED_GLASS_PANE:
			case BLACK_STAINED_GLASS_PANE:
				return true;
			default:return false;
		}
	}

	public static boolean isTerracotta(Material type)
	{
		switch(type)
		{
			case WHITE_TERRACOTTA:
			case ORANGE_TERRACOTTA:
			case MAGENTA_TERRACOTTA:
			case LIGHT_BLUE_TERRACOTTA:
			case YELLOW_TERRACOTTA:
			case LIME_TERRACOTTA:
			case PINK_TERRACOTTA:
			case GRAY_TERRACOTTA:
			case LIGHT_GRAY_TERRACOTTA:
			case CYAN_TERRACOTTA:
			case PURPLE_TERRACOTTA:
			case BLUE_TERRACOTTA:
			case BROWN_TERRACOTTA:
			case GREEN_TERRACOTTA:
			case RED_TERRACOTTA:
			case BLACK_TERRACOTTA:
				return true;
			default:
				return false;
		}	
	}

	public static boolean isWallBanner(Material type)
	{
		switch(type)
		{
			case WHITE_WALL_BANNER:
			case ORANGE_WALL_BANNER:
			case MAGENTA_WALL_BANNER:
			case LIGHT_BLUE_WALL_BANNER:
			case YELLOW_WALL_BANNER:
			case LIME_WALL_BANNER:
			case PINK_WALL_BANNER:
			case GRAY_WALL_BANNER:
			case LIGHT_GRAY_WALL_BANNER:
			case CYAN_WALL_BANNER:
			case PURPLE_WALL_BANNER:
			case BLUE_WALL_BANNER:
			case BROWN_WALL_BANNER:
			case GREEN_WALL_BANNER:
			case RED_WALL_BANNER:
			case BLACK_WALL_BANNER: 
				return true;
			default:
				return false;
		}
	}

	public static boolean isWool(Material type)
	{
		switch(type)
		{
			case WHITE_WOOL:
			case ORANGE_WOOL:
			case MAGENTA_WOOL:
			case LIGHT_BLUE_WOOL:
			case YELLOW_WOOL:
			case LIME_WOOL:
			case PINK_WOOL:
			case GRAY_WOOL:
			case LIGHT_GRAY_WOOL:
			case CYAN_WOOL:
			case PURPLE_WOOL:
			case BLUE_WOOL:
			case BROWN_WOOL:
			case GREEN_WOOL:
			case RED_WOOL:
			case BLACK_WOOL:
				return true;
			default:
				return false;
		}
	}

	public static boolean isBoat(Material type)
	{
		switch(type)
		{
			case ACACIA_BOAT:
			case BIRCH_BOAT:
			case DARK_OAK_BOAT:
			case JUNGLE_BOAT:
			case OAK_BOAT:
			case SPRUCE_BOAT:
				return true;
			default:
				return false;
		}
	}

	public static boolean isButton(Material type)
	{
		switch(type)
		{
			case ACACIA_BUTTON:
			case BIRCH_BUTTON:
			case DARK_OAK_BUTTON:
			case JUNGLE_BUTTON:
			case OAK_BUTTON:
			case SPRUCE_BUTTON:
			case STONE_BUTTON:
			case WARPED_BUTTON:
			case CRIMSON_BUTTON: 
				return true;
			default:
				return false;
		}
	}

	public static boolean isDoor(Material type)
	{
		switch(type)
		{
			case ACACIA_DOOR:
			case BIRCH_DOOR:
			case DARK_OAK_DOOR:
			case IRON_DOOR:
			case JUNGLE_DOOR:
			case OAK_DOOR:
			case SPRUCE_DOOR:
			case WARPED_DOOR:
			case CRIMSON_DOOR:
				return true;
			default:
				return false;
		}
	}

	public static boolean isFence(Material type)
	{
		switch(type)
		{
			case ACACIA_FENCE:
			case BIRCH_FENCE:
			case DARK_OAK_FENCE:
			case JUNGLE_FENCE:
			case NETHER_BRICK_FENCE:
			case OAK_FENCE:
			case SPRUCE_FENCE:
			case WARPED_FENCE:
			case CRIMSON_FENCE:
				return true;
			default:
				return false;
		}
	}

	public static boolean isFenceGate(Material type)
	{
		switch(type)
		{
			case ACACIA_FENCE_GATE:
			case BIRCH_FENCE_GATE:
			case DARK_OAK_FENCE_GATE:
			case JUNGLE_FENCE_GATE:
			case OAK_FENCE_GATE:
			case SPRUCE_FENCE_GATE: 
			case WARPED_FENCE_GATE:
			case CRIMSON_FENCE_GATE:
				return true;
			default:
				return false;
		}
	}

	public static boolean isLeaves(Material type) 
	{
		switch (type)
		{
			case ACACIA_LEAVES:
			case BIRCH_LEAVES:
			case DARK_OAK_LEAVES:
			case JUNGLE_LEAVES:
			case OAK_LEAVES:
			case SPRUCE_LEAVES:
				return true;
			default:
				return false;
		}
	}

	public static boolean isLog(Material type)
	{
		switch(type)
		{
			case ACACIA_LOG:
			case BIRCH_LOG:
			case DARK_OAK_LOG:
			case JUNGLE_LOG:
			case OAK_LOG:
			case SPRUCE_LOG:
			case STRIPPED_ACACIA_LOG:
			case STRIPPED_BIRCH_LOG:
			case STRIPPED_DARK_OAK_LOG:
			case STRIPPED_JUNGLE_LOG:
			case STRIPPED_OAK_LOG:
			case STRIPPED_SPRUCE_LOG: 
				return true;
			default:
				return false;
		}
	}

	public static boolean isPlanks(Material type)
	{
		switch(type)
		{
			case ACACIA_PLANKS:
			case BIRCH_PLANKS:
			case DARK_OAK_PLANKS:
			case JUNGLE_PLANKS:
			case OAK_PLANKS:
			case SPRUCE_PLANKS: 
			case WARPED_PLANKS:
			case CRIMSON_PLANKS:
				return true;
			default:
				return false;
		}	
	}

	public static boolean isPressurePlate(Material type)
	{
		switch(type)
		{
			case ACACIA_PRESSURE_PLATE:
			case BIRCH_PRESSURE_PLATE:
			case DARK_OAK_PRESSURE_PLATE:
			case HEAVY_WEIGHTED_PRESSURE_PLATE:
			case JUNGLE_PRESSURE_PLATE:
			case LIGHT_WEIGHTED_PRESSURE_PLATE:
			case OAK_PRESSURE_PLATE:
			case SPRUCE_PRESSURE_PLATE:
			case STONE_PRESSURE_PLATE: 
			case WARPED_PRESSURE_PLATE:
			case CRIMSON_PRESSURE_PLATE:
				return true;
			default:
				return false;
		}
	}

	public static boolean isSapling(Material type)
	{
		switch(type)
		{
			case ACACIA_SAPLING:
			case BIRCH_SAPLING:
			case BAMBOO_SAPLING:
			case DARK_OAK_SAPLING:
			case JUNGLE_SAPLING:
			case OAK_SAPLING:
			case POTTED_ACACIA_SAPLING:
			case POTTED_BIRCH_SAPLING:
			case POTTED_DARK_OAK_SAPLING:
			case POTTED_JUNGLE_SAPLING:
			case POTTED_OAK_SAPLING:
			case POTTED_SPRUCE_SAPLING:
			case SPRUCE_SAPLING: 
				return true;
			default:
				return false;
		}
	}

	public static boolean isSlab(Material type)
	{
		switch(type)
		{
			case ACACIA_SLAB:
			case BIRCH_SLAB:
			case BRICK_SLAB:
			case COBBLESTONE_SLAB:
			case CRIMSON_SLAB:
			case DARK_OAK_SLAB:
			case DARK_PRISMARINE_SLAB:
			case JUNGLE_SLAB:
			case NETHER_BRICK_SLAB:
			case OAK_SLAB:
			case PETRIFIED_OAK_SLAB:
			case PRISMARINE_BRICK_SLAB:
			case PRISMARINE_SLAB:
			case PURPUR_SLAB:
			case QUARTZ_SLAB:
			case RED_SANDSTONE_SLAB:
			case SANDSTONE_SLAB:
			case SPRUCE_SLAB:
			case STONE_BRICK_SLAB:
			case STONE_SLAB:
			case WARPED_SLAB:
				return true;
			default:
				return false;
		}
	}

	public static boolean isStairs(Material type)
	{
		switch(type)
		{
			case ACACIA_STAIRS:
			case BIRCH_STAIRS:
			case BRICK_STAIRS:
			case COBBLESTONE_STAIRS:
			case CRIMSON_STAIRS:
			case DARK_OAK_STAIRS:
			case DARK_PRISMARINE_STAIRS:
			case JUNGLE_STAIRS:
			case NETHER_BRICK_STAIRS:
			case OAK_STAIRS:
			case PRISMARINE_BRICK_STAIRS:
			case PRISMARINE_STAIRS:
			case PURPUR_STAIRS:
			case QUARTZ_STAIRS:
			case RED_SANDSTONE_STAIRS:
			case SANDSTONE_STAIRS:
			case SPRUCE_STAIRS:
			case STONE_BRICK_STAIRS:
			case STONE_STAIRS:
			case WARPED_STAIRS:
				return true;
			default:
				return false;
		}
	}

	public static boolean isTrapdoor(Material type)
	{
		switch(type)
		{
			case ACACIA_TRAPDOOR:
			case BIRCH_TRAPDOOR:
			case DARK_OAK_TRAPDOOR:
			case IRON_TRAPDOOR:
			case JUNGLE_TRAPDOOR:
			case OAK_TRAPDOOR:
			case SPRUCE_TRAPDOOR: 
			case CRIMSON_TRAPDOOR:
			case WARPED_TRAPDOOR: 
				return true;
			default:
				return false;
		}
	}

	public static boolean isWood(Material type)
	{
		switch(type)
		{
			case ACACIA_WOOD:
			case BIRCH_WOOD:
			case DARK_OAK_WOOD:
			case JUNGLE_WOOD:
			case OAK_WOOD:
			case SPRUCE_WOOD:
			case STRIPPED_ACACIA_WOOD:
			case STRIPPED_BIRCH_WOOD:
			case STRIPPED_DARK_OAK_WOOD:
			case STRIPPED_JUNGLE_WOOD:
			case STRIPPED_OAK_WOOD:
			case STRIPPED_SPRUCE_WOOD: 
				return true;
			default:
				return false;
		}
	}
	
}
