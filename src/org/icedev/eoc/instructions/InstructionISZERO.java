package org.icedev.eoc.instructions;

public class InstructionISZERO extends Instruction {

	public static final String NAME = "ISZERO";

	public static int opcode = 21;

	public InstructionISZERO(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
