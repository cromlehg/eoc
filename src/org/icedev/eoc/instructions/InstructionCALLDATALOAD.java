package org.icedev.eoc.instructions;

public class InstructionCALLDATALOAD extends Instruction {

	public static final String NAME = "CALLDATALOAD";

	public static int opcode = 53;

	public InstructionCALLDATALOAD(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
