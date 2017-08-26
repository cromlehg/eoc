package org.icedev.eoc.instructions;

public class InstructionPUSH31 extends AbstractInstructionPUSH {

	public static int opcode = 126;

	public InstructionPUSH31(String content, int index) {
		super(31, content, index);
	}

}
