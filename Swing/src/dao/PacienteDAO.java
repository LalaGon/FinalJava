package dao;

/*
 * Aluna: Laís Gonçalves Senna
 * Matrícula: 0050015880
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.Paciente;

public class PacienteDAO {
	//inserir paciente no banco CRUD - Create, Read, Update, Delete
			public void create(Paciente paciente)
			{
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;
				
				String sql = "insert into paciente(nome, sexo, idade, telefone) values (?, ?, ?, ?)";
				
				try {
					
					
					stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
					stmt.setString(1, paciente.getNome()); //primeiro parametro da query
					stmt.setString(2, paciente.getSexo()); //segundo parametro
					stmt.setInt(3, paciente.getIdade());
					stmt.setString(4, paciente.getTelefone());
					
					stmt.executeUpdate();
					System.out.println("[PacienteDAO] Paciente incluido com sucesso");
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				finally {
					ConnectionFactory.closeConnection(con, stmt);
				}
				
		
			}
			
			//ler todos os registros da tabela paciente
			public List<Paciente> readAll()
			{
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;
				ResultSet rs = null;
				
				String sql = " select id, nome, sexo, idade, telefone from paciente";
				List<Paciente> pacientes = new ArrayList<Paciente>();
				
				try{
					stmt = con.prepareStatement(sql);
					rs = stmt.executeQuery();
					
					while(rs.next())
					{
						Paciente paciente = new Paciente();
						paciente.setId(rs.getInt("id"));
						paciente.setNome(rs.getString("nome"));
						paciente.setSexo(rs.getString("sexo"));
						paciente.setIdade(rs.getInt("idade"));
						paciente.setTelefone(rs.getString("telefone"));
						
						pacientes.add(paciente);
					}
				}
				catch(SQLException e)
				{
					System.out.println("Erro ao tentar ler tabela paciente");
				}
				finally {
					ConnectionFactory.closeConnection(con, stmt);
				}
				
				return pacientes;
			}
			
			//altera os dados de um aluno do banco
			public void update(Paciente paciente) {
				
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;
				
				String sql = "update paciente set nome=?, sexo=?, idade=?, telefone=? where id=?";
				
				try {
					
					
					stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
					stmt.setString(1, paciente.getNome()); //primeiro parametro da query
					stmt.setString(2, paciente.getSexo()); //segundo parametro
					stmt.setInt(3, paciente.getIdade());//terceiro parametro
					stmt.setString(4, paciente.getTelefone());
					stmt.setLong(5, paciente.getId()); 
					
					stmt.executeUpdate();
					System.out.println("[PacienteDAO] Dados alterados com sucesso!");
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				finally {
					ConnectionFactory.closeConnection(con, stmt);
				}
		    }
			
			//deletar uma pessoa do banco
			public void delete(Paciente paciente) {
				
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement stmt = null;
				
				String sql = "delete from paciente where id=?";
				
				try {
					
					
					stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
					stmt.setLong(1, paciente.getId()); //primeiro parametro da query
					
					
					stmt.executeUpdate();
					System.out.println("[PacienteDAO] Paciente deletada com sucesso!");
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				finally {
					ConnectionFactory.closeConnection(con, stmt);
				}
		    }

		

			
			
			
		
}
