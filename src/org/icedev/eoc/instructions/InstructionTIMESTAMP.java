package org.icedev.eoc.instructions;

public class InstructionTIMESTAMP extends Instruction {

	public static final String NAME = "TIMESTAMP";

	public static int opcode = 66;

	public InstructionTIMESTAMP(String content, int index) {
		super(content, index);
	}
	
	@Override
	public String getName() {
		return NAME;
	}

}
