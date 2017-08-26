package org.icedev.eoc.instructions;

public class InstructionADDMOD extends Instruction {

	public static final String NAME = "ADDMOD";	
	
	public static int opcode = 8;
	
	public InstructionADDMOD(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
