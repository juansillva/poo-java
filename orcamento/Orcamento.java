package orcamento;

public class Orcamento {
    private int nrOrcamento;
    private String data;
    private String nomeContato;
    private String telefoneContato;
    private double valor;
    private char situacao;
}

public Orcamento (int nrOrcamento, String data, String nomeContato, String telefoneContato){
    this.nrOrcamento = nrOrcamento;
    this.data = data;
    this.nomeContato = nomeContato;
    this.telefoneContato = telefoneContato;
    this.situacao = '1';
}

public boolean registrarValor(double valor){
    if (situacao == '1'){
        this.valor = valor;
        this.situacao = '2';
        return true;
    }{
        return false;
}
}







