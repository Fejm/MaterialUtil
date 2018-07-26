# MaterialUtil (Bukkit 1.13+)
Utils library for new materials in Minecraft 1.13+

### Examples of usage

```java
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event){
	if(event.hasItem() && MaterialUtil.isWool(event.getItem().getType())){
		DyeColor woolColor = MaterialUtil.getMaterialColor(event.getItem().getType());
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

```java
@EventHandler
public void onPlayerInteract(PlayerInteractEvent event){
	if(event.hasItem() && MaterialUtil.isSpawnEgg(event.getItem().getType())){
		EntityType entityType = MaterialUtil.getSpawnEggType(event.getItem().getType());
		// code ...
	}
}
```
