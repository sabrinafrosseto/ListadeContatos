package Business;

import Entity.Contato;
import Repository.ContatoRepository;
import java.util.ArrayList;

public class ContatoBusiness {
	ContatoRepository repositorio;
	
	public ContatoBusiness() {
		repositorio = new ContatoRepository();
	}
	
	public void create(Contato contato)
	{
		repositorio.create(contato);
	}
	
	public ArrayList<Contato> getAll()
	{		
		return repositorio.getAll();
	} 
}