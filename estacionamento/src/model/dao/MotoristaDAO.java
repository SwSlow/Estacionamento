/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Motorista;

/**
 *
 * @author luisg
 */
public class MotoristaDAO {
        public void create(Motorista m) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement ("INSERT INTO vaga (nome, genero, rg, cpf, numero, email, senha) VALUE (?, ?, ?)"); 
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getGenero());
            stmt.setInt(3, m.getRg());
            stmt.setInt(4, m.getCpf());
            stmt.setInt(5, m.getNumero());
            stmt.setString(6, m.getEmail());
            stmt.setString(7, m.getSenha());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Motorista cadastrado com sucesso!");
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        } 
    }
}
