package org.icedev.eoc.instructions;

public class InstructionADDRESS extends Instruction {

	public static final String NAME = "ADDRESS";

	public static int opcode = 48;

	public InstructionADDRESS(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
