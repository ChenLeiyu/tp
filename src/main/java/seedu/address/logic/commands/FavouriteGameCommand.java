package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class FavouriteGameCommand extends Command {
    public static final String COMMAND_WORD = "favgame";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException("This command should set a game of a user to favourite");
    }
}
