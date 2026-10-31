public class Ejer6_P1_Briones {
    public static void main(String[] args) {

        int poblacionBacterias = 100;
        int horasTranscurridas = 0;

        while (poblacionBacterias <= 1000000) {

            poblacionBacterias *= 2;
            horasTranscurridas++;

            System.out.println("Hora " + horasTranscurridas + ": " + poblacionBacterias + " bacterias");
        }

        System.out.println("Horas necesarias: " + horasTranscurridas);
        System.out.println("Poblacion final: " + poblacionBacterias);
    }
}
