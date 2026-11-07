public class Produto {
    private String nome;
    private double preco;
    private int qtdeEstoque;
    private static int totalProdutos = 0;

    public Produto(String nome, double preco, int qtdeEstoque) {

        this.nome = nome;
        setPreco(preco);
        setQtdeEstoque(qtdeEstoque);
        totalProdutos++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0.0) {
            this.preco = preco;
        } else {
            System.out.println("PREÇO INVÁLIDO! APENAS VALORES POSITIVOS!");
        }
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        if(qtdeEstoque >= 0) {
            this.qtdeEstoque = qtdeEstoque;
        } else {
            System.out.println("QUANTIDADE INVÁLIDA! APENAS VALORES POSITIVOS!");
        }
    }

    public static int getTotalProdutos() {
        return totalProdutos;
    }

    public double calcularValorEstoque() {
        return this.preco * this.qtdeEstoque;
    }

}
