package org.icedev.eoc.instructions;

public class InstructionBYTE extends Instruction {

	public static final String NAME = "BYTE";

	public static int opcode = 26;

	public InstructionBYTE(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
