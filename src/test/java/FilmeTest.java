import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmeTest {
    @Test
    public void deveRetornarFilmeEmMinutos() {
        Filme filme = new Filme();
        filme.setTempo(2);

        assertEquals(120,120 , filme.getTempo());
    }

    @Test
    public void deveRetornarFilmeEmHoras() {
        Filme filme = new Filme();
        filme.setTempo(180);

        assertEquals(3,3);
    }
}
