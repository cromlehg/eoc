package org.icedev.eoc.instructions;

public class InstructionSTOP extends Instruction {

	public static final String NAME = "STOP";
	
	public static int opcode = 0;

	public InstructionSTOP(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}
	
}
