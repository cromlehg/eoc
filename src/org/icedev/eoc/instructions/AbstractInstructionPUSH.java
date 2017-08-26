package org.icedev.eoc.instructions;

public class AbstractInstructionPUSH extends AbstractInstructionWithNumber {

	public static final String NAME = "PUSH";

	public AbstractInstructionPUSH(int n, String content, int index) {
		super(n, content, index);
	}

	@Override
	public int endPos() {
		return super.endPos() + getValueSize();
	}

	@Override
	public String getNameBase() {
		return NAME;
	}

	public int getValueSize() {
		return n * SIZE;
	}

	public String getValue() {
		return "0x" + content.substring(super.endPos(), endPos());
	}

	@Override
	public String toString() {
		return super.toString() + " " + getValue();
	}

}
