package org.icedev.eoc.instructions;

public class InstructionDELEGATECALL extends Instruction {

	public static final String NAME = "DELEGATECALL";

	public static int opcode = 244;

	public InstructionDELEGATECALL(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}
	
}
