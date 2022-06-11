/*
 * Copyright (C) 2021 - 2022 Elytrium
 *
 * The LimboAPI (excluding the LimboAPI plugin) is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package net.elytrium.limboapi.api.protocol.packets;

import net.elytrium.limboapi.api.chunk.data.ChunkSnapshot;
import net.elytrium.limboapi.api.material.VirtualItem;
import net.elytrium.limboapi.api.protocol.packets.data.AbilityFlags;
import net.elytrium.limboapi.api.protocol.packets.data.MapData;
import net.kyori.adventure.nbt.CompoundBinaryTag;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface PacketFactory {

  Object createChangeGameStatePacket(int reason, float value);

  Object createChunkDataPacket(ChunkSnapshot chunkSnapshot, boolean skyLight, int maxSections);

  Object createDefaultSpawnPositionPacket(int posX, int posY, int posZ, float angle);

  Object createMapDataPacket(int mapId, byte scale, MapData mapData);

  /**
   * @param flags See {@link AbilityFlags}. (e.g. {@code AbilityFlags.ALLOW_FLYING | AbilityFlags.CREATIVE_MODE})
   */
  Object createPlayerAbilitiesPacket(byte flags, float flySpeed, float walkSpeed);

  Object createPositionRotationPacket(double posX, double posY, double posZ, float yaw, float pitch,
      boolean onGround, int teleportID, boolean dismountVehicle);

  Object createSetExperiencePacket(float expBar, int level, int totalExp);

  Object createSetSlotPacket(int windowID, int slot, VirtualItem item, int count, int data, @Nullable CompoundBinaryTag nbt);

  Object createTimeUpdatePacket(long worldAge, long timeOfDay);

  Object createUpdateViewPositionPacket(int posX, int posZ);
}
