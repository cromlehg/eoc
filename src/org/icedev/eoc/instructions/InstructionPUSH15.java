package org.icedev.eoc.instructions;

public class InstructionPUSH15 extends AbstractInstructionPUSH {

	public static int opcode = 110;

	public InstructionPUSH15(String content, int index) {
		super(15, content, index);
	}

}
