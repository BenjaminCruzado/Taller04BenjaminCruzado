import java.util.ArrayList;

public class Empresa {
	private String rut;
	private String direccion;
	private ArrayList<String> redesSociales;
	private ArrayList<Bus> buses;
	public Empresa(String rut, String direccion) {
		this.rut = rut;
		this.direccion = direccion;
		this.redesSociales = new ArrayList<>();
		this.buses = new ArrayList<>();
	}
	public void agregarBus(Bus bus){this.buses.add(bus);}
	public void eliminarBusPorPatente(String patente){
		for (Bus bus : buses) {
			if (bus.getPatente() == patente) {
				this.buses.remove(bus);
			}
		}
	}

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

	public void agregarRedSocial(String redSocial) {
		throw new UnsupportedOperationException();
	}
}