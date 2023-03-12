import java.util.Arrays;

public class Geometria{
    public static void main (String args[]){
    
        Figura[] rects = new Figura[6];
        
        rects[0] = new Rectangulo(2.5, 3.0);
        rects[1] = new Triangulo(1.7, 2.2);
        rects[2] = new Circulo(2);
        rects[3] = new Rectangulo(3.5, 1.2);
        rects[4] = new Triangulo(8, 2);
        rects[5] = new Rectangulo(4, 2);

        System.out.println("Sin ordenar:");
        for (int i = 0; i < 6; i++){
            System.out.print(Integer.toString(i) + ". " + rects[i].getClass().getName());
            System.out.println("\tÁrea: " + Double.toString(rects[i].calcularArea()));
        }

        Arrays.sort(rects);
        System.out.println("\nOrdenados:");
        for (int i = 0; i < 6; i++){
            System.out.print(Integer.toString(i) + ". " + rects[i].getClass().getName());
            System.out.println("\tÁrea: " + Double.toString(rects[i].calcularArea()));
        }
    }
}