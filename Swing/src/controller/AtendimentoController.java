package controller;

/*
 * Aluna: Laís Gonçalves Senna
 * Matrícula: 0050015880
 */
import java.util.ArrayList;
import java.util.List;

import dao.AtendimentoDAO;
import model.Atendimento;

public class AtendimentoController {
	//regra para incluir um atendimento
	
	//create
	public void create(Atendimento atendimento)
	{
		try {
			AtendimentoDAO dao = new AtendimentoDAO();
			
			dao.create(atendimento);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro no Controller");
		}
		finally {
			System.out.println("Fim inserção");
		}
	}
	
	//update
	public void update(Atendimento atendimento) {
		try {
			AtendimentoDAO dao = new AtendimentoDAO();
			
			dao.update(atendimento);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro no Controller");
		}
		finally {
			System.out.println("Fim update");
		}
	}
	
	//read
	public List<Atendimento> readAll()
	{
		List<Atendimento> atendimentos = new ArrayList<Atendimento>();
		try{
			AtendimentoDAO dao = new AtendimentoDAO();
			atendimentos = dao.readAll();		
		}
		finally {
			//System.out.println("Fim da leitura!");
		}
		
		return atendimentos;
	}
	
	//delete
			public void delete(Atendimento atendimento) {
				try {
					AtendimentoDAO dao = new AtendimentoDAO();
					
					dao.delete(atendimento);
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erro no Controller");
				}
				finally {
					System.out.println("Fim delete");
				}
			}
}

