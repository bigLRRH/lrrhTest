import java.util.Scanner;
import java.util.Arrays;
public class Jin{
	public static void main(String []args){
		String[] a = new String[7];
		short[] sum = new short[7];
		short max = 0;
		short jmax = 0;
		Scanner in1 = new Scanner(System.in);
		for(short i=0;i<7;i++){
			a[i] = in1.nextLine();
			sum[i] = (short)(Short.parseShort(a[i].substring(0,1)) + Short.parseShort(a[i].substring(2,3)));
		}
		for(short j=6;j>-1;j--){
			if(sum[j] >= max){
				max=sum[j];
				jmax=j;
			}
		}
		if(max >= 8){
			System.out.println(jmax + 1);
		}else{
			System.out.println(0);
		}
	}

}