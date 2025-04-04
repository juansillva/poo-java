import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void criarProduto(Scanner input) {

        System.out.print("Nome do Produto:");
        this.setNome(input.nextLine());

        System.out.print("Preço:");
        this.setPreco(input.nextDouble());

        System.out.print("Quantidade:");
        this.setQuantidade(input.nextInt());

        input.nextLine();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto novoProduto = new Produto();

        novoProduto.criarProduto(input);

        System.out.println("\n📦 Produto cadastrado com sucesso:");
        System.out.println("Nome: " + novoProduto.getNome());
        System.out.println("Preço: R$" + novoProduto.getPreco());
        System.out.println("Quantidade: " + novoProduto.getQuantidade());
        System.out.println("Valor total em estoque: R$" + novoProduto.calcularValorTotal());

        input.close();

    }
}
