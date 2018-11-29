package JavaBasics;

public class StringConcept {
	//s1, s2 point to the same memory location
	//s3 is pointed to a different location, separate memory
	//that is why String are immutable, nobody can change and made it final
	//If string is mutable, tomorrow any one can come and change the value of s2, it also effect s1 (other variables)
	
	//2. provides security (string parameters, db connection, api layer, n/w layer)
	// if hacker changes it will impact everywhere
	//3. class loading mechanism > java io packages, reader/writer classes,
	//4. Optimization and Performance > strings are used everywhere, cache servers, hash code internal
	//5. Integer, double, long, float --Wrapper clasess - Immutable and Final
	//6. prevents inheritance, changed after JDK1.5
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		
		String s3 = "c++";
		s2 = "yug";
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
