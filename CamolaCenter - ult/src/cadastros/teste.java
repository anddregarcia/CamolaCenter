/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import java.util.Date;

/**
 *
 * @author AndreSAG
 */
public class teste {

    SELECT DATE_FORMAT(DATA_INICIO, '%m') INI,
            DATE_FORMAT 
         
        (DATA_FIM,'%m') FIM,
       VLR_PARCELA
  FROM CC_CAD_CONTRATO
ORDER BY DATA_INICIO
   
    float fMensal[][];//i = mes; j = ano
    int iMes;
    Date dMesIni, dAnoIni;
            
    while (rst.next ()){
        
        dMesIni = rst.getInt("MES_INI");
        dAnoIni = rst.getInt("ANO_INI");

        while (dDateIni <= rst.getInt("MES_FIM")) {

            fMensal[dDateIni][dAnoIni] = fMensal[dDateIni][dAnoIni] + rst.getFloat("VLR_PARCELA");

            dDataIni = dDataIni + 1; // fazer alguma coisa que some um mês
        }

        rst.next();
    }
}
