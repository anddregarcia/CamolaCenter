/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Andre Garcia
 */
public class clsJdbcDAO {

    protected Connection connection;
    protected Statement statement;

    public clsJdbcDAO() throws SQLException {
        // TODO code application logic here
        try {
            openConnection();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
    }

    private void openConnection() throws Exception {

        String driver = "com.mysql.jdbc.Driver"; //Classe do driver JDBC
        String banco = "CamolaCenter"; //Nome do Banco criado
        String host = "localhost"; //Maquina onde está o banco
        String str_conn = "jdbc:mysql://" + host + ":3306/" + banco; //URL de conexão
        String usuario = "root"; //Usuário do banco
        String senha = "root"; //Senha de conexão


        Class.forName(driver).newInstance(); //Carrega o driver

        //Obtém a conexão com o banco
        connection = DriverManager.getConnection(str_conn, usuario, senha);

        statement = (Statement) connection.createStatement();
        //Cria um statement para podermos mandar um SQL para o banco
         //   Statement stmt = dbConn.createStatement();

        //Mandamos o SQL para o banco e obtemos um ResultSet
//               String sql = "SELECT * FROM CC_CAD_TURNO";
//               ResultSet rs = statement.executeQuery(sql);
////
////               //Percorrendo o ResultSet e obtendo os valores do banco
//              while (rs.next()) {
//                    System.out.println(rs.getInt("id_turno"));
//                    System.out.println(rs.getTime("hora_ini"));
//                    System.out.println(rs.getTime("hora_final"));
//                    System.out.println(rs.getString("obs_turno"));
//                    System.out.println("====================================");
//             }

//        } catch (ClassNotFoundException ex) {
//            System.out.println("Não foi possível carregar o driver.");
//            ex.printStackTrace();
//        } catch (SQLException ex) {
//            System.out.println("Problema com o SQL");
//            ex.printStackTrace();
//        }

    }
}
