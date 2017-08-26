package org.icedev.eoc.instructions;

public class AbstractInstructionMSTORE extends AbstractInstructionWithNumber {

	public static final String NAME = "MSTORE";

	public AbstractInstructionMSTORE(int n, String content, int index) {
		super(n, content, index);
	}

	@Override
	public String getNameBase() {
		return NAME;
	}

}
