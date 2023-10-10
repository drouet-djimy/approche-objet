package fr.diginamic.maison;

public class Maison {

	Piece[] listePieces = new Piece[0];

	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.superficie > 0 && piece.etage >= 0) {
			Piece[] array = new Piece[listePieces.length + 1];

			for (int i = 0; i < listePieces.length; i++) {
				array[i] = listePieces[i];
			}
			array[listePieces.length] = piece;
			listePieces = array;
		}
	}

	public double getSuperficietotale() {
		double superficietotal = 0;
		for (int i = 0; i < listePieces.length; i++) {
			superficietotal = superficietotal + listePieces[i].superficie;
		}
		return superficietotal;
	}

	public double getSuperficieParEtage(int etage) {
		double superficieEtage = 0;
		for (int i = 0; i < listePieces.length; i++) {
			if (listePieces[i].etage == etage) {
				superficieEtage = superficieEtage + listePieces[i].superficie;
			}
		}
		return superficieEtage;
	}

	public double getSuperficieParTypePiece(String type) {
		double superficieType = 0;
		for (int i = 0; i < listePieces.length; i++) {
			if (listePieces[i].getType() == type) {
				superficieType = superficieType + listePieces[i].superficie;
			}
		}
		return superficieType;
	}

	public int getNbPiecesParTypePiece(String type) {
		int nbPiece = 0;
		for (int i = 0; i < listePieces.length; i++) {
			if (listePieces[i].getType() == type) {
				nbPiece = nbPiece+1;
			}
		}
		return nbPiece;
	}

}
