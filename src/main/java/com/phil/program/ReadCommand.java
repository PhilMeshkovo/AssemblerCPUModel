package com.phil.program;

import com.phil.program.lowlevel.Command;

public class ReadCommand implements Command {
    private final String address;
    private final int registerNumberToSaveReadValue;

    public ReadCommand(String address, int registerNumberToSaveReadValue) {
        this.address = address;
        this.registerNumberToSaveReadValue = registerNumberToSaveReadValue;
    }

    @Override
    public void execute(int[] registers, int currentCommandIndex) {
        registers[registerNumberToSaveReadValue] = Memory.read(address);
        currentCommandIndex++;
    }

    @Override
    public void dump() {
        System.out.print("r" + registerNumberToSaveReadValue + " = " + Memory.read(address) + " " + address);
    }
}
