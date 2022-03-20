import java.sql.Array;
import java.util.ArrayList;

public class Main
{


    public static void main(String[] args)
    {

        String message = "Votre nouveau mot de passe : ";

        for (int i = 0 ; i < 20 ; i++)
        {
            message = message + anyChar();
//            System.out.print(anyChar() + " ");

        }
        System.out.println(message);
    }


    public static char anyChar()
    {
        int choix = randomBounds(0, 3);
        char result;

        switch(choix){

            case 0:
                result = lowerLetter();
                break;

            case 1:
                result = upperLetter();
                break;

            case 2:
                result = number();
                break;

            case 3:
                result = symbol();
                break;
            default:
                result = 0;
                break;
        }
    return result;
    }

    public static char symbol()
    {
        ArrayList<Character> symbols = new ArrayList<Character>();
        symbols.add('#');
        symbols.add('@');
        symbols.add('!');
        symbols.add('?');
        symbols.add('&');

        double random = Math.random() * symbols.size();
        int nombre = (int) random;
        return symbols.get(nombre);



    }

    public static char number()
    {
        int nombre = randomBounds(0, 9);
        String mot = String.valueOf(nombre);
        char result = mot.charAt(0);
        return result;
    }

    public static char lowerLetter()
    {

        int max = 97+25;
        int min = 97;
        int random = randomBounds(min, max);
        char result = (char) random;
        return result;
    }

    public static char upperLetter()
    {

        int max = 65+25;
        int min = 65;
        int random = randomBounds(min, max);
        char result = (char) random;
        return result;
    }

    public static int randomBounds(int min, int max)
    {
        max +=1;
        double random = Math.random() * (max - min) + min;
        return (int)random;
    }


}
