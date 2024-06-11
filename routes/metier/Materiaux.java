public enum Materiaux implements IRessource
{
	OR			("AU", 	Couleur.OR		),
	ARGENT		("AG", 	Couleur.GRIS	),
	FER			("FE", 	Couleur.JAUNE	),
	ALUMINIUM	("AL", 	Couleur.PALE	),
	NICKEL		("NI", 	Couleur.BLEU	),
	PLATINE		("PT", 	Couleur.VIOLET	),
	CUIVRE		("CO", 	Couleur.MARRON	),
	TITANE		("TI", 	Couleur.VERT	),
	MONNAIE		("NR", 	Couleur.CIAN	);


	private String 	nom;
	private Couleur couleur;

	private int x;
	private int y;

	public static int nbPiece;

	Materiaux(String nom, Couleur couleur)
	{
		this.nom = nom;
	}

	public Couleur getCouleur()
	{
		return this.couleur;
	}

	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}

	public String getNom()
	{
		return this.nom;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public String toString() {
		return this.nom;
	}
}