package org.icedev.eoc.instructions;

public class InstructionGT extends Instruction {

	public static final String NAME = "GT";

	public static int opcode = 17;

	public InstructionGT(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
