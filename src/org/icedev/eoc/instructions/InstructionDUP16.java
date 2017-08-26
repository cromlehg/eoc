package org.icedev.eoc.instructions;

public class InstructionDUP16 extends AbstractInstructionDUP {

	public static int opcode = 143;

	public InstructionDUP16(String content, int index) {
		super(16, content, index);
	}

}
