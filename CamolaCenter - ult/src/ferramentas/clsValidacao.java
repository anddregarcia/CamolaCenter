/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import java.awt.event.KeyEvent;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Osti
 */
public class clsValidacao {

    //Validando tamanho dos campos
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void TamanhoMax(JTextField txtCampo, KeyEvent evt, int tamCampo) {

        String sCampo = txtCampo.getText();
        if (sCampo.length() >= tamCampo) {
            evt.consume();
        }
    }

    public void TamanhoMax(JFormattedTextField txtCampo, KeyEvent evt, int tamCampo) {

        String sCampo = txtCampo.getText();
        if (sCampo.length() >= tamCampo) {
            evt.consume();
        }
    }

    public void TamanhoMax(JEditorPane txtCampo, KeyEvent evt, int tamCampo) {

        String sCampo = txtCampo.getText();
        if (sCampo.length() >= tamCampo) {
            evt.consume();
        }
    }

    public void TamanhoMax(JTextArea txtCampo, KeyEvent evt, int tamCampo) {

        String sCampo = txtCampo.getText();
        if (sCampo.length() >= tamCampo) {
            evt.consume();
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //validando numeros e letras em um campo
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void SomenteNumeroLetras(JTextField txtCampo, KeyEvent evt) {

        int aAsc = 97;//a minusculo na tabela ASC
        int zAsc = 122;//z minusculo na tabela ASC
        int AAsc = 65;//a minusculo na tabela ASC
        int ZAsc = 90;//z minusculo na tabela ASC
        int zeroAsc = 48;//0 em ASC
        int noveAsc = 57;//9 em Asc
        int EspacoAsc = 32;//espaco em Asc

        if ((!(evt.getKeyChar() >= aAsc) && (evt.getKeyChar() <= zAsc))
                && (!(evt.getKeyChar() >= AAsc) && (evt.getKeyChar() <= ZAsc))
                && (!(evt.getKeyChar() >= zeroAsc) && (evt.getKeyChar() <= noveAsc))
                && (!(evt.getKeyChar() == EspacoAsc))) {
            evt.consume();
        }

    }

    public void SomenteNumeroLetras(JFormattedTextField txtCampo, KeyEvent evt) {

        int aAsc = 97;//a minusculo na tabela ASC
        int zAsc = 122;//z minusculo na tabela ASC
        int AAsc = 65;//a minusculo na tabela ASC
        int ZAsc = 90;//z minusculo na tabela ASC
        int zeroAsc = 48;//0 em ASC
        int noveAsc = 57;//9 em Asc
        int EspacoAsc = 32;//espaco em Asc

        if ((!(evt.getKeyChar() >= aAsc) && (evt.getKeyChar() <= zAsc))
                && (!(evt.getKeyChar() >= AAsc) && (evt.getKeyChar() <= ZAsc))
                && (!(evt.getKeyChar() >= zeroAsc) && (evt.getKeyChar() <= noveAsc))
                && (!(evt.getKeyChar() == EspacoAsc))) {
            evt.consume();
        }       
        

    }

    public void SomenteNumeros(JFormattedTextField txtCampo, KeyEvent evt) {

        int zeroAsc = 48;//0 em ASC
        int noveAsc = 57;//9 em Asc



        if (!((evt.getKeyChar() >= zeroAsc) && (evt.getKeyChar() <= noveAsc))) {
            evt.consume();
        }

    }

    public void SomenteNumeros(JTextField txtCampo, KeyEvent evt) {

        int zeroAsc = 48;//0 em ASC
        int noveAsc = 57;//9 em Asc

        if (!((evt.getKeyChar() >= zeroAsc) && (evt.getKeyChar() <= noveAsc))) {
            evt.consume();
        }

    }

    public void SomenteNumerosVirgulas(JTextField txtCampo, KeyEvent evt) {

        int zeroAsc = 48;//0 em ASC
        int noveAsc = 57;//9 em Asc
        int VirgulaAsc = 44; //, em Asc

        if (!((evt.getKeyChar() >= zeroAsc) && (evt.getKeyChar() <= noveAsc))
                && !(evt.getKeyChar() == VirgulaAsc)) {
            evt.consume();
        }

    }

    public void SomenteLetras(JFormattedTextField txtCampo, KeyEvent evt) {

        int aAsc = 97;//a minusculo na tabela ASC
        int zAsc = 122;//z minusculo na tabela ASC
        int AAsc = 65;//a minusculo na tabela ASC
        int ZAsc = 90;//z minusculo na tabela ASC
        int EspacoAsc = 32;//espaco em Asc


        if ((!(evt.getKeyChar() >= aAsc) && (evt.getKeyChar() <= zAsc))
                && (!(evt.getKeyChar() >= AAsc) && (evt.getKeyChar() <= ZAsc))
                && (!(evt.getKeyChar() == EspacoAsc))) {
            evt.consume();
        }
    }

    public void SomenteLetras(JTextField txtCampo, KeyEvent evt) {

        int aAsc = 97;//a minusculo na tabela ASC
        int zAsc = 122;//z minusculo na tabela ASC
        int AAsc = 65;//a minusculo na tabela ASC
        int ZAsc = 90;//z minusculo na tabela ASC
        int EspacoAsc = 32;//espaco em Asc


        if ((!(evt.getKeyChar() >= aAsc) && (evt.getKeyChar() <= zAsc))
                && (!(evt.getKeyChar() >= AAsc) && (evt.getKeyChar() <= ZAsc))
                && (!(evt.getKeyChar() == EspacoAsc))) {
            evt.consume();
        }

    }

    public void SomenteLetras(JEditorPane txtCampo, KeyEvent evt) {

        int aAsc = 97;//a minusculo na tabela ASC
        int zAsc = 122;//z minusculo na tabela ASC
        int AAsc = 65;//a minusculo na tabela ASC
        int ZAsc = 90;//z minusculo na tabela ASC
        int EspacoAsc = 32;//espaco em Asc


        if ((!(evt.getKeyChar() >= aAsc) && (evt.getKeyChar() <= zAsc))
                && (!(evt.getKeyChar() >= AAsc) && (evt.getKeyChar() <= ZAsc))
                && (!(evt.getKeyChar() == EspacoAsc))) {
            evt.consume();
        }

    }

    public void SomenteLetras(JTextArea txtCampo, KeyEvent evt) {

        int aAsc = 97;//a minusculo na tabela ASC
        int zAsc = 122;//z minusculo na tabela ASC
        int AAsc = 65;//a minusculo na tabela ASC
        int ZAsc = 90;//z minusculo na tabela ASC
        int EspacoAsc = 32;//espaco em Asc


        if ((!(evt.getKeyChar() >= aAsc) && (evt.getKeyChar() <= zAsc))
                && (!(evt.getKeyChar() >= AAsc) && (evt.getKeyChar() <= ZAsc))
                && (!(evt.getKeyChar() == EspacoAsc))) {
            evt.consume();
        }

    }

    public void LetrasLogin(JFormattedTextField txtCampo, KeyEvent evt) {

        int aAsc = 97;//a minusculo na tabela ASC
        int zAsc = 122;//z minusculo na tabela ASC
        int AAsc = 65;//a minusculo na tabela ASC
        int ZAsc = 90;//z minusculo na tabela ASC


        if ((!(evt.getKeyChar() >= aAsc) && (evt.getKeyChar() <= zAsc))
                && (!(evt.getKeyChar() >= AAsc) && (evt.getKeyChar() <= ZAsc))) {
            evt.consume();
        }
    }

    public void NumeroLetrasSenha(JFormattedTextField txtCampo, KeyEvent evt) {

        int aAsc = 97;//a minusculo na tabela ASC
        int zAsc = 122;//z minusculo na tabela ASC
        int AAsc = 65;//a minusculo na tabela ASC
        int ZAsc = 90;//z minusculo na tabela ASC
        int zeroAsc = 48;//0 em ASC
        int noveAsc = 57;//9 em Asc

        if ((!(evt.getKeyChar() >= aAsc) && (evt.getKeyChar() <= zAsc))
                && (!(evt.getKeyChar() >= AAsc) && (evt.getKeyChar() <= ZAsc))
                && (!(evt.getKeyChar() >= zeroAsc) && (evt.getKeyChar() <= noveAsc))) {
            evt.consume();
        }

    }

    public static DefaultFormatterFactory setFormatoHora() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("##:##:00");
            comFoco.setPlaceholderCharacter('_');
        } catch (Exception e) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }

