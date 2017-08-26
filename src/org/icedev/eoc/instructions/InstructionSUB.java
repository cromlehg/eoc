package org.icedev.eoc.instructions;

public class InstructionSUB extends Instruction {

	public static final String NAME = "SUB";
	
	public static int opcode = 3;
	
	public InstructionSUB(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}
	
}
