package org.icedev.eoc.instructions;

public class InstructionOR extends Instruction {

	public static final String NAME = "OR";

	public static int opcode = 23;

	public InstructionOR(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
