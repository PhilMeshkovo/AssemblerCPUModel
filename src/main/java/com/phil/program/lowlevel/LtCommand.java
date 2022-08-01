package com.phil.program.lowlevel;

public class LtCommand extends BaseBinaryCommand implements Command {

    private final int registerNumberForResult;

    public LtCommand(int registerNumberForResult) {
        super(registerNumberForResult, "lt");
        this.registerNumberForResult = registerNumberForResult;
    }

    @Override
    protected int executeBinaryCommand(int left, int right) {
        return left < right ? 1 : 0;
    }
}
