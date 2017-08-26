package org.icedev.eoc.instructions;

public class InstructionEXTCODESIZE extends Instruction {

	public static final String NAME = "EXTCODESIZE";

	public static int opcode = 59;

	public InstructionEXTCODESIZE(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
