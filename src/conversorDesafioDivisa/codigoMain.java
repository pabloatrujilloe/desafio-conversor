package conversorDesafioDivisa;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class codigoMain {
	
		public static void main(String[] args) {
        String opciones[] = {"Conversor de Moneda","Conversor de Temperatura", "Salir"};
        boolean continuar = true;

        while (continuar) {
            String op = (String) JOptionPane.showInputDialog(
                null, "Bienbenido. Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]
            );

            if (op.equals("Conversor de Moneda")) {
                Moneda();
            } else if (op.equals("Conversor de Temperatura")) {
                Temperatura();
            
            }else if (op == null || op.equals("Salir")) {
            continuar = true; 
            }     
            
            int opcionContinuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "continuar", JOptionPane.YES_NO_OPTION);
            if (opcionContinuar == JOptionPane.NO_OPTION) {
                continuar = false;
            }
	    }
		
	    JOptionPane.showMessageDialog(null, "Programa terminado!");
    }

    public static void Moneda() {
    	 String monto = JOptionPane.showInputDialog(null, "Ingrese un monto a convertir");
    	 double montoIngresado = 0.0;
    	 String resultadoFormateado;
    	 Moneda moneda = new Moneda();
    	 
         if (monto == null || monto.isEmpty()) {
             JOptionPane.showMessageDialog(null, "No se ingresó un valor valido.", "Error", JOptionPane.ERROR_MESSAGE);
             System.exit(0);
         }
         
         try {
             montoIngresado  = Double.parseDouble(monto);

         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Debe ingresar solo número.", "Error", JOptionPane.ERROR_MESSAGE);
             System.exit(0);
         }         
         
         String opciones[] = {"De Dolar a Peso", "De Euros a Peso", "De Libra a Peso","De yen a Peso","De Won a Peso","De Peso a Dolar"
        		 ,"De Peso a Euro","De Peso a Libra","De Peso a Yen","De Peso a Won"};
         String op = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
         DecimalFormat decimalFormat = new DecimalFormat("#.#######");
         
         if (op != null) {
	            if (op.equals("De Dolar a Peso")) {
		         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado,828.77 ));
		         JOptionPane.showMessageDialog(null, montoIngresado+ " Dolar  corresponde a " + resultadoFormateado + " peso.");
	            } else if (op.equals("De Euros a Peso")) {
		         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 915.99));
		         JOptionPane.showMessageDialog(null, montoIngresado+ " Euros  corresponde a " + resultadoFormateado + " peso.");
	            } else if (op.equals("De Libra a Peso")) {
		         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 1068.3));
		         JOptionPane.showMessageDialog(null, montoIngresado+ " Libra  corresponde a " + resultadoFormateado + " peso.");
	            }else if (op.equals("De yen a Peso")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 5.89));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " Yen  corresponde a " + resultadoFormateado + " peso.");
	            }else if (op.equals("De Won a Peso")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 0.65));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " Won  corresponde a " + resultadoFormateado + " peso.");
	            }else if (op.equals("De Peso a Dolar")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 0.0012));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " Peso corresponde a " + resultadoFormateado + " dolar.");
	            }else if (op.equals("De Peso a Euro")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 0.0011));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " Peso corresponde a " + resultadoFormateado + " Euro."); 
	            }else if (op.equals("De Peso a Libra")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 0.00093));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " Peso corresponde a " + resultadoFormateado + " Libra."); 
	            }else if (op.equals("De Peso a Yen")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 0.17));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " Peso corresponde a " + resultadoFormateado + " Yen."); 
	            }else if (op.equals("De Peso a Won")) {
			         resultadoFormateado = decimalFormat.format(moneda.Convertir(montoIngresado, 1.54));
			         JOptionPane.showMessageDialog(null, montoIngresado+ " Peso corresponde a " + resultadoFormateado + " Won."); 
	            }
	            
	        }
    }

    public static void Temperatura() {
    	String temperaturaenGrados = JOptionPane.showInputDialog(null, "Ingrese un valor que desea convertir: ");
    	double temperaturaIngresada = 0.0;
    	String resultadoFormateado;
    	Temperatura temperatura = new Temperatura();
    	
        if (temperaturaenGrados == null || temperaturaenGrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
         try {
             temperaturaIngresada  = Double.parseDouble(temperaturaenGrados);

         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
             System.exit(0);
         }
         
         String opciones[] = {"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"};
         String op = (String) JOptionPane.showInputDialog(null, "Elija una Opción", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
         DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
         if (op != null) {
	            if (op.equals("De Celsius a Fahrenheit")) {
	            	resultadoFormateado = decimalFormat.format(temperatura.ConvertirCelsiusaFahrenheit(temperaturaIngresada));
	    	        JOptionPane.showMessageDialog(null, temperaturaIngresada + " grados Celsius equivalen a " + resultadoFormateado + " grados Fahrenheit.");
	            } else if (op.equals("De Fahrenheit a Celsius")) {
	            	resultadoFormateado = decimalFormat.format(temperatura.ConvertirFahrenheitaCelsius(temperaturaIngresada));
	    	        JOptionPane.showMessageDialog(null, temperaturaIngresada + " grados Fahrenheit equivalen a " + resultadoFormateado + " grados Celsius.");
	            }
	        }
    }

}
