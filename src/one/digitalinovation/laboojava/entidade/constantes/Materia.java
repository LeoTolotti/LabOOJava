package one.digitalinovation.laboojava.entidade.constantes;

/**
 * Gêneros dos livros vendidos.
 * @author thiago leite
 */
public enum Materia {

    M2(15),

    M3(10),

    M10(5);

    private double fator;

    /**
     * Construtor.
     * @param fator Valor por tipo que influencia no cálculo do frete.
     */
    Materia(double fator) {
        this.fator = fator / 100;
    }

    public double getFator() {
        return fator;
    }
}
