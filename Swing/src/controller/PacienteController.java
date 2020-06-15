package controller;

/*
 * Aluna: La�s Gon�alves Senna
 * Matr�cula: 0050015880
 */
import java.util.ArrayList;
import java.util.List;

import dao.PacienteDAO;
import model.Paciente;

public class PacienteController {
	//regra para incluir um paciente
	
			//create
			public void create(Paciente paciente)
			{
				try {
					PacienteDAO dao = new PacienteDAO();
					
					dao.create(paciente);
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erro no Controller");
				}
				finally {
					System.out.println("Fim inser��o");
				}
			}
			
			//update
			public void update(Paciente paciente) {
				try {
					PacienteDAO dao = new PacienteDAO();
					
					dao.update(paciente);
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
			public List<Paciente> readAll()
			{
				List<Paciente> pacientes = new ArrayList<Paciente>();
				try{
					PacienteDAO dao = new PacienteDAO();
					pacientes = dao.readAll();		
				}
				finally {
					//System.out.println("Fim da leitura!");
				}
				
				return pacientes;
			}
			
			//delete
					public void delete(Paciente paciente) {
						try {
							PacienteDAO dao = new PacienteDAO();
							
							dao.delete(paciente);
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
