package org.icedev.eoc.instructions;

public class InstructionPUSH5 extends AbstractInstructionPUSH {

	public static int opcode = 100;

	public InstructionPUSH5(String content, int index) {
		super(5, content, index);
	}

}
