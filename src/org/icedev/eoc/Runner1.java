package org.icedev.eoc;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.icedev.eoc.instructions.Instruction;
import org.icedev.eoc.instructions.InstructionsFactory;

public class Runner1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String content = "6060604052341561000f57600080fd5b5b60da8061001e6000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff168063e1c7392a14603d575b600080fd5b3415604757600080fd5b604d604f565b005b3373ffffffffffffffffffffffffffffffffffffffff16600060079054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614151560aa57600080fd5b5b5b5600a165627a7a723058201c12f66cc3c502ae7102a55f3b371d38cb3d376a1f172db2894b3625a31bfe8f0029";

		int index = 0;

		List<Instruction> instructions = new ArrayList<Instruction>();

		while (index < content.length() - 2) {
			Instruction instruction = InstructionsFactory.createInstruction(content, index);
			instructions.add(instruction);
			System.out.println(instruction);
			index = instruction.endPos();
		}
	}

}
