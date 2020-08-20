package reddragon.marvelousmachines.content.machines.blockbreaker.log;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import reborncore.client.gui.builder.GuiBase;
import reddragon.marvelousmachines.content.machines.AbstractMachineBlockEntity;
import reddragon.marvelousmachines.content.machines.blockbreaker.BlockBreakerGui;

public class LogBreakerGui extends BlockBreakerGui {

	public LogBreakerGui(final int syncID, final PlayerEntity player, final AbstractMachineBlockEntity blockEntity) {
		super(syncID, player, blockEntity);
	}

	@Override
	protected void drawForeground(final MatrixStack matrixStack, final int mouseX, final int mouseY) {
		super.drawForeground(matrixStack, mouseX, mouseY);

		drawLogSawWheel(matrixStack, 80, 40, mouseX, mouseY, GuiBase.Layer.FOREGROUND);
	}
}
