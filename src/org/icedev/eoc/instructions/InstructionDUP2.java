package org.icedev.eoc.instructions;

public class InstructionDUP2 extends AbstractInstructionDUP {

	public static int opcode = 129;

	public InstructionDUP2(String content, int index) {
		super(2, content, index);
	}

}
