
package decimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author MaoRivera
 */
public class Decimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a = new BigDecimal ("1.5834186");
       
        BigDecimal resultado = BigDecimal.valueOf(2.554);
        resultado = resultado.setScale(2, RoundingMode.HALF_UP);
        System.out.println(resultado);
    }
    
}
