package org.icedev.eoc.instructions;

abstract public class Instruction {

	public static final int SIZE = 2;

	public static final int INSTRUCTION_ID_SIZE = 1 * SIZE;

	String content;

	int index;

	public Instruction(String content, int index) {
		this.content = content;
		this.index = index;
	}

	public int endPos() {
		return index + INSTRUCTION_ID_SIZE;
	}

	abstract public String getName();

	@Override
	public String toString() {
		return getName();
	}

}
