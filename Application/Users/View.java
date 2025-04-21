package Users;

import java.util.ArrayList;
import java.util.List;

public abstract class View {

	protected Database model;
    protected List<String> menuOptions;
    protected String selectedOption;
    protected String message;

    public View(Database model) {
        this.model = model;
        this.menuOptions = new ArrayList<>();
    }

    public abstract void displayMenu();

}