package com.nitnelave.CreeperHeal.block;

import org.bukkit.block.BlockState;

public class CreeperButton extends CreeperBlock {

	@SuppressWarnings("deprecation")
	protected CreeperButton(BlockState b) {
		super(b);

		b.setRawData((byte) (getRawData() & 7));
	}
}
