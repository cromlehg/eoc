package org.icedev.eoc.instructions;

public class InstructionSELFDESTRUCT extends Instruction {

	public static final String NAME = "SELFDESTRUCT";

	public static int opcode = 255;

	public InstructionSELFDESTRUCT(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
