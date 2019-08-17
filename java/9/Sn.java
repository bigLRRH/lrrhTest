public class Sn{
	public static void main(String []args){
		double Sn = 0.0;
		for(double n = 1.0;n<=100000000.0;n+=1.0){
			Sn += 1/n;
			System.out.println(Sn);
		}
	}
} 