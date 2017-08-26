package org.icedev.eoc.instructions;

public class InstructionCOINBASE extends Instruction {

	public static final String NAME = "COINBASE";

	public static int opcode = 65;

	public InstructionCOINBASE(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
