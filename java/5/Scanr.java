import java.util.Scanner; 
public class Scanr{
  public static void main(String []args){
	System.out.println("Please input a Number");
	Scanner in1 = new Scanner(System.in);
	String str = in1.nextLine();
	in1.close();
	short K = Short.parseShort(str);
	System.out.println("The Number is "+K);			
  }
}