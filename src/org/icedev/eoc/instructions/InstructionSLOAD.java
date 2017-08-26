package org.icedev.eoc.instructions;

public class InstructionSLOAD extends Instruction {

	public static final String NAME = "SLOAD";

	public static int opcode = 84;

	public InstructionSLOAD(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
