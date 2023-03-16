public class Triangulo extends Figura{
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
}
