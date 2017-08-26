package org.icedev.eoc.instructions;

public class InstructionSLT extends Instruction {

	public static final String NAME = "SLT";

	public static int opcode = 18;

	public InstructionSLT(String content, int index) {
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