package com.phil.program;

import com.phil.program.lowlevel.Command;

public class WriteCommand implements Command {
    private final String address;
    private final int registerNumberToWriteFrom;

    public WriteCommand(String address, int registerNumberToWriteFrom) {
        this.address = address;
        this.registerNumberToWriteFrom = registerNumberToWriteFrom;
    }

    @Override
    public void execute(int[] registers, int currentCommandIndex) {
        Memory.write(address, registers[registerNumberToWriteFrom]);
        currentCommandIndex++;
    }

    @Override
    public void dump() {
        System.out.print(address + " = " + " r" + registerNumberToWriteFrom);
    }
}
