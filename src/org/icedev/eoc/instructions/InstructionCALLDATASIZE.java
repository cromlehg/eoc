package org.icedev.eoc.instructions;

public class InstructionCALLDATASIZE extends Instruction {

	public static final String NAME = "CALLDATASIZE";

	public static int opcode = 54;

	public InstructionCALLDATASIZE(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}
	
}
