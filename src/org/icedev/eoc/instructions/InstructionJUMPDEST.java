package org.icedev.eoc.instructions;

public class InstructionJUMPDEST extends Instruction {

	public static final String NAME = "JUMPDEST";

	public static int opcode = 91;

	public InstructionJUMPDEST(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
