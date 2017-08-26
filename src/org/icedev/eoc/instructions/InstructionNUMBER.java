package org.icedev.eoc.instructions;

public class InstructionNUMBER extends Instruction {

	public static final String NAME = "NUMBER";

	public static int opcode = 67;

	public InstructionNUMBER(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
