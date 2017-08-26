package org.icedev.eoc.instructions;

public class InstructionPUSH1 extends AbstractInstructionPUSH {

	public static int opcode = 96;

	public InstructionPUSH1(String content, int index) {
		super(1, content, index);
	}

}
