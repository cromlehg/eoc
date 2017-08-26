package org.icedev.eoc.instructions;

public class InstructionBALANCE extends Instruction {

	public static final String NAME = "BALANCE";

	public static int opcode = 49;

	public InstructionBALANCE(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
