package org.icedev.eoc.instructions;

public class InstructionADD extends Instruction {

	public static final String NAME = "ADD";

	public static int opcode = 1;

	public InstructionADD(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
