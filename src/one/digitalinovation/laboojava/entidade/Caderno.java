package one.digitalinovation.laboojava.entidade;


import one.digitalinovation.laboojava.entidade.constantes.Materia;

/**
 * Classe que representa um livro, qual é uma especialização de um produto da loja.
 * @author thiago leite
 */
public class Caderno extends Produto {

    /**
     * Gênero do livro.
     */
    private Materia genero;


    public Materia getGenero() {
        return genero;
    }

    public void setGenero(Materia genero) {
        this.genero = genero;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + genero.getFator());
    }

    @Override
    public String toString() {
        return "Caderno{" +
                " genero=" + genero + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}
