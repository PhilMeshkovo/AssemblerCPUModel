package com.phil.program;

import com.phil.program.lowlevel.AddCommand;
import com.phil.program.lowlevel.Command;

import java.util.ArrayList;
import java.util.List;

public class IfCommand {
    private final Command[] condition;
    private final Command[] ifClause;
    private final Command[] elseClause;

    public IfCommand(Command[] condition, Command[] ifClause, Command[] elseClause) {
        this.condition = condition;
        this.ifClause = ifClause;
        this.elseClause = elseClause;
    }

    public List<Command> compile() {
        List<Command> iterable = new ArrayList<>();
        for (Command command : condition) {
            iterable.add(command);
        }
        iterable.add(new PutConstantToRegister(1, 1));
        iterable.add(new AddCommand(0));
        iterable.add(new JumpCommand());

        iterable.add(new PutConstantToRegister(1, elseClause.length + 3));
        iterable.add(new PutConstantToRegister(0, 0));
        iterable.add(new AddCommand(0));
        iterable.add(new JumpCommand());

        for (Command command : ifClause) {
            iterable.add(command);
        }
        iterable.add(new PutConstantToRegister(0, elseClause.length + 1));
        iterable.add(new JumpCommand());
        for (Command command : elseClause) {
            iterable.add(command);
        }
        return iterable;
    }
}
