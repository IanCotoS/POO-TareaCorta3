import java.lang.Comparable;

public class Triangulo extends Figura implements Comparable<
    Figura>{
    private double base;
    private double altura;
    
    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea() {
        return ((base*altura)/2);
    }

    public int numeroLados(){
        return 3;
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
