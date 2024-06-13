package examen;

public class Medico {
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getTarifaxconsulta() {
		return tarifaxconsulta;
	}

	public void setTarifaxconsulta(double tarifaxconsulta) {
		this.tarifaxconsulta = tarifaxconsulta;
	}

	public int getNumeroConsultas() {
		return numeroConsultas;
	}

	public void setNumeroConsultas(int numeroConsultas) {
		this.numeroConsultas = numeroConsultas;
	}

	public static int getCantidadObj() {
		return cantidadObj;
	}

	public static void setCantidadObj(int cantidadObj) {
		Medico.cantidadObj = cantidadObj;
	}

	public static double getIngresoNeto() {
		return ingresoNeto;
	}

	public static void setIngresoNeto(double ingresoNeto) {
		Medico.ingresoNeto = ingresoNeto;
	}

	private int codigo;
	private double tarifaxconsulta;
	private int numeroConsultas;
	
	private static int cantidadObj = 0;
	private static double ingresoNeto = 0;
	
	public final static double DESC = 0.12; 
	
	public Medico (int codigo, double tarifaxconsulta, int numeroConsultas) {
		this.codigo=codigo;
		this.tarifaxconsulta=tarifaxconsulta;
		this.numeroConsultas=numeroConsultas;
		cantidadObj ++;
		ingresoNeto = ingresoNeto + ingresobruto();
	}
	public double ingresobruto() {
		return tarifaxconsulta * numeroConsultas;
	}
	public double descuento() {
		return DESC * ingresobruto ();
	}
	public double ingresoNeto () {
		return ingresobruto()- descuento();
	}
}
