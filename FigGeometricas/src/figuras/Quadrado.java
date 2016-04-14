
package figuras;

public class Quadrado extends FiguraGeometrica
{
    /**
     * @var lado double Recebe o valor do lado da figura;
     */
    private double lado;

    /**
     * Construtor da classe
     */
    public Quadrado()
    {
        // atribui o nome da figura
        this.setNome("Quadrado");
        // atribui a quantidade de lados da figura
        this.setNlado(4);
    }

    /**
     * Construtor da classe
     * @param lado double Lado do quadrado
     */
    public Quadrado(double lado)
    {
        // atribui o valor fornecido ao atributo lado
        this.setLado(lado);
        // atribui o nome da figura
        this.setNome("Quadrado");
        // atribui a quantidade de lados da figura
        this.setNlado(4);
    }

    /**
     * Seta valor ao atributo lado
     * @param lado double Lado a ser atribuido
     */
    private void setLado(double lado)
    {
        this.lado = lado;
    }

    /**
     * Retorna o valor do atributo lado
     * @return double
     */
    private double getLado()
    {
        return this.lado;
    }

    @Override
    public double area()
    {
        // multiplica os lados
        return this.getLado() * this.getLado();
    }
    
}
