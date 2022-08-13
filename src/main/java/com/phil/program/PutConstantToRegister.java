package com.phil.program;

import com.phil.program.lowlevel.Command;

public class PutConstantToRegister implements Command {

    private final int registerNumberToWrite;
    private final int constant;

    public PutConstantToRegister(int registerNumberToWrite, int constant) {
        this.registerNumberToWrite = registerNumberToWrite;
        this.constant = constant;
    }

    @Override
    public void execute(int[] registers, int currentCommandIndex) {
        registers[registerNumberToWrite] = constant;
        currentCommandIndex++;
    }

    @Override
    public void dump() {
        System.out.print(String.format("put r %10s %5s", registerNumberToWrite, constant));
    }
}
