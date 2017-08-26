package org.icedev.eoc.instructions;

public class InstructionDUP3 extends AbstractInstructionDUP {

	public static int opcode = 130;

	public InstructionDUP3(String content, int index) {
		super(3, content, index);
	}

}
