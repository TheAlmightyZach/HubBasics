package net.notfab.hubbasics.plugin.settings;

import lombok.Getter;

/*
 * Copyright (c) 2016.
 *
 * The contents of this project are licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International.
 * Please read the information linked below before you attempt to use this project or it's contents to make sure you are abiding
 * by it's terms.
 *
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

public enum ConfigurationKey {
	WORLD_PARENT_SECTION("world.config", false, null),
	ENABLE_DEBUG("messages.debug", false, false),
	PLAYER_CONNECT("messages.player.connect", true, "&8[&a+&8] &f<displayName> &7joined the game"),
	PLAYER_DISCONNECT("messages.player.disconnect", true, "&8[&c-&8] &f<displayName> &7quit the game"),
	PLAYER_FIRST_CONNECT("messages.player.firstConnect", true, "&9Welcome to the server, &f<displayName>&9!");

	@Getter	private String path;
	@Getter	private boolean perWorldAllowed;
	@Getter	private Object defaultValue;

	ConfigurationKey(String path, Boolean worldDependant, Object defaultValue) {
		this.path = path;
		this.perWorldAllowed = worldDependant;
		this.defaultValue = defaultValue;
	}

	@Override
	public String toString() {
		return this.getPath();
	}
}