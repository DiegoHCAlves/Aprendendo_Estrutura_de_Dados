package conceitos_basicos.atribuicao_e_referencia;

public class Objeto {
    Integer valor;

    public Objeto(Integer valor) {
        this.valor = valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.valor.toString();
    }
}
