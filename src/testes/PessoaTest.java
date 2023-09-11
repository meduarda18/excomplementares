import static org.junit.jupiter.api.Assertions.assertEquals;
public class PessoaTest {
    @org.junit.jupiter.api.Test
    void testNome() {
        Pessoa pessoas = new Pessoa("José");
        assertEquals("José", pessoa.getNome());

        pessoas.setNome("Maria");
        assertEquals("Maria", pessoas.getNome());
    }

    void testIdade(){
      Pessoa pessoas = new Pessoa(18);
      assertEquals(18, pessoa.getIdade());

      pessoas.setNome("Maria");
      assertEquals("Maria", pessoas.getNome());

    }

    void testEndereco(){
      Pessoa pessoas = new Pessoa("Rua José de Andrade");
      assertEquals("Rua José de Andrade", pessoa.getEndereco());

    }
  }