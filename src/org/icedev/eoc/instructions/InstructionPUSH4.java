package org.icedev.eoc.instructions;

public class InstructionPUSH4 extends AbstractInstructionPUSH {

	public static int opcode = 99;

	public InstructionPUSH4(String content, int index) {
		super(4, content, index);
	}

}
