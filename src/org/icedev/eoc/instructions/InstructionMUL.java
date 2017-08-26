package org.icedev.eoc.instructions;

public class InstructionMUL extends Instruction {
	
	public static final String NAME = "MUL";
	
	public static int opcode = 2;
	
	public InstructionMUL(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
