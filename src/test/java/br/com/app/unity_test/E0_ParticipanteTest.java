package br.com.app.unity_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class E0_ParticipanteTest {

	@Test
	public void testSetNome() {
		E0_Participante p1 = new E0_Participante();
		p1.setNome("Marcio");
		assertEquals("Marcio", p1.getNome());
	}

	@Test
	public void testSetIdade() {
		E0_Participante p2 = new E0_Participante();
		p2.setIdade(31);
		assertEquals(31, p2.getIdade());
	}

	@Test
	public void testSetLastName() {
		E0_Participante p3 = new E0_Participante();
		p3.setLastName("Dallelaste");
		assertEquals("Dallelaste", p3.getLastName());
	}

	@Test
	public void testWeight() {
		E0_Participante p4 = new E0_Participante();

		p4.setWeight(100);

		assertEquals(100, p4.getWeight());
	}
}
