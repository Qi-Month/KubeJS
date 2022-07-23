package dev.latvian.mods.kubejs.core;

import dev.latvian.mods.kubejs.KubeJS;
import dev.latvian.mods.kubejs.entity.EntityJS;
import dev.latvian.mods.rhino.util.RemapPrefixForJS;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import org.apache.commons.lang3.NotImplementedException;

@RemapPrefixForJS("kjs$")
public interface EntityKJS extends AsKJS<EntityJS> {
	@Override
	default EntityJS asKJS() {
		var entity = (Entity) this;
		return KubeJS.PROXY.getLevel(entity.level).getEntity(entity);
	}

	default CompoundTag kjs$getPersistentData() {
		throw new NotImplementedException("A mixin should have implemented this method!");
	}
}
