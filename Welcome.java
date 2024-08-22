/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}

/** 
* Program ini adalah pengenalan pertama terhadap bagaimana sebuah class dideklarasikan, dan bagaimana pemrograman dari bahasa java dilakukan.
* Program ini akan menghasilkan output "Welcome to Core Java!" dengan dilanjut output "=" sebanyak 8 kali pada baris selanjutnya.
*/
