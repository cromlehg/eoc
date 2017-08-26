package org.icedev.eoc.instructions;

public class InstructionPUSH6 extends AbstractInstructionPUSH {

	public static int opcode = 101;

	public InstructionPUSH6(String content, int index) {
		super(6, content, index);
	}

}
