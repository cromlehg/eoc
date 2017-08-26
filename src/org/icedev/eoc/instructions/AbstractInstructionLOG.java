package org.icedev.eoc.instructions;

public class AbstractInstructionLOG extends AbstractInstructionWithNumber {

	public static final String NAME = "LOG";

	public AbstractInstructionLOG(int n, String content, int index) {
		super(n, content, index);
	}

	@Override
	public String getNameBase() {
		return NAME;
	}

}
