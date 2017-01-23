package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Primeros {

	public static void main(String[] args) {
		//uno();
		//dos();
		//tresFor(1,14);
		//tresWhile(1,14);
		//tresDoWhile(1,14);
		//cuatro(3);
		//cinco();
		//seis(2);
		siete();
		
		
		

	}


//El siete y el ocho están hecho en el mismo ejercicio
	private static void siete() {
		int iCantidad=0;
		String sArticulo;
		float fPrecioUnitario, fDescuento;
		
		System.out.println("Introduce el nombre del articulo");
		sArticulo = introducirCadena();

		System.out.println("Introduce el precio del articulo");
		fPrecioUnitario = introducirFloat();
		System.out.println("Introduce la cantidad de articulo a comprar");
		iCantidad = introducirEntero();
		fDescuento = descuento(iCantidad);
		
		System.out.println("El precio a pagar por "+iCantidad+" "+sArticulo+"/s es: "+((iCantidad*fPrecioUnitario)-((iCantidad*fPrecioUnitario)*fDescuento))+" €");
		
	}

	private static void seis(int i) {
				
		
		if(i%2==0){
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}

	private static void cinco() {
		
		int iNum = 0;
		boolean error;

		do {
			System.out.println("Introduce 1, 2 o 3");
			try {
				iNum = Integer.parseInt(introducirCadena());
			} catch (NumberFormatException e) {
				System.out.println("hay que introducir números");
				System.exit(0);
			}
		} while (iNum != 1 & iNum != 2 & iNum != 3);

		int iAux = 0;
		while (iAux < 3) {
			switch (iNum) {

			case 1:
				do {
					System.out.println("Introduce un número");
					try {
						error = false;
						iNum = Integer.parseInt(introducirCadena());
					} catch (NumberFormatException e) {
						error = true;
						System.out.println("hay que introducir números");
						System.exit(0);
					}
				} while (error);
				if (iNum % 2 == 0) {
					System.out.println("PAR");
				} else {
					System.out.println("IMPAR");
				}
				break;
			case 2:
				String sNombre = "";

				System.out.println("Introduce tu nombre");
				sNombre = introducirCadena();
				System.out.println(sNombre.length());
				if (sNombre.contains(" ")) {
					System.out.println("C");
				} else {
					System.out.println("NC");
				}
				System.out.println(sNombre.toUpperCase());
				break;
			case 3:
				int iNum1, iNum2, iPares = 0, iImpar = 1;

				iNum1 = introducirEntero();
				iNum2 = introducirEntero();

				for (int i = iNum1; i <= iNum2; i++) {
					System.out.println(i);
					if (i % 2 == 0) {
						iPares = iPares + i;
					} else {
						iImpar = iImpar * i;
					}
				}
				System.out.println("La suma de los números pares es:" + iPares);
				System.out.println("La multiplicación de todos los impares es: " + iImpar);

				break;
			}
		}
	}

	private static void cuatro(int i) {
		switch(i){
		case 1: 
			System.out.println("Lunes");
			break;
		case 2: 
			System.out.println("Martes");
			break;
		case 3: 
			System.out.println("Miércoles");
			break;
		case 4: 
			System.out.println("Jueves");
			break;
		case 5: 
			System.out.println("Viernes");
			break;
		case 6: 
			System.out.println("Sábado");
			break;
		case 7: 
			System.out.println("Domingo");
		
		}
	}

	private static void tresDoWhile(int i, int j) {
		do{
			System.out.println(i);
			i++;
		} while (i<=j);
		
	}

	private static void tresWhile(int i, int j) {
		while(i<=j){
			System.out.println(i);
			i++;
		}
		
	}

	private static void tresFor(int x , int y) {
		for (x=x; x<=y ; x=x+1){
			System.out.println(x);
		}
		
	}

	private static void dos() {
		for (int i = 1; i<10; i=i+2){
			System.out.println(i);
		}
	}

	private static void uno() {
		for(int i = 1 ; i<=10; i++){
			
			if(i%2==0) {
				System.out.println(i+" PAR");
			} else if (i==5) {
				System.out.println("MITAD");
			} else {
				System.out.println(i);
			};
			
		}
		
	}
	
	static String introducirCadena(){
		 String cadena="";
		 
		 
			 InputStreamReader entrada =new InputStreamReader(System.in);
			 BufferedReader teclado= new BufferedReader(entrada);
			 try{
			
			 cadena=teclado.readLine();
			 }
			 catch(IOException er){
	
			 System.out.println("Error al introducir datos");
			 System.exit(0);
			 }
		  
		 return cadena;
		}
	static int introducirEntero(){
		int iNum = 0;
		boolean error;
		do{
			try{
			error=false;
			iNum=Integer.parseInt(introducirCadena());
			}
			catch (NumberFormatException e){
			error=true;
			System.out.println("hay que introducir números");
			}
		}while(error);
		return iNum;
	}
	static float introducirFloat() {
		float fNum = 0;
		boolean error;
		do{
			try{
			error=false;
			fNum=Float.parseFloat(introducirCadena());
			}
			catch (NumberFormatException e){
			error=true;
			System.out.println("hay que introducir números");
			}
		}while(error);
		return fNum;
	}

	static float descuento(int iCantidad) {
		float fDescuento=0;
		if (iCantidad >= 10 & iCantidad < 25){
			fDescuento=(float) 0.1;}
		else if (iCantidad <=100){
			fDescuento = (float) 0.2;
		} else if (iCantidad >100){
			fDescuento = (float) 0.4;
		}
		return fDescuento;
	}
	
}