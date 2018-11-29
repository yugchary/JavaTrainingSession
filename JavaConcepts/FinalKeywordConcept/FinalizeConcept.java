package FinalKeywordConcept;

public class FinalizeConcept {
	
	//final is keyword
	//finally is the block
	//finalize is the  method
	
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		
		
		//if there is no reference to the object in the JVM, garbage collector will kill all the objects to free the space
		//finalize will be  automatically call before gc()
		//just before the gc() method finalize method will be called to clean up the process, just before the object is garbage collected
		System.gc();
	}

}
