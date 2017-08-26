package org.icedev.eoc.instructions;

public class InstructionMULMOD extends Instruction {

	public static final String NAME = "MULMOD";
	
	public static int opcode = 9;
	
	public InstructionMULMOD(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}