public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double pRadio){
        radio = pRadio;
    }

    public double calcularArea() {
        return ((radio*radio) * Math.PI);
    }

    public int numeroLados(){
        return 0;
    }
}