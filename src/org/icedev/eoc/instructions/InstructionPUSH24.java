package org.icedev.eoc.instructions;

public class InstructionPUSH24 extends AbstractInstructionPUSH {

	public static int opcode = 119;

	public InstructionPUSH24(String content, int index) {
		super(24, content, index);
	}

}
