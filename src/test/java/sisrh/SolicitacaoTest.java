package sisrh;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sisrh.dto.Solicitacao;
import java.sql.Date;

public class SolicitacaoTest {

    @Test
    public void testCriacaoSolicitacao() {

        Solicitacao solicitacao = new Solicitacao(1, new Date(System.currentTimeMillis()), "Pedido de Férias", 0, "1234");
        
        assertEquals(1, solicitacao.getId());
        assertEquals("Pedido de Férias", solicitacao.getDescricao());
        assertEquals(0, solicitacao.getSituacao());
        assertEquals("1234", solicitacao.getMatricula());
        assertNotNull(solicitacao.getData());
    }
    @Test
    public void testIdSolicitacao() {
        Solicitacao solicitacao = new Solicitacao(10, new Date(System.currentTimeMillis()), "Pedido de Aumento", 1, "5678");
        
        assertEquals(10, solicitacao.getId());
    }

}
