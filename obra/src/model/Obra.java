package src.model;

import java.text.DecimalFormat;

public class Obra {
    private int idObra;
    private String descricao;
    private double valorObra;
    private double valorPago;

    public Obra(int idObra, String descricao, double valorObra) {
        this.idObra = idObra;
        this.descricao = descricao;
        this.valorObra = valorObra;
        this.valorPago = 0;
    }

    public String verificaPagamento(double valor) {
        if (valor <= 0) {
            return "ATENÇÃO!: Pagamento deve ser maior que zero.";
        }

        if (this.valorPago + valor <= this.valorObra) {
            this.valorPago += valor;

            if (this.valorPago == this.valorObra) {
                return String.format("Pagamento de R$ %.2f registrado. Obra paga totalmente.", valor);
            }

            return String.format("Pagamento de R$ %.2f registrado com sucesso. A obra será iniciada...", valor);
        } else {
            return "Erro: Pagamento excede o valor da obra.";
        }
    }

    public String getEmAndamento() {
        if (valorPago == 0) {
            return "Não iniciada";
        } else if (valorPago < valorObra) {
            return "Em andamento";
        } else {
            return "Finalizada";
        }
    }

    public String getResumoObra() {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        return String.format("""
            ===========================================
                          RESUMO DA OBRA               
            ===========================================
             CÓDIGO DA OBRA:     %04d
             DESCRIÇÃO:          %s
             VALOR TOTAL:        R$ %s
             VALOR PAGO:         R$ %s
             VALOR RESTANTE:     R$ %s
             SITUAÇÃO:           %s
            ===========================================
            """,
            this.idObra,
            this.descricao,
            df.format(this.valorObra),
            df.format(this.valorPago),
            df.format(this.valorObra - this.valorPago),
            getEmAndamento()
        );
    }

 

    public int getIdObra() {
        return this.idObra;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorObra() {
        return this.valorObra;
    }

    public double getValorPago() {
        return this.valorPago;
    }
}
