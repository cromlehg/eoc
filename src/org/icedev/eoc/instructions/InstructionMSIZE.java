package org.icedev.eoc.instructions;

public class InstructionMSIZE extends Instruction {

	public static final String NAME = "MSIZE";

	public static int opcode = 89;

	public InstructionMSIZE(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
