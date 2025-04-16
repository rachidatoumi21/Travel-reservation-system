package Logiciel;

public interface Command {

	AdminView getInvokes();

	void redo();

	void undo();

}