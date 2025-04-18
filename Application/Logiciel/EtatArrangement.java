package Logiciel;

import Application.Arrangement;


public interface EtatArrangement {

	void reserver(Arrangement arrangement);
	void liberer(Arrangement arrangement);
	void occuper(Arrangement arrangement);

}