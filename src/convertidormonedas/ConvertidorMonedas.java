package convertidormonedas;

import javax.swing.JOptionPane;

public class ConvertidorMonedas {

    public static void main(String[] args) {
        
        String opcionElejida;
        
//        Array de Objectos
        String[] menu =  {
            "Seleccione...",
            "Conversor de Moneda"
        };
        
        opcionElejida = (String) JOptionPane.showInputDialog(null,
                "Seleccione una opción de conversión",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                null,
                menu,
                menu[0]
        );
        
    }

}
