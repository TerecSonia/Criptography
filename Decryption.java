import static java.lang.StrictMath.abs;

public class Decryption {

    private String text;
    private int key;

    //list is an array with the alphabet letters
    private char[] list;

    //nrText is an array with the numerical values for the letters from the text
    private int[] nrText;

    //string with the decrypted text
    private String plainText;

    public Decryption(String text, int key) {
        this.text = text;
        this.key = key;
        this.nrText=new int[this.text.length()];
        this.plainText="";
        this.list=new char[]{' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


        String text1=this.text.toLowerCase(); //we make sure that all letters are lowercase letter
        int k=0;

        //converts each letter into its corresponding number
        for (int i=0;i<text1.length();i++)
        {
            for (int j=0;j<this.list.length;j++)
            {
                if (text1.charAt(i)==this.list[j])
                {
                    this.nrText[k]=j;
                    k++;
                }
            }
        }

    }

    public String getText() {
        return text;
    }

    public int getKey() {
        return key;
    }


    public String getPlainText() {
        return plainText;
    }


    //decryption function for the text
    public void decrypt()
    {

        for (int i=0;i<this.nrText.length;i++)
        {
            this.plainText=this.plainText+this.list[abs((27+this.nrText[i]-this.key)%27)];
            //this.cypherText=this.cypherText+this.list[(this.nrText[i]+this.key)%this.list.length];
        }

    }

}
