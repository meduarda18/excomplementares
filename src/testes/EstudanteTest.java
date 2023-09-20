import static org.junit.jupiter.api.Assertions.assertEquals;
public class EstudanteTest {
    @org.junit.jupiter.api.Test
    void testNome() {
        Estudante estudantes = new Estudante("José");
        assertEquals("José", estudantes.getNome());

        estudantes.setNome("Maria");
        assertEquals("Maria", estudantes.getNome());
    }
  }