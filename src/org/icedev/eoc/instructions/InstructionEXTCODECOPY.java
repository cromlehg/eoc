package org.icedev.eoc.instructions;

public class InstructionEXTCODECOPY extends Instruction {

	public static final String NAME = "EXTCODECOPY";

	public static int opcode = 60;

	public InstructionEXTCODECOPY(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
