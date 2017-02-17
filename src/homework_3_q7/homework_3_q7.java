package homework_3_q7;

import java.util.Scanner;

public class homework_3_q7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Temperature a       = new Temperature( );
		Temperature b       = new Temperature( -40, 'c');
		String scale=" ";
		
		System.out.println("�п�Ja���ū�");
		a.setTemperatureValue(keyboard.nextDouble());
		System.out.println("�п�Ja���ż�");
		
		for(int i=0;i<1;i++){
		scale=keyboard.next();
		if(((scale.charAt(0))=='c')||((scale.charAt(0))=='C')||((scale.charAt(0))=='F')||((scale.charAt(0))=='f')){
			continue;
			
		}
		else{
			i--;
			System.out.println("�п�Jf��c");
		
		}
		
		}
		a.setTemperatureScale(scale.charAt(0));
				
		if(a.equals(b)){
			System.out.println("they are equals\n");
		}
		else
		{
			if(a.isGreater(b)){
				System.out.println("a is greater than b\n");
			}
			else{
				System.out.println("a is lower than b\n");
				
			}
		}
		
		System.out.println("a is  "+a.toString());
		System.out.println("b is  "+b.toString());
		
		keyboard.close();
		
		
		
		
		
		
		
		
		
		

	}

}
