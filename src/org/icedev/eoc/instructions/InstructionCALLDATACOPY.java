package org.icedev.eoc.instructions;

public class InstructionCALLDATACOPY extends Instruction {

	public static final String NAME = "CALLDATACOPY";

	public static int opcode = 55;

	public InstructionCALLDATACOPY(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
