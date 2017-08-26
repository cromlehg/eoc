package org.icedev.eoc.instructions;

public class InstructionKECCAK256 extends Instruction {

	public static final String NAME = "KECCAK256";

	public static int opcode = 32;

	public InstructionKECCAK256(String content, int index) {
		super(content, index);
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int endPos() {
		return super.endPos() + SIZE;
	}

	public String getValue() {
		return "0x" + content.substring(super.endPos(), endPos());
	}

	@Override
	public String toString() {
		return super.toString() + " " + getValue();
	}

}
