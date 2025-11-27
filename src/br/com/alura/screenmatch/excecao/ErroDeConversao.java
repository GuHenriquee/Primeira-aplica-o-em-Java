package br.com.alura.screenmatch.excecao;

public class ErroDeConversao extends RuntimeException {

    private String mensagem;
    public ErroDeConversao(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
