package net.notfab.hubbasics;

import lombok.Getter;

import net.notfab.hubbasics.managers.CommandManager;
import net.notfab.hubbasics.plugin.settings.PluginConfiguration;

import org.bukkit.plugin.java.JavaPlugin;

/*
 * Copyright (c) 2016.
 *
 * The contents of this project are licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International.
 * Please read the information linked below before you attempt to use this project or it's contents to make sure you are abiding
 * by it's terms.
 *
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

public class HubBasics extends JavaPlugin {

	@Getter	private static HubBasics instance;

	@Getter	private CommandManager commandManager;
	@Getter	private PluginConfiguration pluginConfiguration;

	@Override
	public void onEnable() {
		instance = this;
		this.init();
		//TODO: Load
	}

	@Override
	public void onDisable() {
		this.getCommandManager().unloadMap();
		//TODO: Unload
		instance = null;
	}

	private void init() {
		this.commandManager = new CommandManager();
		this.getCommandManager().loadMap();

		this.pluginConfiguration = new PluginConfiguration();
		this.getPluginConfiguration().loadDefaults();
	}
}