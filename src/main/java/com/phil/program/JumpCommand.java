package com.phil.program;

import com.phil.program.lowlevel.Command;

public class JumpCommand  implements Command {
    @Override
    public void execute(int[] registers, int currentCommandIndex) {
        currentCommandIndex += registers[0];
    }

    @Override
    public void dump() {
        System.out.print("jmp");
    }
}
