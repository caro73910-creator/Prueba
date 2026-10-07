import java.util.Scanner;

public class programa5 {

    public static void main(String[] args) {

        
        // DATOS DEL ESTUDIANTE
        
        System.out.println("========================================");
        System.out.println("Nombre completo: [Johan Francisco Ricaño Castro]");
        System.out.println("Matricula: [zs25016730]");
        System.out.println("========================================\n");

        Scanner teclado = new Scanner(System.in);

        
        // CONSTANTE: DISTANCIA DE LA CARRERA
        
        final double DISTANCIA = 1500.0;  // metros

        
        // DECLARACION DE VARIABLES
        
        int minutos, segundos;
        int tiempoTotalSegundos;
        double velocidad;

        System.out.println("Calculo de velocidad media - Carrera de 1500 metros");
        System.out.println("(Ingrese 0 minutos y 0 segundos para finalizar)\n");

        
        // CICLO DO-WHILE:
        // Funcion: Repetir la solicitud de tiempos y el calculo
        // de la velocidad media mientras el usuario NO ingrese
        // 0 minutos y 0 segundos. Al menos se ejecuta una vez,
        // por eso se usa do-while en lugar de while.
        
        do {

            
            // SOLICITAR MINUTOS Y SEGUNDOS POR SEPARADO
            
            System.out.print("Ingrese los minutos del corredor: ");
            minutos = teclado.nextInt();

            System.out.print("Ingrese los segundos del corredor: ");
            segundos = teclado.nextInt();

            
            // CONDICIONAL IF:
            // Funcion: Verificar si el usuario ingreso 0 min y 0 seg
            // para finalizar el programa SIN calcular velocidad.
            
            if (minutos == 0 && segundos == 0) {
                System.out.println("\nTiempo 0:00 ingresado. Finalizando el programa...");
            } else {

                
                // CONDICIONAL IF:
                // Funcion: Validar que los segundos esten en el
                // rango correcto (0 a 59). Si no, se muestra error.
                
                if (segundos < 0 || segundos >= 60) {
                    System.out.println("\nError: Los segundos deben estar entre 0 y 59.\n");
                } else {

                    
                    // CONVERSION DEL TIEMPO A SEGUNDOS TOTALES
                    // Formula: tiempo total = (minutos * 60) + segundos
                    
                    tiempoTotalSegundos = (minutos * 60) + segundos;

                    
                    // CONDICIONAL IF:
                    // Funcion: Evitar division entre cero si el
                    // tiempo total resultara en 0 (por seguridad).
                    
                    if (tiempoTotalSegundos == 0) {
                        System.out.println("\nError: El tiempo total no puede ser cero.\n");
                    } else {

                        
                        // CALCULO DE LA VELOCIDAD MEDIA
                        // Formula: v = distancia / tiempo
                        
                        velocidad = DISTANCIA / tiempoTotalSegundos;

                        
                        // MOSTRAR RESULTADOS
                        
                        System.out.println("\n----------------------------------------");
                        System.out.println("Tiempo del corredor: " + minutos + " min " + segundos + " seg");
                        System.out.println("Tiempo total en segundos: " + tiempoTotalSegundos + " s");
                        System.out.println("Distancia recorrida: " + DISTANCIA + " m");
                        System.out.printf("Velocidad media: %.2f m/s%n", velocidad);
                        System.out.println("----------------------------------------\n");
                    }
                }
            }

        } while (minutos != 0 || segundos != 0);

        System.out.println("Gracias por utilizar el programa.");
        teclado.close();
    }
}