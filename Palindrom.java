package janani;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,rem,sum=0;
int n=Integer.parseInt(args[0]);
//System.out.println("enter the number");
//Scanner ja=new Scanner(System.in);
//n=ja.nextInt();
a=n;
while(n!=0){
	rem=n%10;
	sum=sum*10+rem;
	n=n/10;
}
if(sum==a){
	System.out.println("the no is palindrom");
}
else{
		System.out.println("the no is not palindrom");
	}
}
	}


