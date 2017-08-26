package org.icedev.eoc.instructions;

public class InstructionDIV extends Instruction {
	
	public static final String NAME = "DIV";
	
	public static int opcode = 4;

	public InstructionDIV(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}
	
}
