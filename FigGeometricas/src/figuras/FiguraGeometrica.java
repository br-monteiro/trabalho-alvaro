
package figuras;

public class FiguraGeometrica
{
    /**
     * Recebe o nome da figura
     * @var String nomeFig
     */
    protected String nomeFig;

    /**
     * Recebe o número de lados da figura
     * @var int nLados
     */
    protected int nLados;

    /**
     * Seta valor ao atributo nLados
     * @param valor int Valor a ser atribuido
     */
    protected void setNlado(int valor)
    {
        this.nLados = valor;
    }

    /**
     * retorna o valor do atributo nLados
     * @return int
     */
    protected int getNlado()
    {
        return this.nLados;
    }

    /**
     * Seta valor ao atributo nomeFig
     * @param nomeFig String nome a ser atribuito a figura
     */
    protected void setNome(String nomeFig)
    {
        this.nomeFig = nomeFig;
    }

    /**
     * retorna o valor do atributo nomeFig
     * @return String
     */
    public String getNome()
    {
        return this.nomeFig;
    }

    /**
     * Calcula a área da figura geométrica
     * @return double Área da figura
     */
    public double area()
    {
        Util.msg("Método do cálculo de área não implementado");
        return 0;
    }
}
