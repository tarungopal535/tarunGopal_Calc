package epamcalc;

import java.util.Scanner;
class GetNumbers{
	Scanner sc = new Scanner(System.in);
	public double getFirstNumber()
	{
		System.out.print("Enter the First Operand: ");
		double firstNumber = sc.nextDouble();
		return firstNumber;
	}
	public double getSecondNumber() {
		System.out.println("Enter Seond Operand:");
		double secondNumber = sc.nextDouble();
			return secondNumber;
	
	}
}
interface Operation{
	double getResult(double operand1,double operand2);
}
class Add implements Operation{
	public double getResult(double operand1,double operand2) {
		return operand1 + operand2;
	}
}
class Subtract implements Operation{
	public double getResult(double operand1,double operand2) {
		return operand1 - operand2;
	}
	
}
class Multiply implements Operation{
	public double getResult(double operand1,double operand2) {
		return operand1 * operand2;
	}
	
}
class Division implements Operation{
	public double getResult(double operand1,double operand2) {
		double Result = operand1/operand2;
		return Result;
	
	}
	
	
}

public class DemoCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		try {
			
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("======================");
			System.out.println("1.Addition\n2.Subttaction\n3.Multiply\n4.Division\n");
			int choice=0;
			sc = new Scanner(System.in);
			choice = sc.nextInt();
			GetNumbers g = new GetNumbers();
			switch(choice) {
			case 1 : double operand1 = g.getFirstNumber();
					 double operand2 = g.getSecondNumber();
					 Add add = new Add();
					 System.out.println("Sum : "+add.getResult(operand1,operand2));
					 break;
					 
			case 2 : double num1 = g.getFirstNumber();
			 		 double num2 = g.getSecondNumber();
			 		 Subtract sub  = new Subtract();
			 		 System.out.println("difference : "+sub.getResult(num1,num2));
			 		 break;
			 		 
			case 3 : double opr1 = g.getFirstNumber();
			 		 double opr2 = g.getSecondNumber();
			 		 Multiply mul = new Multiply();
			 		 System.out.println("Multiplication Result : "+mul.getResult(opr1,opr2));
			 		 break;
			 		 
			case 4 :
					 double op1 = g.getFirstNumber();
			 		 double op2 = g.getSecondNumber();
			 		 Division div= new Division();
			 		 System.out.println("Division Result : "+div.getResult(op1,op2));
			 		 break;
			 		 
			default : System.out.println("Error!Invalid Operation...");
						return;
				
		         }


	}}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}
