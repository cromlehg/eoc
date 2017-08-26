package org.icedev.eoc.instructions;

public class InstructionXOR extends Instruction {

	public static final String NAME = "XOR";

	public static int opcode = 24;

	public InstructionXOR(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
