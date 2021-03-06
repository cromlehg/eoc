package org.icedev.eoc.instructions;

public abstract class AbstractInstructionWithNumber extends Instruction {

	public int n;

	public AbstractInstructionWithNumber(int n, String content, int index) {
		super(content, index);
		this.n = n;
	}

	abstract public String getNameBase();

	@Override
	public String getName() {
		return getNameBase() + (n < 0 ? "" : n);
	}

}
