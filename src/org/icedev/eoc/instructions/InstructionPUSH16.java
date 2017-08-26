package org.icedev.eoc.instructions;

public class InstructionPUSH16 extends AbstractInstructionPUSH {

	public static int opcode = 111;

	public InstructionPUSH16(String content, int index) {
		super(16, content, index);
	}

}
