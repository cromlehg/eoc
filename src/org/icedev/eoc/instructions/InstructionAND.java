package org.icedev.eoc.instructions;

public class InstructionAND extends Instruction {

	public static final String NAME = "AND";

	public static int opcode = 22;

	public InstructionAND(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
