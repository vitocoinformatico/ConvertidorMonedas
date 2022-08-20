package convertidormonedas;

import javax.swing.JOptionPane;

public class ConvertidorMonedas {
    
    public static void main(String[] args) {
       
//        Array de Objectos
        String[] menu =  {
            "Seleccione...",
            "Conversor de Moneda"
        };
        
        String[] tipoMoneda = {
            "De Pesos a Dolar",
            "De Pesos a Euro",
            "De Pesos a Libras",
            "De Pesos a Yen",
            "De pesos a Won",
            
            "De Dolar a Pesos",
            "De Euro a Pesos",
            "De Libras a Pesos",
            "De yen a Pesos",
            "De Won a Peso"
        };
        
        
        String opcionElejida,
                dineroIngresado,
                monedaAConvertir;
        double dolar = 0,
                pesos = 0,
                dineroConvertido = 0;
        int inicio = 0; // Para el ciclo While
        
        
//        Instanciamos esta clase donde estaran todos los calculos de las monedas
        Monedas moneda = new Monedas();
        
 
        while (inicio != 1) {
            opcionElejida = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", 
                    JOptionPane.DEFAULT_OPTION, null, menu, menu[0]);
            
            try {
                switch (opcionElejida) {
                    case "Conversor de Moneda":
                        dineroIngresado = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir", 
                                "Input", JOptionPane.QUESTION_MESSAGE);
                        
               
                        if (!dineroIngresado.isEmpty()) {
                            dineroConvertido = Double.parseDouble(dineroIngresado);

                            monedaAConvertir = (String) JOptionPane.showInputDialog(null,
                                "Elija la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.DEFAULT_OPTION, null, 
                                tipoMoneda, tipoMoneda[0]
                            );

                            if (monedaAConvertir.equalsIgnoreCase("de pesos a dolar")) {
                                moneda.Pesos_Dolar(dineroConvertido);
                            }

                            if (monedaAConvertir.equalsIgnoreCase("de dolar a pesos")) {
                                moneda.Dolar_Pesos(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("de pesos a euro")) {
                                moneda.Pesos_Euro(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("de euro a pesos")) {
                                moneda.Euro_Pesos(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("de pesos a libras")) {
                                moneda.Pesos_LibrasEsterlinas(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("de libras a pesos")) {
                                moneda.LibrasEsterlinas_Pesos(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("de pesos a yen")) {
                                moneda.Pesos_YenJapones(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("de yen a pesos")) {
                                moneda.YenJapones_Pesos(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("de pesos a won")) {
                                moneda.Pesos_WonSurCoreano(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("de won a pesos")) {
                                moneda.WonSurCoreano_Pesos(dineroConvertido);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un valor, para continuar", 
                                    "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Ups opción no valida, intente nuevamente", 
                                "Message", JOptionPane.WARNING_MESSAGE);
                }
               

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, comuniquese con su administrador", 
                        "Message", JOptionPane.ERROR_MESSAGE);
                System.err.println(e.getMessage());
                break;
            }
            
            
            inicio = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Conversor de Moneda",
                    JOptionPane.YES_NO_OPTION);
            if (inicio == 1) {
                JOptionPane.showMessageDialog(null, "Programa Terminado", "Challenge Alura", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
