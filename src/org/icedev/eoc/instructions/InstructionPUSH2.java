package org.icedev.eoc.instructions;

public class InstructionPUSH2 extends AbstractInstructionPUSH {

	public static int opcode = 97;

	public InstructionPUSH2(String content, int index) {
		super(2, content, index);
	}

}
