package org.icedev.eoc.instructions;

public class InstructionDUP5 extends AbstractInstructionDUP {

	public static int opcode = 132;

	public InstructionDUP5(String content, int index) {
		super(5, content, index);
	}

}
