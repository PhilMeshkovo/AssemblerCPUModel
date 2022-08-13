package com.phil.program.lowlevel;

public abstract class BaseBinaryCommand implements Command {
    private final int registerNumberForResult;
    private final String command;

    protected BaseBinaryCommand(int registerNumberForResult, String command) {
        this.registerNumberForResult = registerNumberForResult;
        this.command = command;
    }

    public void dump() {
        System.out.print(String.format("%3s r %10s %5s", command, registerNumberForResult, " "));
    }

    public void execute(int[] registers, int currentCommandIndex) {
        registers[registerNumberForResult] = executeBinaryCommand(registers[0], registers[1]);
        currentCommandIndex++;
    }

    protected abstract int executeBinaryCommand(int left, int right);
}
