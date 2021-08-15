package Repository;

import java.util.ArrayList;

import Entity.Contato;

public class ContatoRepository {

    ArrayList<Contato> contatos;
    
	public ContatoRepository() {
		contatos = new ArrayList<Contato>();
	}
	
	public void create(Contato contato)
	{
		contatos.add(contato);
	}
	
	public ArrayList<Contato> getAll()
	{		
		return contatos;
	}
}

