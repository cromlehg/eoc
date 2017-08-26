package org.icedev.eoc.instructions;

public class InstructionJUMPI extends Instruction {

	public static final String NAME = "JUMPI";

	public static int opcode = 87;

	public InstructionJUMPI(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
