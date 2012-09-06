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
 * @author AndreSAG
 */
public class clsCadEmpresaDAO extends clsJdbcDAO {

    public clsCadEmpresaDAO() throws SQLException { //deve informação exceção. Foi um parto pra descobrir
        super();
    }
    clsFunctions function = new clsFunctions(); //Chama a classe

    public ResultSet ListaEstado() throws SQLException {
        String sQuery;

        sQuery = "SELECT UF FROM TB_ESTADOS ORDER BY NOME";
        ResultSet rs = statement.executeQuery(sQuery); //executa query

        return rs;
    }

    public ResultSet ListaCidade(Object sUF) throws SQLException {
        String sQuery;

        sQuery = "SELECT NOME FROM TB_CIDADES ";
        sQuery = sQuery + " WHERE UF = '" + sUF + "'";
        sQuery = sQuery + " ORDER BY NOME";
        ResultSet rs = statement.executeQuery(sQuery); //executa query

        return rs;
    }

    public void InserirEmpresa(clsCadEmpresa Empresa) throws SQLException {

        String sQuery;

        sQuery = "SELECT * ";
        sQuery = sQuery + "FROM CC_CAD_EMPRESA ";
        sQuery = sQuery + "WHERE ID_EMPRESA = " + Empresa.getiCod();

        ResultSet rst = statement.executeQuery(sQuery);

        if (rst.next()) {

            sQuery = "UPDATE CC_CAD_EMPRESA "; //Monta query de UPDATE
            sQuery = sQuery + "SET ";
            sQuery = sQuery + "RAZ_SOCIAL = '" + Empresa.getsRazSocial() + "', ";
            sQuery = sQuery + "NOME_FANTASIA = '" + Empresa.getsFantasia() + "', ";
            sQuery = sQuery + "CNPJ = '" + Empresa.getsCnpj() + "', ";
            sQuery = sQuery + "INSC_EST = '" + Empresa.getsInscrEst() + "', ";
            sQuery = sQuery + "ENDERECO = '" + Empresa.getsRua() + ":" + Empresa.getsNumero() + ";" + Empresa.getsBairro() + "', ";
            sQuery = sQuery + "CIDADE = '" + Empresa.getoCidade() + "', ";
            sQuery = sQuery + "UF_ESTADO = '" + Empresa.getoUF() + "', ";
            sQuery = sQuery + "MISSAO = '" + Empresa.getsMissao() + "', ";
            sQuery = sQuery + "CONTATO = '" + Empresa.getsContNome() + "', ";
            sQuery = sQuery + "TELEFONE_CONT = '" + Empresa.getsTel() + "', ";
            sQuery = sQuery + "CELULAR_CONT = '" + Empresa.getsCel() + "', ";
            sQuery = sQuery + "EMAIL_CONT = '" + Empresa.getsContEmail() + "', ";
            sQuery = sQuery + "DATA_CAD = STR_TO_DATE('" + Empresa.getsData() + "','%d/%m/%Y'), ";
            sQuery = sQuery + "STATUS = " + Empresa.isbStatus() + " ";
            sQuery = sQuery + "WHERE ID_EMPRESA = " + Empresa.getiCod();

            statement.executeUpdate(sQuery);

        } else {

            //Faz INSERT na tabela de Empresa
            sQuery = "INSERT INTO CC_CAD_EMPRESA(ID_EMPRESA, RAZ_SOCIAL, NOME_FANTASIA, CNPJ, INSC_EST, ENDERECO, CIDADE, UF_ESTADO, MISSAO, CONTATO, TELEFONE_CONT, CELULAR_CONT, EMAIL_CONT, DATA_CAD, STATUS) ";
            sQuery = sQuery + "VALUES(";
            sQuery = sQuery + function.ProxRegistro("CC_CAD_EMPRESA", "ID_EMPRESA") + ", ";
            sQuery = sQuery + "'" + Empresa.getsRazSocial() + "', ";
            sQuery = sQuery + "'" + Empresa.getsFantasia() + "', ";
            sQuery = sQuery + "'" + Empresa.getsCnpj() + "', ";
            sQuery = sQuery + "'" + Empresa.getsInscrEst() + "', ";
            sQuery = sQuery + "'" + Empresa.getsRua() + ":" + Empresa.getsNumero() + ";" + Empresa.getsBairro() + "', ";
            sQuery = sQuery + "'" + Empresa.getoCidade() + "', ";
            sQuery = sQuery + "'" + Empresa.getoUF() + "', ";
            sQuery = sQuery + "'" + Empresa.getsMissao() + "', ";
            sQuery = sQuery + "'" + Empresa.getsContNome() + "', ";
            sQuery = sQuery + "'" + Empresa.getsTel() + "', ";
            sQuery = sQuery + "'" + Empresa.getsCel() + "', ";
            sQuery = sQuery + "'" + Empresa.getsContEmail() + "', ";
            sQuery = sQuery + "STR_TO_DATE('" + Empresa.getsData() + "','%d/%m/%Y'), ";
            sQuery = sQuery + Empresa.isbStatus();
            sQuery = sQuery + ")";

            statement.executeUpdate(sQuery);

        }
    }

