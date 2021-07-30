 
import java.util.Scanner; 
 
public class Challenge { 
 
	public static void main(String a[]) throws Exception
	{
        String st;      //contains user input statement 
        String reverse = ""; //will contain reverse characters of the given string
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Statement:"); 
         st=br.readLine();
        System.out.println("The reverse is:");

        /*  Uncomment this solution code 
        for(int i = st. length() - 1; i >= 0; i--) {
        reverse = reverse + st.charAt(i);
        } 
        */ 
        System.out.println(reverse);
 	 
        }  
} 
