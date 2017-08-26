package org.icedev.eoc.instructions;

public class InstructionRETURNDATASIZE extends Instruction {

	public static final String NAME = "RETURNDATASIZE";

	public static int opcode = 61;

	public InstructionRETURNDATASIZE(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
