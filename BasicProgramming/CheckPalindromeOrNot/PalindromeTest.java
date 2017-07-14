import java.util.Scanner;

/**
 * 
 */

/**
 * @author Gankidi
 *
 */
public class PalindromeTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Scanner
        Scanner s = new Scanner(System.in);
        String inputString = s.next();
        int length = inputString.length();
        int i=0;
        char[] charArray = inputString.toCharArray();
        for(i=0 ; i<length/2 ;i++){
            if(charArray[i]!= charArray[length-1-i]){
                System.out.println("NO");
                break;
            }
        }
        if(i==length/2){
            System.out.println("YES");
        }

	}

}
