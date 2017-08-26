package org.icedev.eoc.instructions;

public class InstructionPUSH30 extends AbstractInstructionPUSH {

	public static int opcode = 125;

	public InstructionPUSH30(String content, int index) {
		super(30, content, index);
	}

}
