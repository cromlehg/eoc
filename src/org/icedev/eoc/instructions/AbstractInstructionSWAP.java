package org.icedev.eoc.instructions;

public class AbstractInstructionSWAP extends AbstractInstructionWithNumber {

	public static final String NAME = "SWAP";

	public AbstractInstructionSWAP(int n, String content, int index) {
		super(n, content, index);
	}

	@Override
	public String getNameBase() {
		return NAME;
	}

}
