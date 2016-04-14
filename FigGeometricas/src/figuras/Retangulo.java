
package figuras;

public class Retangulo extends FiguraGeometrica
{
    /**
     * Recebe o valor do lado maior
     * @var double ladoMaior
     */
    private double ladoMaior;

    /**
     * Recebe o valor do lado menor
     * @var double ladoMenor
     */
    private double ladoMenor;

    /**
     * Construtor da classe
     */
    public Retangulo()
    {
        // atribui o nome da figura
        this.setNome("Quadrado");
        // atribui a quantidade de lados da figura
        this.setNlado(4);
    }

    public Retangulo(double lado1, double lado2)
    {
        // atribui o nome da figura
        this.setNome("Retângulo");
        // atribui a quantidade de lados da figura
        this.setNlado(4);
        // verfica qual o maior lado
        if (lado1 > lado2) {
            this.setLadoMaior(lado1);
            this.setLadoMenor(lado2);
        } else {
            this.setLadoMaior(lado2);
            this.setLadoMenor(lado1);
        }
    }

    private double getLadoMenor()
    {
        return ladoMenor;
    }

    private void setLadoMenor(double ladoMenor)
    {
        this.ladoMenor = ladoMenor;
    }

    private double getLadoMaior()
    {
        return ladoMaior;
    }

    private void setLadoMaior(double ladoMaior)
    {
        this.ladoMaior = ladoMaior;
    }

    @Override
    public double area()
    {
        // multiplica os lados
        return this.getLadoMaior() * this.getLadoMenor();
    }
}
