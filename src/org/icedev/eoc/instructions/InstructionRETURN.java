package org.icedev.eoc.instructions;

public class InstructionRETURN extends Instruction {

	public static final String NAME = "RETURN";

	public static int opcode = 243;

	public InstructionRETURN(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
