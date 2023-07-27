package conversorDesafioDivisa;

public class Temperatura {
    double valor;
	
	public double ConvertirCelsiusaFahrenheit(double valoraConvertir) {		
		valor = (valoraConvertir * 9 / 5) + 32;	
		return valor;
	}
	
	public double ConvertirFahrenheitaCelsius(double valoraConvertir) {		
		valor = (valoraConvertir - 32 ) * 5 / 9;	
		return valor;
	}
}
