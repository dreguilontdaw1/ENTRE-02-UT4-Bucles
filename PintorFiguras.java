
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';
    //Atributos que deberian ser variables locales
    int coef;
    int altura;

    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        int coef;//Para cuando usemos una pirámide de 8 de altura por ejemplo(pares)
            if (altura % 2 == 0)
                coef = 1;
            else
                coef = 0;
            
            for(int i=0;i<=(int)(altura)-coef;i++){
                for(int j=0;j<(int)(altura
                
                
                )-i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=2*i;j++){
                    System.out.print("*");
                }
                for(int j=(int)(altura)+i+1;j<altura;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }

      }
    

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
         for(int i=0;i<=(int)(altura) - coef;i++){
                for(int j=0;j<(int)(altura
                
                
                )-i;j++){
                    System.out.print(" ");
                }
                for(int j=(int)(altura)+i+1;j<altura;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }

     }
}
