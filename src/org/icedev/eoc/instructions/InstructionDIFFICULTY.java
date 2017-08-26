package org.icedev.eoc.instructions;

public class InstructionDIFFICULTY extends Instruction {

	public static final String NAME = "DIFFICULTY";

	public static int opcode = 68;

	public InstructionDIFFICULTY(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
