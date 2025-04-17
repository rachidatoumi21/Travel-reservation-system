package Logiciel;

public abstract class IdGenerator {

	private String lastID;
	private static IdGenerator _instance ;

	public abstract String generateID();

	public abstract IdGenerator getInstance();

}