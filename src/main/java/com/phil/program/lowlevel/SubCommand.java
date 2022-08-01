package com.phil.program.lowlevel;

public class SubCommand extends BaseBinaryCommand implements Command {

    private final int registerNumberForResult;

    public SubCommand(int registerNumberForResult) {
        super(registerNumberForResult, "sub");
        this.registerNumberForResult = registerNumberForResult;
    }

    @Override
    protected int executeBinaryCommand(int left, int right) {
        return left - right;
    }
}
