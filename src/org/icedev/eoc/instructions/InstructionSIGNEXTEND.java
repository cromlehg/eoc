package org.icedev.eoc.instructions;

public class InstructionSIGNEXTEND extends Instruction {

	public static final String NAME = "SIGNEXTEND";

	public static int opcode = 11;

	public InstructionSIGNEXTEND(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
