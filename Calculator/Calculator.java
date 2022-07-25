import java.util.*;
class Calculator{
	public static void main(String args[]){
		Scanner sn=new Scanner(System.in);
		System.out.println("Please enter . to see the result");
		System.out.print("Enter a value : ");
		int a=sn.nextInt();
		System.out.print("Enter b value : ");
		int b=sn.nextInt();
		System.out.print("Enter operator : ");
		char c=sn.next().charAt(0);
		switch(c){
			case '+' :System.out.println(a+"+"+b+"="+(a+b));
			           break;
			case '-' :{
				       System.out.println(a+"-"+b+"="+(a-b));
					   break;
			}
			case '*' : System.out.println(a+"*"+b+"="+(a*b));
			           break;
		    case '/' : System.out.println(a+"/"+b+"="+(a/b));
			            break;
			default  : System.out.println("Wrong Operator entered");
			break;
		}
	}
}