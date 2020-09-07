# MaterialUtil (Bukkit 1.16+)
Utils library for new materials in Minecraft 1.16+

### List of methods
```java
DyeColor getDyeColor(Material type)

EntityType getSpawnEggType(Material type)

Material getSpawnEgg(EntityType type)
Material getBanner(DyeColor color)
Material getBed(DyeColor color)
Material getCarpet(DyeColor color)
Material getConcrete(DyeColor color)
Material getConcretePowder(DyeColor color)
Material getGlazedTerracotta(DyeColor color)
Material getShulkerBox(DyeColor color)
Material getStainedGlass(DyeColor color)
Material getStainedGlassPane(DyeColor color)
Material getTerracotta(DyeColor color)
Material getWallBanner(DyeColor color)
Material getWool(DyeColor color)

boolean isSpawnEgg(Material type)
boolean isBanner(Material type)
boolean isBed(Material type)
boolean isCarpet(Material type)
boolean isConcrete(Material type)
boolean isConcretePowder(Material type)
boolean isGlazedTerracotta(Material type)
boolean isShulkerBox(Material type)
boolean isStainedGlass(Material type)
boolean isStainedGlassPane(Material type)
boolean isTerracotta(Material type)
boolean isWallBanner(Material type)
boolean isWool(Material type)
boolean isBoat(Material type)
boolean isButton(Material type)
boolean isDoor(Material type)
boolean isFence(Material type)
boolean isFenceGate(Material type)
boolean isLeaves(Material type)
boolean isLog(Material type)
boolean isPlanks(Material type)
boolean isPressurePlate(Material type)
boolean isSapling(Material type)
boolean isSlab(Material type)
boolean isStairs(Material type)
boolean isTrapdoor(Material type)
boolean isWood(Material type)
```

### Examples of usage

```java
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event)
{
	if(event.hasItem() && MaterialUtil.isWool(event.getItem().getType()))
	{
		DyeColor woolColor = MaterialUtil.getDyeColor(event.getItem().getType());
		// code ...
	}
}
```

```java
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event)
{
	ItemStack redWool = new ItemStack(MaterialUtil.getWool(DyeColor.RED));
	ItemStack cowEgg = new ItemStack(MaterialUtil.getSpawnEgg(EntityType.COW));
	// code ...
}
```

```java
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event)
{
	if(event.hasItem() && MaterialUtil.isSpawnEgg(event.getItem().getType()))
	{
		EntityType entityType = MaterialUtil.getSpawnEggType(event.getItem().getType());
		// code ...
	}
}
```
