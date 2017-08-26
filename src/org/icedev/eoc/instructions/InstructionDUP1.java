package org.icedev.eoc.instructions;

public class InstructionDUP1 extends AbstractInstructionDUP {

	public static int opcode = 128;

	public InstructionDUP1(String content, int index) {
		super(1, content, index);
	}

}
