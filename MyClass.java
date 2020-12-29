import java.util.*;

class MyClass
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter string to encrypt: ");
	    String str = sc.nextLine();
	    str = str.replaceAll("\\s+","");
	    double sqrt = Math.sqrt(str.length());
	    int rows = (int)(Math.floor(sqrt));
	    int cols = (int)(Math.ceil(sqrt));
	    if (rows != cols) {
            rows++; 
	    }
        String result = "";
        for (int i = 0; i<cols;i++) 
        {
            for (int j=0;j<rows;j++) 
            {
                if (i+j*cols<str.length()) 
                {
                    result+=str.charAt(i+j*cols);
                }
            }
            result+= ' ';
        } 
	    System.out.println("Encrypted string: " + result);
	}
}



/*
 
Test Cases - 

1. 
I/p = haveaniceday
O/p = hae and via ecy 

2 
Enter string to encrypt: feedthedog
Encrypted string: fto ehg ee dd 

Time Complexity - O(N^2)
Space Complexity - O(1)

*/