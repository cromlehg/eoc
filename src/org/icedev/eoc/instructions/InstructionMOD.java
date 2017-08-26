package org.icedev.eoc.instructions;

public class InstructionMOD extends Instruction {

	public static final String NAME = "MOD";

	public static int opcode = 6;

	public InstructionMOD(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
