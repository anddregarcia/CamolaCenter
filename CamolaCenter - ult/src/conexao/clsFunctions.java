/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import com.mysql.jdbc.ResultSetMetaData;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andre Garcia
 */
public class clsFunctions extends clsJdbcDAO {

    public clsFunctions() throws SQLException {
        super();
    }

    /***************************************************************************
     * André Garcia
     * A função faz uma consulta no banco e retorna o próxima ID do dado a ser inserido.
     * Pode ser utilizada para qualquer Tabela
     * Para Utilizá-la é necessário informar a tabela e coluna desejada
     ***************************************************************************/
    public int ProxRegistro(String sTabela, String sColuna) throws SQLException {
        String sQuery;
        int iProxReg = 0;

        ResultSet rs = null;

        sQuery = "SELECT IFNULL(MAX(" + sColuna + "), 0) + 1 ID FROM " + sTabela; //Faz consulta no banco
        rs = statement.executeQuery(sQuery); //Executa consulta

        try {//tenta
            if (rs.next()) { //verifica se se retornou valor do banco. Retorna TRUE se sim
                iProxReg = rs.getInt("ID");
            }
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }

        return iProxReg; //retorno da função. Retorna o próximo ID

    }

    /**********************************************************************************
     * André Garcia
     * A função carrega o jTable da tela com um ResultSet informado.
     * Serve para qualquer tela que tenha um jTable.
     * o Código foi pego do site http://javafontes.blogspot.com/2007/05/mtodo-para-carregar-um-jtable-partir-de.html
     */
    public void carregaTabela(ResultSet rs, JTable jTable) throws SQLException {
        Vector tabela = null;
        Vector linhas = null;
        Vector colunas = null;
        int numColunas;

        /* André Garcia
         * Adaptação:- Deve limpar o jTable antes carregar novamente.
         *             Assim, a jTable pode ser recarregada ao executar operações como slvar, alterar e excluir.
         */
        jTable.removeAll();

        ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData(); //Joga as informações do ResultSet
        numColunas = metaData.getColumnCount(); //guarda a qnd de colunas
        colunas = new Vector(); //cria novo vector

        for (int column = 0; column < numColunas; column++) {
            colunas.addElement(metaData.getColumnLabel(column + 1)); //Carrego os nomes da coluna
        }
        tabela = new Vector();
        linhas = new Vector();
        while (rs.next()) {
            Vector novaLinha = new Vector();
            for (int i = 0; i < numColunas; i++) {
                novaLinha.add(rs.getString((String) colunas.get(i))); //adiciona no vector cada linha do ResultSet
            }
            linhas.addElement(novaLinha);
        }
        tabela.add(colunas);
        tabela.add(linhas);
        jTable.setModel(new DefaultTableModel((Vector) tabela.get(1), (Vector) tabela.get(0)));
        

    }

    //Centraliza tela
    public void centerWindow(Component frame) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();

        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }

        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }

        frame.setLocation((screenSize.width - frameSize.width) >> 1, (screenSize.height - frameSize.height) >> 1);
    }

    public void carregaCombo(ResultSet rs, JComboBox oCombobox, String sCampo) throws SQLException {

        oCombobox.removeAllItems(); //remove tudo que está para adicionar as novas informações
        oCombobox.addItem("Escolha...");
        while (rs.next()) {//enquanto tiver registro...
            oCombobox.addItem(rs.getString(sCampo)); //...adiciona no combo
        }
        rs = null;
    }

    //Checa se a data digita é valida
    public boolean ChecaData(String data) {
        boolean retorno = true;

        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yy");
        try {
            f.parse(data);
        } catch (ParseException e) {
            retorno = false;
        }
        return retorno;
    }

    //Checa se a hora digita é valida
    public boolean ChecaHora(String hora) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setLenient(false);
        try {
            sdf.parse(hora);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public String fSysDate() throws SQLException, ParseException {

        String sQuery, sData;
        ResultSet rst;

        sQuery = "SELECT DATE_FORMAT(SYSDATE(),'%d/%m/%Y') SYS_DATA FROM DUAL";
        rst = statement.executeQuery(sQuery);

        rst.first();

        sData = rst.getString("SYS_DATA");

        return sData;

    }

    public int getRowTable(JTable Tabela) {

        Object Col0 = Tabela.getValueAt(Tabela.getSelectedRow(), 0);

        int codigo = (Integer.parseInt(Col0.toString()));
        return codigo;
    }
    
    public void dataSistema (JTextField txtData) throws SQLException, ParseException{
    
    txtData.setText((fSysDate()));
    
    }
    
    public void dataSistema (JFormattedTextField txtData) throws SQLException, ParseException{
    
    txtData.setText((fSysDate()));
    
    }
    
    public ResultSet BuscaUsuario(String sLogin, String sSenha) throws SQLException{

        ResultSet rst;
        String sQuery;

        sQuery = "SELECT LOGIN, ";
        sQuery = sQuery + "TIPO_USUARIO ";
        sQuery = sQuery + "FROM CC_CAD_USUARIO ";
        sQuery = sQuery + "WHERE UPPER(LOGIN) = UPPER('" + sLogin + "') ";
        sQuery = sQuery + "  AND SENHA = '" + sSenha + "' ";

        rst = statement.executeQuery(sQuery);

        if (rst.next()){
            return rst;
        }
        else{
            return null;
        }
    }
    
    
    
    
}
