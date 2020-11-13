    import java.util.Scanner;
    /**
     *   Clase de utilidades
     *   Incluye métodos estáticos
     *   
     *   @author - 
     */
    public class Utilidades
{
    
        /**
         * Dado un número n (asumimos positivo)
         * devueve true si está en octal false en otro caso
         * Un nº está en octal si cada una de sus cifras
         * es un valor entre 0 y 7
         * 
         * (usa bucles while)
         */
        public static boolean estaEnOctal(int n) {
            
        boolean octal = false;
        
        do{int cifra = n / 10;
         if (cifra >= 0 && cifra <= 7){
             octal = true;
            }
         else{
             octal = false;
             return false;
             }
            if(n /10 < 8)
            {octal = true;}
             else{octal = false;break;
         }
        }
         while(n!=0 && n >=8);{
             
         return true;
        }
        
       
    
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    
    public static int contarCifras(int n) {
            int contador = 0;
         while(n>10){
             n = n/10;
             contador++;
             if(n % 2 > 0 && n % 2 < 10 ){contador++;}
            }
        return contador;

    }

   
    
}
