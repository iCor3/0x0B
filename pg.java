import java.util.Random;
 
public class pg
{
        private static String[] tChar =
                {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                "1","2","3","4","5","6","7","8","9","0",
                "$","-","_","@"
                }; // The String Array List of Characters.
       
        //private static String pFinal = "0x"; // Password start prefix
        private static StringBuilder pFinal = new StringBuilder("0x");
        private static Random ran = new Random(); // Random variable so it generate a random character.
        public static void main(String[] startArg) // Start
        {
                for(int i = 0; i < 25; i++) // Loops 25 times
                {
                        switch(ran.nextInt(2)) // Switches between 0,1,2 so it mixes chars
                        {
                                case 1:
                                	    pFinal.append(tChar[ran.nextInt(tChar.length)].toUpperCase());  // Adds UpperCase.
                                break;
                                case 2:
                                        pFinal.append(tChar[ran.nextInt(tChar.length)]); // Default
                                        break;
                                default:
                                	   pFinal.append(tChar[ran.nextInt(tChar.length)]);  // Default
                        }
                }
                System.out.println(pFinal); // Prints out the Password.
        }
}
