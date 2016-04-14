
package figuras;

public class FigGeometricas
{

    public static void main(String[] args)
    {
        double[] lados = {1,1,1};
        
        //implementando
        FiguraGeometrica tr1 = new Triangulo(lados);
        FiguraGeometrica rt1 = new Retangulo(11, 8);
        FiguraGeometrica qd1 = new Quadrado(5);
        FiguraGeometrica circ1 = new Circulo(2.5);

        //utilização dos objetos
        Util.msg("Area do " + tr1.getNome() + " = " + tr1.area() + "\n");
        Util.msg("Area do " + rt1.getNome() + " = " + rt1.area() + "\n");
        Util.msg("Area do " + qd1.getNome() + " = " + qd1.area() + "\n");
        Util.msg("Area do " + circ1.getNome() + " = " + circ1.area() + "\n");

        // finaliza a execução da aplicação
        System.exit(0);
    }
    
}
