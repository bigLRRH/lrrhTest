import java.util.Scanner; 
public class JiShuQiuHe{
  public static void main(String []args){
	System.out.println("please input a number");
	Scanner in1 = new Scanner(System.in);
	String str = in1.nextLine();
	double K = Double.parseDouble(str);
	System.out.println("the number is "+ K);
	double Sn = 1.0;
	double n = 2.0;
	while (Sn <= K){
		Sn += 1/n;
		n++;
        		}
    int N = (int)n - 1;
	System.out.println(N);
   	
  }
}