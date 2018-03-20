package service;

import pacote.Pais;
import dao.PaisDao;;


public class PaisService {
	PaisDao dao = new PaisDao();
	
	public int criar(Pais pais) {
		return dao.criar(pais);
	}
	
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Pais carregar(int id){
		return dao.carregar(id);
	}
	
	public String Maiorpais(int id){
		return dao.maiorPopulacao(id);
	}
	
	public String MenorArea(int id){
		return dao.menorArea(id);
	}
	
	public String[] Vetor3Paise(int id){
		return dao.vetorTresPaises();
	}

}