public class Encryption {

    private String text;
    private int key;
    private char[] list;
    private int[] nrText;
    private String cypherText;

    public Encryption(String text, int key) {
        this.text = text;
        this.key = key;
        this.nrText=new int[this.text.length()];
        this.cypherText="";
        this.list=new char[]{' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        String text1=this.text.toLowerCase();
        int k=0;
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


    public String getCypherText() {
        return cypherText;
    }

    public void encrypt()
    {


        for (int i=0;i<this.nrText.length;i++)
        {
            this.cypherText=this.cypherText+this.list[(this.nrText[i]+this.key)%27];
        }

    }

}
