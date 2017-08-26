package org.icedev.eoc.instructions;

public class InstructionEQ extends Instruction {

	public static final String NAME = "EQ";

	public static int opcode = 20;

	public InstructionEQ(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}
	
}
