package org.icedev.eoc.instructions;

public class InstructionBLOCKHASH extends Instruction {

	public static final String NAME = "BLOCKHASH";

	public static int opcode = 64;

	public InstructionBLOCKHASH(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
