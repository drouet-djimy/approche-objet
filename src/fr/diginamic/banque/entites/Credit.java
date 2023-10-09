/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Djimy
 *
 */
public class Credit extends Operation {
	
	
	/**
	 * @param dateOperation
	 * @param montantOperation
	 */
	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}

	public String getType(Operation operation) {
		return "Credit";
	}
}
