package org.icedev.eoc.instructions;

public class InstructionCALL extends Instruction {

	public static final String NAME = "CALL";

	public static int opcode = 241;

	public InstructionCALL(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
