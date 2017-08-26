package org.icedev.eoc.instructions;

public class InstructionORIGIN extends Instruction {

	public static final String NAME = "ORIGIN";

	public static int opcode = 50;

	public InstructionORIGIN(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}