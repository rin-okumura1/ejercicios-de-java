import java.util.Scanner;

public class ej21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int day ;
        String dayString;
        System.out.println("ingrese un numero del 1 al 7 para indicar el dia de la semana cualquier mayor a 7 no sera valido");
        day=sc.nextInt();
        switch (day) 
        {
            case 1:  dayString = "Lunes";
                     break;
            case 2:  dayString = "Martes";
                     break;
            case 3:  dayString = "Miercoles";
                     break;
            case 4:  dayString = "Jueves";
                     break;
            case 5:  dayString = "Viernes";
                     break;
            case 6:  dayString = "Sabado";
                     break;
            case 7:  dayString = "Domingo";
                     break;
            default: dayString = "Dia invalido";
           
	}
        System.out.println("el dia de hoy es "+dayString);
	}

}
