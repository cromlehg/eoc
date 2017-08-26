package org.icedev.eoc.instructions;

public class InstructionPUSH3 extends AbstractInstructionPUSH {

	public static int opcode = 98;

	public InstructionPUSH3(String content, int index) {
		super(3, content, index);
	}

}
