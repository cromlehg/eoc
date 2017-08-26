package org.icedev.eoc.instructions;

public class InstructionSWAP16 extends AbstractInstructionSWAP {

	public static int opcode = 159;

	public InstructionSWAP16(String content, int index) {
		super(16, content, index);
	}

}