    public static DefaultFormatterFactory setFormatoCnpj() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("##.###.###/####-##");
            comFoco.setPlaceholderCharacter('_');
        } catch (Exception e) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }

    public static DefaultFormatterFactory setFormatoInscrEst() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("###.###.###-####");
            comFoco.setPlaceholderCharacter('_');
        } catch (Exception e) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }

    public static DefaultFormatterFactory setFormatoTelefone() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("(##)########");
            comFoco.setPlaceholderCharacter('_');
        } catch (Exception e) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }

    public static DefaultFormatterFactory setFormatoData() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("##/##/####");
            comFoco.setPlaceholderCharacter('_');
        } catch (Exception e) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }

    public static DefaultFormatterFactory setFormatoCPF() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("###.###.###-##");
            comFoco.setPlaceholderCharacter('_');
        } catch (Exception e) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }

    public static DefaultFormatterFactory setFormatoRG() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("##.###.###-A");
            comFoco.setPlaceholderCharacter('_');
        } catch (Exception e) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }

    public static DefaultFormatterFactory setFormatoOE() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("AA");
            comFoco.setPlaceholderCharacter('_');
        } catch (Exception e) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }

    public void BlockPaste(KeyEvent evt) {

        if (KeyEvent.VK_PASTE > 1) {
            evt.consume();
        }
    }
}
