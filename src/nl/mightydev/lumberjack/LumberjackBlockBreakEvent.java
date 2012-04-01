package nl.mightydev.lumberjack;

import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("serial")
public class LumberjackBlockBreakEvent extends BlockBreakEvent {

	public LumberjackBlockBreakEvent(Block theBlock, Player player) {
		super(theBlock, player);
	}

}
