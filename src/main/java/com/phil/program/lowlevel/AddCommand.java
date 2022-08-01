package com.phil.program.lowlevel;

public class AddCommand extends BaseBinaryCommand implements Command {

    private final int registerNumberForResult;

    public AddCommand(int registerNumberForResult) {
        super(registerNumberForResult, "add");
        this.registerNumberForResult = registerNumberForResult;
    }

    @Override
    protected int executeBinaryCommand(int left, int right) {
        return left + right;
    }
}
