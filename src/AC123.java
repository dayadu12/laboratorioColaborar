import java.util.Scanner;

public class AC123 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de estudiantes:");
        int NA = sc.nextInt();
        double PA = 0.0d;
        double TOT = 0.0d;
        if (NA==100 || NA>100){
            PA=65.0d;
            TOT=NA*PA;
            System.out.println("Cada alumno debe pagar "+PA+ " y el pago total es "+TOT);
        }else if (NA>49 && NA<100){
            PA=70.5;
            TOT=NA*PA;
            System.out.println("Cada alumno debe pagar "+PA+" y el pago total es "+TOT);

        }else if (NA>29 && NA<50){
            PA=95.5;
            TOT=NA*PA;
            System.out.println("Cada alumno debe pagar "+PA+" y el pago total es "+TOT);
        }else if(NA<30 && NA>0){
            System.out.println("El pago total es 400.0");
        }else{
            System.out.println("Coloque un numero válido");
        }
    }
}
