import java.lang.Comparable; // Para usar la interface

public abstract class Figura implements Comparable<Figura>{ // Al implementar Comparable<Figura> acá,
                                                            // no se necesita implementarlas en las
                                                            // subclases
    // Métodos abstractos
    public abstract double calcularArea();
    public abstract int numeroLados(); // Retorna el número de lados

    // Métodos normales
    public int compareTo(Figura figuraPorComparar){ // Como es el mismo código, no se crea en cada
                                                    // clase, se incluye acá para que lo hereden de Figura
        double areaPorComparar = figuraPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int misLados = this.numeroLados();
        int ladosPorComparar = figuraPorComparar.numeroLados();

        if (miArea==areaPorComparar){
            if (misLados == ladosPorComparar){
                return 0;
            }
            else if (misLados > ladosPorComparar){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        } // Retorna 1, 0 ó -1 dependiendo del área
          // y la cantidad de lados de las figuras
    }
}