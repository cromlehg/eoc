package org.icedev.eoc.instructions;

public class InstructionSMOD extends Instruction {

	public static final String NAME = "SMOD";

	public static int opcode = 7;

	public InstructionSMOD(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
