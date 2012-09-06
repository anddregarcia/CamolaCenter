/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexao.clsFunctions;
import conexao.clsJdbcDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Andre Garcia
 */
public class clsCadProdutoDAO extends clsJdbcDAO { //cria classe que usa conecção com o banco

    public clsCadProdutoDAO() throws SQLException { //deve informar exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions(); //Chama a classe

    public void InserirProduto(clsCadProduto Produto) throws SQLException { //Método que insere novo Produto
        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_PRODUTO ";
        sQuery = sQuery + " WHERE ID_PROD = " + Produto.getiCodigo();
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_PRODUTO "; //Monta query de UPDATE
            sQuery = sQuery + " SET ";
            sQuery = sQuery + "DESC_PROD = '" + Produto.getsDescProd() + "', ";
            sQuery = sQuery + "UNIDADE_PROD = '" + Produto.getsUnidade() + "', ";
            sQuery = sQuery + "QTD_TOTAL = " + Produto.getfQtdTotal() + ", ";
            sQuery = sQuery + "ESTOQUE_MIN = " + Produto.getfEstoqueMin() + " ";
            sQuery = sQuery + "WHERE ID_PROD = " + Produto.getiCodigo();

            statement.executeUpdate(sQuery);
        } else {

            sQuery = "INSERT INTO CC_CAD_PRODUTO (ID_PROD, DESC_PROD, UNIDADE_PROD, QTD_TOTAL, ESTOQUE_MIN)"; //Monta query de INSERT
            sQuery = sQuery + " VALUES (";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_PRODUTO", "ID_PROD") + ", "; //a função retorna o próximo ID
            sQuery = sQuery + "'" + Produto.getsDescProd() + "', "; //dados digitados na tela
            sQuery = sQuery + "'" + Produto.getsUnidade() + "', ";
            sQuery = sQuery + Produto.getfQtdTotal() + ", ";
            sQuery = sQuery + Produto.getfEstoqueMin() + ") ";
            
            statement.executeUpdate(sQuery); //executa query
        }
    }

    public ResultSet ConsultarProduto(int iProduto) throws SQLException {
        String sQuery;
        clsCadProduto Produto = null;

        sQuery = "SELECT * ";
        sQuery = sQuery + " FROM CC_CAD_PRODUTO ";
        sQuery = sQuery + " WHERE ID_PROD = " + iProduto;
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public void ExcluiProduto(int iProduto) throws SQLException {
        String sQuery;
        clsCadProduto produto = null;

        sQuery = "DELETE FROM CC_CAD_PRODUTO WHERE ID_PROD = " + iProduto + "\n";
        statement.executeUpdate(sQuery);
    }

    public ResultSet ListaProduto() throws SQLException {
        String sQuery;
        clsCadProduto Produto = null;

        sQuery = "SELECT ID_PROD CÓDIGO,";
        sQuery = sQuery + " DESC_PROD 'DESCRIÇÃO',";
        sQuery = sQuery + " UNIDADE_PROD UNIDADE ";
        sQuery = sQuery + " FROM CC_CAD_PRODUTO ";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }


}
