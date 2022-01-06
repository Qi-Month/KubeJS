package dev.latvian.mods.kubejs.level.world;

/**
 * @author LatvianModder
 */
public class SimpleLevelEventJS extends LevelEventJS {
	private final LevelJS level;

	public SimpleLevelEventJS(LevelJS l) {
		level = l;
	}

	@Override
	public LevelJS getLevel() {
		return level;
	}
}