package br.com.jairsantos.Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.jairsantos.principal.Participante;

public class PrincipalTeste {

	@Test
	public void testSetNome() 
	{
		Participante p1 = new Participante();
		p1.setNome("Jose");
		assertEquals("Jose",p1.getNome());
		
	}
	@Test
	public void TestIdade() 
	{
		Participante p1 = new Participante();
		p1.setIdade(40);
		assertEquals(40,p1.getIdade());
	}
	

	

	
	

}
