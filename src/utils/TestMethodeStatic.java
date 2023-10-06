/**
 * 
 */
package utils;

/**
 * @author Djimy Drouet
 *
 */
public class TestMethodeStatic {
	public static int main(String[]args) {
		String chaine="12";
		
		int a=Integer.valueOf(chaine);
		int b=15;
		
		System.out.println(Integer.max(a, b));
		return (Integer.max(a, b));
	}
}
