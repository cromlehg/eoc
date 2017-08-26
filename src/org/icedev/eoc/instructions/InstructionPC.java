package org.icedev.eoc.instructions;

public class InstructionPC extends Instruction {

	public static final String NAME = "PC";

	public static int opcode = 88;

	public InstructionPC(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
