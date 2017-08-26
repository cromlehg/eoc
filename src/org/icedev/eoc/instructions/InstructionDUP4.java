package org.icedev.eoc.instructions;

public class InstructionDUP4 extends AbstractInstructionDUP {

	public static int opcode = 131;

	public InstructionDUP4(String content, int index) {
		super(4, content, index);
	}

}
