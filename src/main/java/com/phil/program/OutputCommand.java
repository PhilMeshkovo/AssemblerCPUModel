package com.phil.program;

import com.phil.program.lowlevel.Command;

public class OutputCommand implements Command {
    private final String text;

    public OutputCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(int[] registers, int currentCommandIndex) {
        System.out.print(text);
        currentCommandIndex++;
    }

    @Override
    public void dump() {
        System.out.print("out ");
    }
}
