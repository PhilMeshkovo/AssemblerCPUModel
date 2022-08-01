package com.phil.program.lowlevel;

public class GtCommand extends BaseBinaryCommand implements Command {

    private final int registerNumberForResult;

    public GtCommand(int registerNumberForResult) {
        super(registerNumberForResult, "gt");
        this.registerNumberForResult = registerNumberForResult;
    }

    @Override
    protected int executeBinaryCommand(int left, int right) {
        return left > right ? 1 : 0;
    }
}
