package main.astraeus.core.game.model.entity.mobile.player.update.mask;

import main.astraeus.core.game.model.entity.mobile.player.Player;
import main.astraeus.core.game.model.entity.mobile.player.update.PlayerUpdateBlock;
import main.astraeus.core.game.model.entity.mobile.update.UpdateFlags.UpdateFlag;
import main.astraeus.core.net.packet.PacketBuilder;

/**
 * The {@link PlayerUpdateBlock} implementation that updates a players second
 * hit mark.
 * 
 * @author SeVen
 */
public class PlayerDoubleHitUpdateBlock extends PlayerUpdateBlock {

	/**
	 * Creates a new {@link PlayerDoubleHitUpdateBlock}.
	 */
	public PlayerDoubleHitUpdateBlock() {
		super(0x200, UpdateFlag.DOUBLE_HIT);
	}

	@Override
	public void encode(Player entity, PacketBuilder builder) {
//		builder.put(entity.getSecondaryHit().getDamage())
//				.put(entity.getSecondaryHit().getType().getId(), ByteValue.SUBTRACTION)
//				.put(entity.getSkill().getLevel(Skill.HITPOINTS))
//				.put(entity.getSkill().getMaxLevel(Skill.HITPOINTS), ByteValue.NEGATION);
	}

}
