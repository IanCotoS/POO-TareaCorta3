import java.lang.Comparable;

public class Circulo extends Figura implements Comparable<
    Figura>{
    private double radio;
    
    public Circulo(double pRadio){
        radio = pRadio;
    }

    public double calcularArea() {
        return (radio*radio) * Math.PI;
    }

    public int numeroLados(){
        return 0;
    }

    public int compareTo(Figura figuraPorComparar){
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
        }
    }
}