package org.icedev.eoc.instructions;

public class InstructionCODESIZE extends Instruction {

	public static final String NAME = "CODESIZE";

	public static int opcode = 56;

	public InstructionCODESIZE(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
