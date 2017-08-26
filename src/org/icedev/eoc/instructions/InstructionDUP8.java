package org.icedev.eoc.instructions;

public class InstructionDUP8 extends AbstractInstructionDUP {

	public static int opcode = 135;

	public InstructionDUP8(String content, int index) {
		super(8, content, index);
	}

}
