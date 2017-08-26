package org.icedev.eoc.instructions;

public class InstructionDUP10 extends AbstractInstructionDUP {

	public static int opcode = 137;

	public InstructionDUP10(String content, int index) {
		super(10, content, index);
	}

}
