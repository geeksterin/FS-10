/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.


*******************************************************************************/
import java.util.HashSet;
import java.util.Set;
public class Main
{
    
	public static void main(String[] args) {
	   // HashMap<Integer, Integer> hm = new HashMap<>();
	   //hm.put(key,value);
	   //hm.remove(key)
	   //hm.containsKey(key);
	   
	   int [] A = {1,2,4,5,6,2,1,4,5,6,5,4,6,6};
	    
		Set<Integer> hs = new HashSet<>();
		
		for(int i = 0; i < A.length; i++){
		    hs.add(A[i]);
		}
		System.out.println(hs.contains(1));
		hs.remove(1);
		
		
		System.out.println(hs.size());
		
	    
	}
}
