/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Djimy
 *
 */
public class Debit extends Operation {

	/**
	 * @param dateOperation
	 * @param montantOperation
	 */
	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}
	
	public String getType(Operation operation) {
		return "Debit";
	}
}
