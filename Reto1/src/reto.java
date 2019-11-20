/**
 * 
 */

/**
 * @author manu
 *
 */
public class reto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] abecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","y","z"};
		String[] palabra = {"p","o","r"};
		String[] palabraCorrecta;
		
		for (int i = 0; i <= abecedario.length-1; i++) {
			for ( int j = 0; j <= palabra.length-1; j++) {
				if (abecedario[i] == palabra[j]) {
					palabraCorrecta += i;
				}
			}
		}
	}

}
