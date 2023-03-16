package algo ;
class Encrypt
{
	public Encrypt()
	{
		System.out.print("Enter the plain Text: ");
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String pln_txt = scan.nextLine();
        scan.close();
        System.out.println("Plain Text as Input: "+pln_txt);
        
        //code to convert the String input to char array
        char[] plain = new char[pln_txt.length()];
        for (int i = 0; i < pln_txt.length(); i++) 
        {
            plain[i] = pln_txt.charAt(i);
        }
        
        //Fixed Key Value
        int key = 5 ;
        
		//code to perform Encryption Cryptography
        for (int i=0;i<pln_txt.length();i++)
        {
            int temp = plain[i];
            temp=temp+key;
            plain[i]=(char)temp;
        }
        
        // Creating object of string class 
        // and passing character array to its constructor
        String str1 = new String(plain);
        
        // Printing output in form of string
        System.out.println("The Cypher is :"+str1);
	}
}

class Decrypt
{
	public Decrypt()
	{
		System.out.print("Enter the cypher Text: ");
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String cph_txt = scan.nextLine();
        scan.close();
        System.out.println("Cypher Text as Input: "+cph_txt);
        
        //code to convert the String input to char array
        char[] cypher = new char[cph_txt.length()];
        for (int i = 0; i < cph_txt.length(); i++) 
        {
            cypher[i] = cph_txt.charAt(i);
        }
        
        //Fixed key value
        int key = 5 ;
        
		//code to perform Decryption Cryptography
        for (int i=0;i<cph_txt.length();i++)
        {
            int temp = cypher[i];
            temp=temp-key;
            cypher[i]=(char)temp;
        }
        
        // Creating object of string class 
        // and passing character array to its constructor
        String str2 = new String(cypher);
        
        // Printing output in form of string
        System.out.println("The Decoded text is :"+str2);
	}
}

public class Subs_Cypher 
{
	public Subs_Cypher()
	{
		int opt;
        //Starting
        System.out.println("BASIC SUBSTITUTION CYPHER\n");
        
		
		//code to choose an operation
			System.out.println("Choose any one Option\n");
			System.out.println("[ 1.Encrypt \t 2.Decrypt \t 3.Exit ]");
	    
			java.util.Scanner choice = new java.util.Scanner(System.in);
			opt = choice.nextInt();
		
			switch(opt)
			{
				case 1:
				{
					new Encrypt();
				}
				break;
				
				case 2:
				{
					new Decrypt();
				}
				break;
				
				default:
			}
	}
	
    public static void main(String[] args) 
    {
		//
    }
}