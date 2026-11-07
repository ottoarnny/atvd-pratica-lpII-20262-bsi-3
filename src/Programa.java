public class Programa {
    public static void main(String[] args) {
        Produto produto = new Produto("RTX 5070", 24999.0,1000);
        Produto produto2 = new Produto("RTX 5080", 12999.0,500);
        Produto produto3 = new Produto("RTX 5090", 6999.0,100);

        System.out.println("DADOS DOS PRODUTOS");
        System.out.println("PRODUTO 1 " + produto.getNome() + " | PREÇO: R$ " + produto.getPreco() + " | Estoque " + produto.getQtdeEstoque());
        System.out.println("PRODUTO 2 " + produto2.getNome() + " | PREÇO: R$ " + produto2.getPreco() + " | Estoque " + produto2.getQtdeEstoque());
        System.out.println("PRODUTO 3 " + produto3.getNome() + " | PREÇO: R$ " + produto3.getPreco() + " | Estoque " + produto3.getQtdeEstoque());

        System.out.println("\nVALOR DOS ESTOQUES");
        System.out.println("Valor em estoque da RTX 5070: R$ " + String.format("%.2f", produto.calcularValorEstoque()));
        System.out.println("Valor em estoque da RTX 5080: R$ " + String.format("%.2f", produto2.calcularValorEstoque()));
        System.out.println("Valor em estoque da RTX 5090: R$ " + String.format("%.2f", produto3.calcularValorEstoque()));

        double valorTotalGeral = produto.calcularValorEstoque() + produto2.calcularValorEstoque() + produto3.calcularValorEstoque();
        System.out.printf("Valor Total Acumulado em Estoque: R$ " + String.format("%.2f", + valorTotalGeral));

        System.out.println("\n\nTOTAL DE PRODUTO CRIADOS");
        System.out.println("Total de instâncias que foram criadas: " + Produto.getTotalProdutos());

        System.out.println("\nTESTE COM VALORES INVÁLIDOS");
        System.out.println("Instanciando produto com preço e qtde negativos: ");
        Produto produtoInvalido = new Produto("RTX 5090 Super", -99999.0, -1000);
        System.out.println("Preço inserido no produto inválido: R$ " + produtoInvalido.getPreco() + " | Estoque: " + produtoInvalido.getQtdeEstoque());

        System.out.println("\nTeste para alterar o preço do produto 1 para valor negativo via o setter criado: ");
        produto.setPreco(-100.0);
        System.out.println("Preço atual do produto 1 que vai permanecer inalterado: R$ " + produto.getPreco());

    }

    // Respostas Teóricas Final do Arquivo

    // Qual a diferença entre atributo de instância e atributo estático?
    /*
    RESPOSTA: atributo de instância está ligado a cada objeto que é criado
    ou seja cada instância vai ter sua cópia independente de valores seja
    nome, preço... o que for. Já o atributo estático ele pertence a classe
    como um total já que é compartilhado por todas as instancias que existem
    como o contador totalProdutos.
     */

    // Por que utilizamos atributos private?
    /*
    RESPOSTA: O modificador de acesso private é usado devido ao principio de encapsulamento
    que impede o acesso ou modificação direta de fora da classe, numa main no caso, garantindo
    que possamos implementar validações e regras de negócios antes de serem alterados pelo usuario.
     */

    // O que aconteceria se os atributos fossem public?
    /*
    RESPOSTA: Se fossem public qualquer parte do nosso código acima poderia alterar diretamente
    os atributos do nosso objeto por ex o nosso texto com o produto 1 de por valores negativos
    iria deixar passar sem problemas ignorando as validações dos setters quebrando o programa.
     */

    // Qual a função do construtor?
    /*
    RESPOSTA: basicamente o construtor é o método responsável por inicializar o objeto
    em um estado válido no momento de criação, garantindo que o usuário passe os atributos
    solicitados e a execução de procedimentos inicias pedidos no programa como a contagem de instancias
    totalProdutos.
     */

    // Como o encapsulamento ajuda na manutenção do sistema?
    /*
    RESPOSTA: O encapsulamento é essencial pois ele é responsavel por convergir as regras de negócio
    e a validação dentro da nossa classe. Caso as regras mudem no futuro a alteração vai ser muito mais fácil
    graças aos principios de encapsulamento que poderá ser feito em um unico ponto no caso na classe Produto
    com isso sem afetar o restante do sistema como um todo.
     */
}
