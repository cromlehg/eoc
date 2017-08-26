package org.icedev.eoc.instructions;

public class InstructionPUSH8 extends AbstractInstructionPUSH {
	
	public static int opcode = 103;

	public InstructionPUSH8(String content, int index) {
		super(8, content, index);
	}
	
}
