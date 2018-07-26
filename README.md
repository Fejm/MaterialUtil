# MaterialUtil (Bukkit 1.13+)
Utils library for new materials in Minecraft 1.13+

### Examples of usage

```java
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event){
	if(event.hasItem() && MaterialUtil.isWool(event.getItem().getType()){
		// code ...
	}
}
```

```java
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event){
	ItemStack redWool = new ItemStack(MaterialUtil.getWool(DyeColor.RED));
	ItemStack cowEgg = new ItemStack(MaterialUtil.getSpawnEgg(EntityType.CHICKEN));
	// code ...
}
```
