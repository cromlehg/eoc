package org.icedev.eoc.instructions;

public class InstructionJUMP extends Instruction {

	public static final String NAME = "JUMP";

	public static int opcode = 86;

	public InstructionJUMP(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
