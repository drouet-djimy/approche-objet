package fr.diginamic.banque.entites;

abstract class Operation {
	String dateOperation;
	double montantOperation;
	
	
	public Operation(String dateOperation, double montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
	
	public String getType(Operation operation) {
		return operation.getType(operation);
	}
	

}
