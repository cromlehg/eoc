package org.icedev.eoc.instructions;

public class InstructionPUSH32 extends AbstractInstructionPUSH {

	public static int opcode = 127;

	public InstructionPUSH32(String content, int index) {
		super(32, content, index);
	}

}
