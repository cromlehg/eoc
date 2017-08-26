package org.icedev.eoc.instructions;

public class InstructionGASPRICE extends Instruction {

	public static final String NAME = "GASPRICE";

	public static int opcode = 58;

	public InstructionGASPRICE(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
