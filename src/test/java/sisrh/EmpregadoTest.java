package sisrh;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sisrh.dto.Empregado;
import java.sql.Date;

public class EmpregadoTest {

	@Test
	public void testCriacaoEmpregado() {
		Empregado emp = new Empregado("1234", "João Silva", new Date(System.currentTimeMillis()), null, 3000.0);

		assertEquals("João Silva", emp.getNome());
		assertEquals("1234", emp.getMatricula());
		assertEquals(3000.0, emp.getSalario());
		assertNotNull(emp.getAdmissao());
		assertNull(emp.getDesligamento());
	}

	@Test
	public void testSalarioEmpregado() {
		Empregado emp = new Empregado("5678", "Maria Souza", new Date(System.currentTimeMillis()), null, 5000.0);

		assertEquals(5000.0, emp.getSalario());
	}

	@Test
	public void testEmpregadoSemDesligamento() {
		Empregado emp = new Empregado("9999", "Carlos Alberto", new Date(System.currentTimeMillis()), null, 4500.0);

		assertNull(emp.getDesligamento());
	}

}
