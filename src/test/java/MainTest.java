import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    /**
     *
     * Criar um carro com os atributos:
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Ligar/Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Só podemos realizar as ações com o carro ligado
     * - A velocidade máxima do nosso carro é de 100km/h
     * - Não existe velocidade negativa
     * - Acelerar + 10km/h (Aumenta 10)
     * - Frear - 10km/h (Diminui 10)
     *
     */

    @Test
    public  void testeDeveLigarCorretamente() {
        // Teste 01 - Validar se o carro liga corretamente
        // Given
        Carro carro = new Carro();
        // When
        carro.ligarCarro();
        Assert.assertEquals(true, carro.getLigado());// Then

        System.out.println("testeDeveLigarCorretamente: " + carro.getLigado());
    }
    @Test
    public  void testeDeveDesligarCorretamente() {
        // Given
        Carro carro = new Carro();
        carro.ligarCarro();

        // When
        carro.desligarCarro();

        // Then
        Assert.assertEquals(false, carro.getLigado());
        System.out.println("testeDeveDesligarCorretamente: " + (carro.getLigado() == false));
    }
    @Test
    public  void testeDeveAcelerarCorretamete() {
        // Dado
        // carro ligado
        Carro carro = new Carro();
        carro.ligarCarro();
        // Quando
        // acelerar
        carro.acelerar();
        // Entao
        // velocidade == ?
        Assert.assertEquals((Integer)  10 , carro.getVelocidadeAtual());
        System.out.println("testeDeveAcelerarCorretamete: " + (carro.getVelocidadeAtual() >= 10));
    }
    @Test
    public  void testeDeveFrearCorretamete() {
        // Dado
        // carro ligado
        Carro carro = new Carro();
        carro.ligarCarro();
        // Quando
        // frear
        carro.frear();
        // Entao
        // velocidade == ?
        Assert.assertEquals((Integer)  0 , carro.getVelocidadeAtual());
        System.out.println("testeDeveAcelerarCorretamete: " + (carro.getVelocidadeAtual() < 10));
    }
    @Test
    public  void testeDeveAcelerar20eFrear10Corretamete() {
        // Dado
        // carro ligado
        Carro carro = new Carro();
        carro.ligarCarro();
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        // Entao
        // velocidade == ?
        Assert.assertEquals((Integer)  10 , carro.getVelocidadeAtual());
        System.out.println("testeDeveAcelerar20eFrear10Corretamete: " + (carro.getVelocidadeAtual() == 10));
    }
}
