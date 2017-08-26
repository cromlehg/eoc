package org.icedev.eoc.instructions;

public class InstructionNOT extends Instruction {

	public static final String NAME = "NOT";

	public static int opcode = 25;

	public InstructionNOT(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
