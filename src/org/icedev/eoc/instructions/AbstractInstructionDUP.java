package org.icedev.eoc.instructions;

public class AbstractInstructionDUP extends AbstractInstructionWithNumber {

	public static final String NAME = "DUP";

	public AbstractInstructionDUP(int n, String content, int index) {
		super(n, content, index);
	}

	@Override
	public int endPos() {
		return super.endPos();
	}

	@Override
	public String getNameBase() {
		return NAME;
	}

}
