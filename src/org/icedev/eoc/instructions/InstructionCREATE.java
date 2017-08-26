package org.icedev.eoc.instructions;

public class InstructionCREATE extends Instruction {

	public static final String NAME = "CREATE";

	public static int opcode = 240;

	public InstructionCREATE(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
