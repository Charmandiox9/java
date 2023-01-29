public class Promedio{
    public static void main(String args[]) {
        
        int matemasticas = 5;
        int biologia = 8;
        int quimica = 7;
        int  promedio = 0;

        promedio = (matemasticas + biologia + quimica) / 3;
        
        if(promedio >= 6) {
            System.out.println("El alumno aprobó con promedio: " + promedio);
        } else  {
            System.out.println("El alumno reprobó con promedio: " + promedio);
        }
    }
}