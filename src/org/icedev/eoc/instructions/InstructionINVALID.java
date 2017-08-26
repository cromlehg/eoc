package org.icedev.eoc.instructions;

public class InstructionINVALID extends Instruction {

	public static final String NAME = "INVALID";

	public static int opcode;

	public InstructionINVALID(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME + " 0x" + content.substring(index, index + INSTRUCTION_ID_SIZE);
	}

}
