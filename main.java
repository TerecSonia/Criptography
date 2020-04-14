import java.util.ArrayList;
import java.util.Scanner;

public class main {

    //the menu for the console window
    private static void  printMenu() {
        System.out.println("1 Encrypt");
        System.out.println("2 Decrypt");
        System.out.println("0 Exit");
    }


    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        while(true)
        {
            printMenu();
            int command=0;
            System.out.println("Input the command: ");
            command=in.nextInt();
            in.nextLine();
            if (command==0)
            {
                break;
            }
            switch (command)
            {
                case 1:
                    //case 1 for encryption
                    System.out.println("Give the text: ");
                    String text=in.nextLine();
                    System.out.println("Give the key (a letter or a number between 1 and 26)");
                    int key=0;
                    String s=in.nextLine();

                    //if the length of the string is 2,it means the key is a number between 10 and 26
                    if (s.length()==2)
                    {
                        key=Integer.parseInt(s);
                    }
                    else
                    {
                        char c=s.charAt(0);
                        key=Character.getNumericValue(c);

                        //if the key is greater than 9 it means that the string s contained a letter
                        //by substracting 9 we get the numerical value associated for that letter
                        if (key>9)
                        {
                            key=key-9;
                        }
                    }

                    System.out.println(key);
                    Encryption e=new Encryption(text,key);
                    e.encrypt();
                    System.out.println("The encrypted text is:");
                    System.out.println(e.getCypherText());
                    break;
                case 2:
                    //case 2 for decryption
                    System.out.println("Give the text: ");
                    String text1=in.nextLine();
                    System.out.println("Give the key (a letter or a number between 1 and 26)");
                    int key1=0;
                    String s1=in.nextLine();
                    if (s1.length()==2)
                    {
                        key1=Integer.parseInt(s1);
                    }
                    else
                    {
                        char c1=s1.charAt(0);
                        key1=Character.getNumericValue(c1);
                        if (key1>9)
                        {
                            key1=key1-9;
                        }
                    }
                    Decryption d=new Decryption(text1,key1);
                   d.decrypt();
                    System.out.println("The decrypted text is:");
                    System.out.println(d.getPlainText());
                    break;

            }

        }
    }

}
