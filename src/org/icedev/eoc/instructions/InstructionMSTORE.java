package org.icedev.eoc.instructions;

public class InstructionMSTORE extends AbstractInstructionMSTORE {

	public static int opcode = 82;

	public InstructionMSTORE(String content, int index) {
		super(-1, content, index);
	}

}
