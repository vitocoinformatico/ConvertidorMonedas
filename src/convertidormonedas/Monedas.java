package convertidormonedas;

import javax.swing.JOptionPane;

public class Monedas {
    
    private double resultado = 0;
    
    public void Pesos_Dolar(double pesos) {
        resultado = pesos /  944.50;
        JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", resultado) + " Dolares", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Dolar_Pesos(double dolar) {
        resultado = dolar *  944.50;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Chilenos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void Pesos_Euro(double pesos) {
        resultado = pesos / 948.45;
        JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", resultado) + " Euros", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Euro_Pesos(double euro) {
        resultado = euro *  948.45;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Chilenos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void Pesos_LibrasEsterlinas(double pesos) {
        resultado = pesos / 1117.22;
        JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", resultado) + " Libras Esterlinas", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void LibrasEsterlinas_Pesos(double libras_esterlinas) {
        resultado = libras_esterlinas * 1117.22;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Chilenos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void Pesos_YenJapones(double pesos) {
        resultado = pesos / 6.90;
        JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", resultado) + " Yen Japónes", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void YenJapones_Pesos(double yen_japones) {
        resultado = yen_japones * 6.90;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Chilenos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void Pesos_WonSurCoreano(double pesos) {
        resultado = pesos / 0.70;
        JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", resultado) + " Won SurCoreano", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void WonSurCoreano_Pesos(double won) {
        resultado = won *  0.70;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Chilenos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
