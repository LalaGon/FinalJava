package controller;

/*
 * Aluna: Laís Gonçalves Senna
 * Matrícula: 0050015880
 */
import java.util.ArrayList;
import java.util.List;

import dao.MedicoDAO;
import model.Medico;

public class MedicoController {
	//regra para incluir um medico
	
	//create
	public void create(Medico medico)
	{
		try {
			MedicoDAO dao = new MedicoDAO();
			
			dao.create(medico);
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
	public void update(Medico medico) {
		try {
			MedicoDAO dao = new MedicoDAO();
			
			dao.update(medico);
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
	public List<Medico> readAll()
	{
		List<Medico> medicos = new ArrayList<Medico>();
		try{
			MedicoDAO dao = new MedicoDAO();
			medicos = dao.readAll();		
		}
		finally {
			//System.out.println("Fim da leitura!");
		}
		
		return medicos;
	}
	
	//delete
			public void delete(Medico medico) {
				try {
					MedicoDAO dao = new MedicoDAO();
					
					dao.delete(medico);
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
