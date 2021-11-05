import org.junit.Test;

import static org.junit.Assert.*;


public class AvaliacaoTest {

    Avaliacao avaliacao = new Avaliacao();

    @Test
    public void cargaHorariaDeveSerMaiorQue0 () {
        assertThrows(ValoresInvalidosException.class, () -> avaliacao.avalia(2, 2, 3, -1));
    }

    @Test
    public void quantidadeDeFaltasDeveSerMaiorQue0EMenorQueCargaHoraria () {
        assertThrows(ValoresInvalidosException.class, () -> avaliacao.avalia(2, 2, 3, 2));
        assertThrows(ValoresInvalidosException.class, () -> avaliacao.avalia(2, 2, -1, 4));
    }

    @Test
    public void nota1DeveSerMaiorQue0EMenorQue10 () {
        assertThrows(ValoresInvalidosException.class, () -> avaliacao.avalia(-0.1, 2, 3, 4));
        assertThrows(ValoresInvalidosException.class, () -> avaliacao.avalia(10.1, 2, 3, 4));
    }

    @Test
    public void nota2DeveSerMaiorQue0EMenorQue10 () {
        assertThrows(ValoresInvalidosException.class, () -> avaliacao.avalia(2, -0.1, 3, 4));
        assertThrows(ValoresInvalidosException.class, () -> avaliacao.avalia(2, 10.1, 3, 4));
    }

    @Test
    public void seQuantidadeDeFaltasFor25PorcentoDaCargaHorariaDeveSerReprovadoPorMedia () throws ValoresInvalidosException {
       var result = avaliacao.avalia(5, 5, 26,100);
        assertEquals(result, "Reprovado por Falta.");
    }

    @Test
    public void seMediaForMenorQue3DeveSerReprovadoPorMedia () throws ValoresInvalidosException {
        var result = avaliacao.avalia(2.9, 2.9, 25, 100);
        assertEquals(result, "Reprovado por Média.");
    }

    @Test
    public void seMediaForEntre3e6TemDireitoAProvaExtra () throws ValoresInvalidosException {
        var result = avaliacao.avalia(3, 3, 25, 100);
        assertEquals(result, "Prova Extra.");

        result = avaliacao.avalia(5.9, 5.9, 25, 100);
        assertEquals(result, "Prova Extra.");
    }

    @Test
    public void seMediaForMaiorQue6SeraAprovado () throws ValoresInvalidosException {
        var result = avaliacao.avalia(6.1, 6.1, 25, 100);
        assertEquals(result, "Aprovado.");

        result = avaliacao.avalia(6, 6, 25, 100);
        assertEquals(result, "Aprovado.");
    }

}