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
import model.Medico;

public class MedicoDAO {
	//inserir medico no banco CRUD - Create, Read, Update, Delete
	public void create(Medico medico)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into medico(nome, especializacao) values (?, ?)";
		
		try {
			
			
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, medico.getNome()); //primeiro parametro da query
			stmt.setString(2, medico.getEspecializacao()); //segundo parametro
			
			
			stmt.executeUpdate();
			System.out.println("[MedicoDAO] Medico incluido com sucesso");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		

	}
	
	//ler todos os registros da tabela medico
	public List<Medico> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = " select id, nome, especializacao from medico";
		List<Medico> medicos = new ArrayList<Medico>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Medico medico = new Medico();
				medico.setId(rs.getInt("id"));
				medico.setNome(rs.getString("nome"));
				medico.setEspecializacao(rs.getString("especializacao"));
				
				
				medicos.add(medico);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro ao tentar ler tabela medico");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		return medicos;
	}
	
	//altera os dados de um medico do banco
	public void update(Medico medico) {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update medico set nome=?, especializacao=? where id=?";
		
		try {
			
			
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, medico.getNome()); //primeiro parametro da query
			stmt.setString(2, medico.getEspecializacao()); //segundo parametro
			stmt.setLong(3, medico.getId()); 
			
			stmt.executeUpdate();
			System.out.println("[MedicoDAO] Dados alterados com sucesso!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
    }
	
	//deletar uma medico do banco
	public void delete(Medico medico) {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from medico where id=?";
		
		try {
			
			
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setLong(1, medico.getId()); //primeiro parametro da query
			
			
			stmt.executeUpdate();
			System.out.println("[MedicoDAO] Medico deletada com sucesso!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
    }



	
	
	

}
