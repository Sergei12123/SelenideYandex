package at.Pages;

import at.Actions.Actions;
import at.Actions.MapActions;

public enum Applications {
    MAP(new MapActions());
    private final Actions actions;
    <T extends Actions> Applications(T actions)
    {
        this.actions = actions;

    }

    public Actions getActions()
    {
        return actions;
    }
}
