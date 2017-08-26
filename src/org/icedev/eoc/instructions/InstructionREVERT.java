package org.icedev.eoc.instructions;

public class InstructionREVERT extends Instruction {

	public static final String NAME = "REVERT";

	public static int opcode = 253;

	public InstructionREVERT(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
