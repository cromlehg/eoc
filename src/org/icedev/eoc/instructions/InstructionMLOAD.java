package org.icedev.eoc.instructions;

public class InstructionMLOAD extends Instruction {

	public static final String NAME = "MLOAD";

	public static int opcode = 81;

	public InstructionMLOAD(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
