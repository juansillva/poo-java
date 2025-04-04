// package carro; 

public class Carro {
    private String modelo;
    private boolean ligado;
    private int velocidade;

    public boolean ligarCarro(){
      this.ligado = true;
      return this.ligado;
    } 

    public boolean desligarCarro(){
        this.ligado = false;
        this.velocidade = 0;
        return this.ligado;
    } 

    public void acelerarCarro(){
        if (this.ligado == true){
            this.velocidade += 10;
        }
    }

    
    public void frearCarro(){
        if (this.velocidade > 0){
            this.velocidade -= 10;
        }
    }

    public static void main (String[] args) {
        Carro meuCarro = new Carro();
    
        System.out.println("Ligando o carro...");
        meuCarro.ligarCarro();
    
        System.out.println(" Acelerando...");
        meuCarro.acelerarCarro();
    
        System.out.println(" Freando...");
        meuCarro.frearCarro();
    
        System.out.println("Desligando...");
        meuCarro.desligarCarro();
    }
    
}




