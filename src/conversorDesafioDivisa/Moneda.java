package conversorDesafioDivisa;

public class Moneda {
double valor;	
	
	public double Convertir(double valoraConvertir,double tasadeCambio ) {
		
		valor = valoraConvertir * tasadeCambio;	
		
		return valor;
	}
}
