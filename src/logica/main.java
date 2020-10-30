package logica;

import java.util.Scanner;

public class main 
{
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		FabbricaAuto F_Audi = new FabbricaAUDI();
		FabbricaAuto F_BMW = new FabbricaBMW();
		FabbricaAuto F_Mercedes = new FabbricaMERCEDES() ;
		String n = null,d = null;
		
		System.out.println("          CONFIGURAZIONE AUTOMOBILI             ");
		
		while(true) { 
			
		System.out.println("Quale marca di auto preferisci tra : 1) Audi, 2) BMW e 3) Mercedes? ");
		int value = in.nextInt();	
			
		if(value == 1)
		{
			System.out.println("Quale tipologia di auto preferisci tra: 1) Utilitaria, 2) Sportiva, 3) Suv ");
			int v = in.nextInt();
			
			
			
			if(v == 1)	
				F_Audi.creaUtilitaria(n, d);
			else if(v == 2)
				F_Audi.creaSportiva(n, d);
			else if(v == 3)
				F_Audi.creaSuv(n, d);
		}
		else if(value == 2)
		{
			System.out.println("Quale tipologia di auto preferisci tra: 1) Utilitaria, 2) Sportiva, 3) Suv ");
			int v = in.nextInt();
			
			if(v == 1)	
				F_BMW.creaUtilitaria(n, d);
			else if(v == 2)
				F_BMW.creaSportiva(n, d);
			else if(v == 3)
				F_BMW.creaSuv(n, d);
			
		}
		else if( value == 3 )
		{
			System.out.println("Quale tipologia di auto preferisci tra: 1) Utilitaria, 2) Sportiva, 3) Suv ");
			int v = in.nextInt();
			
			if(v == 1)	
				F_Mercedes.creaUtilitaria(n, d);
			else if(v == 2)
				F_Mercedes.creaSportiva(n, d);
			else if(v == 3)
				F_Mercedes.creaSuv(n, d);
		}
		
		System.out.println("Vuoi configurare altre auto? [ 1 -> SI , 2 -> NO ] ");
		
		int value1 = in.nextInt();
			
		if(value1 == 2)
		{
			System.out.println("EXIT");
			break;
		}
		
		
	}
		in.close();
	}

}
