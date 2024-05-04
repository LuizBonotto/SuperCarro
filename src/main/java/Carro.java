public class Carro {
    private Boolean ligado;
    private Integer velocidadeAtual;

    public Carro() {
        this.ligado = false;
        this.velocidadeAtual = 0;
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
    }

    public void frear() {
        this.velocidadeAtual -= 10;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    public void ligarCarro() {
        this.ligado = true;
    }

    public void desligarCarro() {
        this.ligado = false;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
