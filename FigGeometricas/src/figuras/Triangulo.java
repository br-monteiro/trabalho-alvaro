
package figuras;

public class Triangulo extends FiguraGeometrica
{
    double[] lado = new double[3];

    public Triangulo()
    {
        // atribui o nome da figura
        this.setNome("Triângulo");
        // atribui a quantidade de lados da figura
        this.setNlado(3);
    }

    public Triangulo(double[] lado)
    {
        // atribui o nome da figura
        this.setNome("Triângulo");
        // atribui a quantidade de lados da figura
        this.setNlado(3);
        this.lado[0] = lado[0];
        this.lado[1] = lado[1];
        this.lado[2] = lado[2];
    }

    private double semiPerimetro()
    {
        return (this.lado[0] + this.lado[1] + this.lado[2]) / 2;
    }

    @Override
    public double area()
    {
        double semiPer = this.semiPerimetro();
        return Math.sqrt(semiPer
                * (semiPer - this.lado[0])
                * (semiPer - this.lado[1])
                * (semiPer - this.lado[2]));
    }
    
}
