/*
 * Copyright (C) 2021 - 2023 Elytrium
 *
 * The LimboAPI (excluding the LimboAPI plugin) is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package net.elytrium.limboapi.api.material;

public enum Item {

  AIR(0),
  STONE(1),
  GRASS(2),
  DIRT(3),
  COBBLESTONE(4),
  PLANKS(5),
  SAPLING(6),
  BEDROCK(7),
  SAND(12),
  GRAVEL(13),
  GOLD_ORE(14),
  IRON_ORE(15),
  COAL_ORE(16),
  LOG(17),
  LEAVES(18),
  SPONGE(19),
  GLASS(20),
  LAPIS_ORE(21),
  LAPIS_BLOCK(22),
  DISPENSER(23),
  SANDSTONE(24),
  NOTEBLOCK(25),
  GOLDEN_RAIL(27),
  DETECTOR_RAIL(28),
  STICKY_PISTON(29),
  WEB(30),
  TALLGRASS(31),
  DEADBUSH(32),
  PISTON(33),
  WOOL(35),
  YELLOW_FLOWER(37),
  RED_FLOWER(38),
  BROWN_MUSHROOM(39),
  RED_MUSHROOM(40),
  GOLD_BLOCK(41),
  IRON_BLOCK(42),
  STONE_SLAB(44),
  BRICK_BLOCK(45),
  TNT(46),
  BOOKSHELF(47),
  MOSSY_COBBLESTONE(48),
  OBSIDIAN(49),
  TORCH(50),
  MOB_SPAWNER(52),
  OAK_STAIRS(53),
  CHEST(54),
  DIAMOND_ORE(56),
  DIAMOND_BLOCK(57),
  CRAFTING_TABLE(58),
  FARMLAND(60),
  FURNACE(61),
  LADDER(65),
  RAIL(66),
  STONE_STAIRS(67),
  LEVER(69),
  STONE_PRESSURE_PLATE(70),
  WOODEN_PRESSURE_PLATE(72),
  REDSTONE_ORE(73),
  REDSTONE_TORCH(76),
  STONE_BUTTON(77),
  SNOW_LAYER(78),
  ICE(79),
  SNOW(80),
  CACTUS(81),
  CLAY(82),
  JUKEBOX(84),
  FENCE(85),
  PUMPKIN(86),
  NETHERRACK(87),
  SOUL_SAND(88),
  GLOWSTONE(89),
  LIT_PUMPKIN(91),
  STAINED_GLASS(95),
  TRAPDOOR(96),
  STONEBRICK(98),
  BROWN_MUSHROOM_BLOCK(99),
  RED_MUSHROOM_BLOCK(100),
  IRON_BARS(101),
  GLASS_PANE(102),
  MELON_BLOCK(103),
  VINE(106),
  FENCE_GATE(107),
  BRICK_STAIRS(108),
  STONE_BRICK_STAIRS(109),
  MYCELIUM(110),
  WATERLILY(111),
  NETHER_BRICK(112),
  NETHER_BRICK_FENCE(113),
  NETHER_BRICK_STAIRS(114),
  ENCHANTING_TABLE(116),
  END_PORTAL_FRAME(120),
  END_STONE(121),
  DRAGON_EGG(122),
  REDSTONE_LAMP(123),
  WOODEN_SLAB(126),
  SANDSTONE_STAIRS(128),
  EMERALD_ORE(129),
  ENDER_CHEST(130),
  TRIPWIRE_HOOK(131),
  EMERALD_BLOCK(133),
  SPRUCE_STAIRS(134),
  BIRCH_STAIRS(135),
  JUNGLE_STAIRS(136),
  COMMAND_BLOCK(137),
  BEACON(138),
  COBBLESTONE_WALL(139),
  WOODEN_BUTTON(143),
  ANVIL(145),
  TRAPPED_CHEST(146),
  LIGHT_WEIGHTED_PRESSURE_PLATE(147),
  HEAVY_WEIGHTED_PRESSURE_PLATE(148),
  DAYLIGHT_DETECTOR(151),
  REDSTONE_BLOCK(152),
  QUARTZ_ORE(153),
  HOPPER(154),
  QUARTZ_BLOCK(155),
  QUARTZ_STAIRS(156),
  ACTIVATOR_RAIL(157),
  DROPPER(158),
  STAINED_HARDENED_CLAY(159),
  STAINED_GLASS_PANE(160),
  LEAVES2(161),
  LOG2(162),
  ACACIA_STAIRS(163),
  DARK_OAK_STAIRS(164),
  SLIME(165),
  BARRIER(166),
  IRON_TRAPDOOR(167),
  PRISMARINE(168),
  SEA_LANTERN(169),
  HAY_BLOCK(170),
  CARPET(171),
  HARDENED_CLAY(172),
  COAL_BLOCK(173),
  PACKED_ICE(174),
  DOUBLE_PLANT(175),
  RED_SANDSTONE(179),
  RED_SANDSTONE_STAIRS(180),
  STONE_SLAB2(182),
  SPRUCE_FENCE_GATE(183),
  BIRCH_FENCE_GATE(184),
  JUNGLE_FENCE_GATE(185),
  DARK_OAK_FENCE_GATE(186),
  ACACIA_FENCE_GATE(187),
  SPRUCE_FENCE(188),
  BIRCH_FENCE(189),
  JUNGLE_FENCE(190),
  DARK_OAK_FENCE(191),
  ACACIA_FENCE(192),
  IRON_SHOVEL(256),
  IRON_PICKAXE(257),
  IRON_AXE(258),
  FLINT_AND_STEEL(259),
  APPLE(260),
  BOW(261),
  ARROW(262),
  COAL(263),
  DIAMOND(264),
  IRON_INGOT(265),
  GOLD_INGOT(266),
  IRON_SWORD(267),
  WOODEN_SWORD(268),
  WOODEN_SHOVEL(269),
  WOODEN_PICKAXE(270),
  WOODEN_AXE(271),
  STONE_SWORD(272),
  STONE_SHOVEL(273),
  STONE_PICKAXE(274),
  STONE_AXE(275),
  DIAMOND_SWORD(276),
  DIAMOND_SHOVEL(277),
  DIAMOND_PICKAXE(278),
  DIAMOND_AXE(279),
  STICK(280),
  BOWL(281),
  MUSHROOM_STEW(282),
  GOLDEN_SWORD(283),
  GOLDEN_SHOVEL(284),
  GOLDEN_PICKAXE(285),
  GOLDEN_AXE(286),
  STRING(287),
  FEATHER(288),
  GUNPOWDER(289),
  WOODEN_HOE(290),
  STONE_HOE(291),
  IRON_HOE(292),
  DIAMOND_HOE(293),
  GOLDEN_HOE(294),
  WHEAT_SEEDS(295),
  WHEAT(296),
  BREAD(297),
  LEATHER_HELMET(298),
  LEATHER_CHESTPLATE(299),
  LEATHER_LEGGINGS(300),
  LEATHER_BOOTS(301),
  CHAINMAIL_HELMET(302),
  CHAINMAIL_CHESTPLATE(303),
  CHAINMAIL_LEGGINGS(304),
  CHAINMAIL_BOOTS(305),
  IRON_HELMET(306),
  IRON_CHESTPLATE(307),
  IRON_LEGGINGS(308),
  IRON_BOOTS(309),
  DIAMOND_HELMET(310),
  DIAMOND_CHESTPLATE(311),
  DIAMOND_LEGGINGS(312),
  DIAMOND_BOOTS(313),
  GOLDEN_HELMET(314),
  GOLDEN_CHESTPLATE(315),
  GOLDEN_LEGGINGS(316),
  GOLDEN_BOOTS(317),
  FLINT(318),
  PORKCHOP(319),
  COOKED_PORKCHOP(320),
  PAINTING(321),
  GOLDEN_APPLE(322),
  SIGN(323),
  WOODEN_DOOR(324),
  BUCKET(325),
  WATER_BUCKET(326),
  LAVA_BUCKET(327),
  MINECART(328),
  SADDLE(329),
  IRON_DOOR(330),
  REDSTONE(331),
  SNOWBALL(332),
  BOAT(333),
  LEATHER(334),
  MILK_BUCKET(335),
  BRICK(336),
  CLAY_BALL(337),
  REEDS(338),
  PAPER(339),
  BOOK(340),
  SLIME_BALL(341),
  CHEST_MINECART(342),
  FURNACE_MINECART(343),
  EGG(344),
  COMPASS(345),
  FISHING_ROD(346),
  CLOCK(347),
  GLOWSTONE_DUST(348),
  FISH(349),
  COOKED_FISH(350),
  DYE(351),
  BONE(352),
  SUGAR(353),
  CAKE(354),
  BED(355),
  REPEATER(356),
  COOKIE(357),
  FILLED_MAP(358),
  SHEARS(359),
  MELON(360),
  PUMPKIN_SEEDS(361),
  MELON_SEEDS(362),
  BEEF(363),
  COOKED_BEEF(364),
  CHICKEN(365),
  COOKED_CHICKEN(366),
  ROTTEN_FLESH(367),
  ENDER_PEARL(368),
  BLAZE_ROD(369),
  GHAST_TEAR(370),
  GOLD_NUGGET(371),
  NETHER_WART(372),
  POTION(373),
  GLASS_BOTTLE(374),
  SPIDER_EYE(375),
  FERMENTED_SPIDER_EYE(376),
  BLAZE_POWDER(377),
  MAGMA_CREAM(378),
  BREWING_STAND(379),
  CAULDRON(380),
  ENDER_EYE(381),
  SPECKLED_MELON(382),
  SPAWN_EGG(383),
  EXPERIENCE_BOTTLE(384),
  FIRE_CHARGE(385),
  WRITABLE_BOOK(386),
  WRITTEN_BOOK(387),
  EMERALD(388),
  ITEM_FRAME(389),
  FLOWER_POT(390),
  CARROT(391),
  POTATO(392),
  BAKED_POTATO(393),
  POISONOUS_POTATO(394),
  MAP(395),
  GOLDEN_CARROT(396),
  SKULL(397),
  CARROT_ON_A_STICK(398),
  NETHER_STAR(399),
  PUMPKIN_PIE(400),
  FIREWORKS(401),
  FIREWORK_CHARGE(402),
  ENCHANTED_BOOK(403),
  COMPARATOR(404),
  NETHERBRICK(405),
  QUARTZ(406),
  TNT_MINECART(407),
  HOPPER_MINECART(408),
  PRISMARINE_SHARD(409),
  PRISMARINE_CRYSTALS(410),
  RABBIT(411),
  COOKED_RABBIT(412),
  RABBIT_STEW(413),
  RABBIT_FOOT(414),
  RABBIT_HIDE(415),
  ARMOR_STAND(416),
  IRON_HORSE_ARMOR(417),
  GOLDEN_HORSE_ARMOR(418),
  DIAMOND_HORSE_ARMOR(419),
  LEAD(420),
  NAME_TAG(421),
  COMMAND_BLOCK_MINECART(422),
  MUTTON(423),
  COOKED_MUTTON(424),
  BANNER(425),
  SPRUCE_DOOR(427),
  BIRCH_DOOR(428),
  JUNGLE_DOOR(429),
  ACACIA_DOOR(430),
  DARK_OAK_DOOR(431),
  RECORD_13(2256),
  RECORD_CAT(2257),
  RECORD_BLOCKS(2258),
  RECORD_CHIRP(2259),
  RECORD_FAR(2260),
  RECORD_MALL(2261),
  RECORD_MELLOHI(2262),
  RECORD_STAL(2263),
  RECORD_STRAD(2264),
  RECORD_WARD(2265),
  RECORD_11(2266),
  RECORD_WAIT(2267);

  private final int id;

  Item(int id) {
    this.id = id;
  }

  @Deprecated
  public int getID() {
    return this.id;
  }

  public int getLegacyID() {
    return this.id;
  }
}
