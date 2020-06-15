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
import model.Atendimento;

public class AtendimentoDAO {
	
	//inserir atendimento no banco CRUD - Create, Read, Update, Delete
	public void create(Atendimento atendimento)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into atendimento(data, hora, nome_medico, nome_paciente) values (?, ?, ?, ?)";
		
		try {
			
			
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, atendimento.getData()); //primeiro parametro da query
			stmt.setString(2, atendimento.getHora()); //segundo parametro
			stmt.setString(3, atendimento.getNome_medico());
			stmt.setString(4, atendimento.getNome_paciente());
			
			stmt.executeUpdate();
			System.out.println("[AtendimentoDAO] Atendimento incluido com sucesso");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		

	}
	
	//ler todos os registros da tabela atendimento
	public List<Atendimento> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = " select id, data, hora, nome_medico, nome_paciente from atendimento";
		List<Atendimento> atendimentos = new ArrayList<Atendimento>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Atendimento atendimento = new Atendimento();
				atendimento.setId(rs.getInt("id"));
				atendimento.setData(rs.getString("data"));
				atendimento.setHora(rs.getString("hora"));
				atendimento.setNome_medico(rs.getString("nome_medico"));
				atendimento.setNome_paciente(rs.getString("nome_paciente"));
				
				atendimentos.add(atendimento);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro ao tentar ler tabela atendimento");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		return atendimentos;
	}
	
	//altera os dados de um atendimento do banco
	public void update(Atendimento atendimento) {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update atendimento set data=?, hora=?, nome_medico=?, nome_paciente=? where id=?";
		
		try {
			
			
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, atendimento.getData()); //primeiro parametro da query
			stmt.setString(2, atendimento.getHora()); //segundo parametro
			stmt.setString(3, atendimento.getNome_medico());//terceiro parametro
			stmt.setString(4, atendimento.getNome_paciente());
			stmt.setLong(5, atendimento.getId()); 
			
			stmt.executeUpdate();
			System.out.println("[AtendimentoDAO] Dados alterados com sucesso!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
    }
	
	//deletar um atendimento do banco
	public void delete(Atendimento atendimento) {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from atendimento where id=?";
		
		try {
			
			
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setLong(1, atendimento.getId()); //primeiro parametro da query
			
			
			stmt.executeUpdate();
			System.out.println("[AtendimentoDAO] Atendimento deletada com sucesso!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
    }



	
	
	


}
