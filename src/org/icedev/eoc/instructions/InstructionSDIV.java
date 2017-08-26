package org.icedev.eoc.instructions;

public class InstructionSDIV extends Instruction {

	public static final String NAME = "SDIV";
	
	public static int opcode = 5;
	
	public InstructionSDIV(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}
	
}
