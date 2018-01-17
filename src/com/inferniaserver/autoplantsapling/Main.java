package com.inferniaserver.autoplantsapling;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	 public Block block;
	 public Material materi;
	 private byte data;
	 
	 @Override
	 public void onEnable() {
		// this.saveDefaultConfig();
		 this.materi = Material.SAPLING;
		 this.data = -1;
	 }
	 
	 public void onDisable() {
	 
	 }
	
	 public void run() {
		 Material below = this.block.getRelative(BlockFace.DOWN).getType();
		 	if  (below == Material.DIRT || below == Material.GRASS){
		 		 this.block.setType(materi);
		            if (data < 0) {
		            	BlockState state = block.getState();
		            	MaterialData data = state.getData();
		            	state.setData(data);
		            	state.update();
		            }
		 	}
	 }
	 
}