    public ResultSet ConsultarEmpresa(int iCodEmpresa) throws SQLException {
        String sQuery;

        sQuery = "SELECT ID_EMPRESA, ";
        sQuery = sQuery + "RAZ_SOCIAL, ";
        sQuery = sQuery + "NOME_FANTASIA, ";
        sQuery = sQuery + "CNPJ, ";
        sQuery = sQuery + "INSC_EST, ";
        sQuery = sQuery + "ENDERECO, ";
        sQuery = sQuery + "CIDADE, ";
        sQuery = sQuery + "UF_ESTADO, ";
        sQuery = sQuery + "MISSAO, ";
        sQuery = sQuery + "CONTATO, ";
        sQuery = sQuery + "TELEFONE_CONT, ";
        sQuery = sQuery + "CELULAR_CONT, ";
        sQuery = sQuery + "EMAIL_CONT, ";
        sQuery = sQuery + "DATE_FORMAT(DATA_CAD,'%d/%m/%Y') CADASTRATO, ";
        sQuery = sQuery + "STATUS ";
        sQuery = sQuery + "FROM CC_CAD_EMPRESA ";
        sQuery = sQuery + "WHERE ID_EMPRESA = " + iCodEmpresa + " ";
        sQuery = sQuery + "ORDER BY NOME_FANTASIA";
        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }

    public void ExcluiEmpresa(int iCodEmpresa) throws SQLException {

        String sQuery;

        sQuery = "DELETE FROM CC_CAD_EMPRESA ";
        sQuery = sQuery + " WHERE ID_EMPRESA = " + iCodEmpresa;

        statement.executeUpdate(sQuery);

    }

    public ResultSet ListaEmpresa() throws SQLException {
        String sQuery;

        sQuery = "SELECT ID_EMPRESA CÓD, ";
//        sQuery = sQuery + "RAZ_SOCIAL, ";
        sQuery = sQuery + "NOME_FANTASIA FANTASIA,";
        sQuery = sQuery + "CNPJ, ";
//        sQuery = sQuery + "INSC_EST, ";
//        sQuery = sQuery + "ENDERECO, ";
        sQuery = sQuery + "CIDADE, ";
        sQuery = sQuery + "UF_ESTADO UF, ";
//        sQuery = sQuery + "MISSAO, ";
        sQuery = sQuery + "CONTATO, ";
//        sQuery = sQuery + "TELEFONE_CONT, ";
//        sQuery = sQuery + "CELULAR_CONT, ";
//        sQuery = sQuery + "EMAIL_CONT, ";
        sQuery = sQuery + "DATE_FORMAT(DATA_CAD,'%d/%m/%Y') CADASTRATO, ";
        sQuery = sQuery + "STATUS ";
        sQuery = sQuery + "FROM CC_CAD_EMPRESA ";
        sQuery = sQuery + "ORDER BY NOME_FANTASIA";

        ResultSet rst = statement.executeQuery(sQuery); //executa query

        return rst;
    }
    
    
}
