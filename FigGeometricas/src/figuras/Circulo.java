
package figuras;

public class Circulo extends FiguraGeometrica
{
    private double raio;

    public Circulo()
    {
        // atribui o nome da figura 
        this.setNome("Círculo");
        // atribui a quantidade de lados da figura
        this.setNlado(0);
    }

    public Circulo(double raio)
    {
        // atribui o nome da figura
        this.setNome("Círculo");
        // atribui a quantidade de lados da figura
        this.setNlado(0);
        // atribui o valor do raio
        this.setRaio(raio);
    }

    public double getRaio()
    {
        return raio;
    }

    public void setRaio(double raio)
    {
        this.raio = raio;
    }

    @Override
    public double area()
    {
        return Math.PI * Math.pow(this.getRaio(), 2);
    }
}
