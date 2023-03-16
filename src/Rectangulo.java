public class Rectangulo extends Figura{
    private double base;
    private double altura;
    
    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea() {
        return (base * altura);
    }

    public int numeroLados(){
        return 4;
    }
}
