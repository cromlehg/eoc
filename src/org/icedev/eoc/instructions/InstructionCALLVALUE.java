package org.icedev.eoc.instructions;

public class InstructionCALLVALUE extends Instruction {

	public static final String NAME = "CALLVALUE";

	public static int opcode = 52;

	public InstructionCALLVALUE(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
