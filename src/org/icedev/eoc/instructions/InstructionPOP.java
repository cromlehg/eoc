package org.icedev.eoc.instructions;

public class InstructionPOP extends Instruction {

	public static final String NAME = "POP";

	public static int opcode = 80;

	public InstructionPOP(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
