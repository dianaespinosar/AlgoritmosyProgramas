package generales;

public class CuentaBancaria {
	private String numCli;
	private double saldo;
	private int numCta;
	static int serie = 1000;
	
	public CuentaBancaria (String numCli) {
		this.numCli = numCli;
		saldo = 0;
		numCta = serie;
		serie ++;
	}
	
	public CuentaBancaria (String numCli, double saldo) {
		this.numCli = numCli;
		this.saldo = saldo;
		numCta = serie;
		serie ++;
	}
	
	
}
