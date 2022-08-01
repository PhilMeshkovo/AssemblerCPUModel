package com.phil.program.lowlevel;

public interface Command {
    void execute(int[] registers, int currentCommandIndex);
    void dump();
}
