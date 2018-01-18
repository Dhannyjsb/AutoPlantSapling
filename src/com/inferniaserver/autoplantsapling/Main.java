package com.inferniaserver.autoplantsapling;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	 public Block block;
	 public Material materi;

	 
	 @Override
	 public void onEnable() {
		// this.saveDefaultConfig();
		 this.materi = Material.SAPLING;

	 }
	 
	 public void onDisable() {
	 
	 }
	
	 public void run() {
		 Material below = this.block.getRelative(BlockFace.DOWN).getType();
		 	if  (below == Material.DIRT || below == Material.GRASS){
		 		 this.block.setType(materi);

		 	}
	 }
	 
}
