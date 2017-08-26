package org.icedev.eoc.instructions;

public class InstructionCODECOPY extends Instruction {

	public static final String NAME = "CODECOPY";

	public static int opcode = 57;

	public InstructionCODECOPY(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
