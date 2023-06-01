import java.util.ArrayList;

public class Empresa {
	private String rut;
	private String direccion;
	private ArrayList<String> redesSociales;
	private ArrayList<Bus> buses = new ArrayList<Bus>();

	public void cantidadDeBuses(ArrayList<Bus> buses) {
		throw new UnsupportedOperationException();
	}

	public void cantidadDeViajesPorDia(ArrayList<Bus> buses) {
		throw new UnsupportedOperationException();
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<String> getRedesSociales() {
		throw new UnsupportedOperationException();
	}

	public void setRedesSociales(ArrayList<String> redesSociales) {
		throw new UnsupportedOperationException();
	}

	public Empresa(String rut, String direccion) {
		throw new UnsupportedOperationException();
	}

	public void agregarRedSocial(String redSocial) {
		throw new UnsupportedOperationException();
	}
}