package dev.latvian.mods.kubejs.player;

import com.mojang.authlib.GameProfile;
import dev.latvian.mods.kubejs.level.world.ClientLevelJS;
import dev.latvian.mods.kubejs.level.world.LevelJS;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * @author LatvianModder
 */
public class ClientPlayerDataJS extends PlayerDataJS<Player, ClientPlayerJS> {
	private final ClientLevelJS level;
	private final ClientPlayerJS player;
	private final Player minecraftPlayer;

	public ClientPlayerDataJS(ClientLevelJS l, Player p, boolean s) {
		level = l;
		minecraftPlayer = p;
		player = new ClientPlayerJS(this, minecraftPlayer, s);
	}

	@Deprecated(forRemoval = true)
	@ApiStatus.ScheduledForRemoval(inVersion = "4.1")
	public final ClientLevelJS getWorld() {
		return getLevel();
	}

	public ClientLevelJS getLevel() {
		return level;
	}

	@Override
	public UUID getId() {
		return player.getId();
	}

	@Override
	public String getName() {
		return player.getProfile().getName();
	}

	@Override
	public GameProfile getProfile() {
		return player.getProfile();
	}

	@Override
	public LevelJS getOverworld() {
		return level;
	}

	@Nullable
	@Override
	public Player getMinecraftPlayer() {
		return minecraftPlayer;
	}

	@Override
	public ClientPlayerJS getPlayer() {
		return player;
	}
}