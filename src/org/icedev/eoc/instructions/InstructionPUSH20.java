package org.icedev.eoc.instructions;

public class InstructionPUSH20 extends AbstractInstructionPUSH {

	public static int opcode = 115;

	public InstructionPUSH20(String content, int index) {
		super(20, content, index);
	}

}
