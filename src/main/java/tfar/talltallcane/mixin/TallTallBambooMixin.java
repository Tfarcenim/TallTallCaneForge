package tfar.talltallcane.mixin;

import net.minecraft.block.BambooBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import tfar.talltallcane.ExampleMod;

@Mixin(BambooBlock.class)
abstract class TallTallBambooMixin {

	@ModifyConstant(method = "randomTick",constant = @Constant(intValue = 16))
	private int tall(int o) {
		return ExampleMod.height;
	}

	@ModifyConstant(method = "grow(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;I)V",constant = @Constant(intValue = 11))
	private int alsoTall(int i) {
		return ExampleMod.height-5;
	}

	@ModifyConstant(method = "grow(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;I)V",constant = @Constant(intValue = 15))
	private int alsoAlsoTall(int i) {
		return ExampleMod.height-1;
	}
}
