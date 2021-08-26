package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class ExitCommand extends Command{

    public ExitCommand(String input) {
        super(input);
    }

    @Override
    public boolean execute(TaskList taskList, Ui ui, Storage storage) {
        return false;
    }


}