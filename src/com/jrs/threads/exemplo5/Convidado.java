package com.jrs.threads.exemplo5;

public class Convidado implements Runnable{
    private String nome;
    private Banheiro banheiro;
    private AcaoEnum acao;

    public Convidado(String nome, Banheiro banheiro, AcaoEnum acao){
        this.nome = nome;
        this.banheiro = banheiro;
        this.acao = acao;
    }

    @Override
    public void run() {
        if(this.acao.equals(AcaoEnum.NUMERO1)){
            this.banheiro.fazNumero1();
        }else if(this.acao.equals(AcaoEnum.NUMERO2)){
            this.banheiro.fazNumero2();
        }else {
            this.banheiro.limpaBanheiro();
        }
        
    }
}
