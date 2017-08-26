package org.icedev.eoc.instructions;

public class InstructionSSTORE extends Instruction {

	public static final String NAME = "SSTORE";

	public static int opcode = 85;

	public InstructionSSTORE(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}
	
}
