package org.icedev.eoc.instructions;

public class InstructionEXP extends Instruction {

	public static final String NAME = "EXP";
	
	public static int opcode = 10;
	
	public InstructionEXP(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
