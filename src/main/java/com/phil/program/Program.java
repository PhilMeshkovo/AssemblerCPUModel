package com.phil.program;

import com.phil.program.lowlevel.Command;
import com.phil.program.lowlevel.LtCommand;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        int[] registers = new int[2];
        var condition = new Command[]{
                new PutConstantToRegister(0, 10),
                new PutConstantToRegister(0, 40),
                new LtCommand(0),
        };
        Command[] ifClause = {
                new OutputCommand(String.format("%24s", "Java better then C#"))
        };
        Command[] elseClause = {
                new OutputCommand(String.format("%24s","Java better then C# more"))
        };

        var commands = new IfCommand(condition, ifClause, elseClause)
                .compile();
        commands = new ArrayList<>(commands);

        for (int i = 0; i < commands.size(); i++) {
            var currentCommand = commands.get(i);
            currentCommand.dump();
            System.out.print(String.format("%10s", " "));
            currentCommand.execute(registers, i);
            RegisterExtensions.dump(registers);
            Memory.dump();
            System.out.println();
        }
    }

}

