package operaciones.damain;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	private String cedula;
	private String nombre;
	private String direccion;
	private String email;
	private Date fechaNacimiento;
		
	public Cliente() {
		super();
	}
		
	public void CalucloAño(Date fechaNacimiento) {
		SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaNacimiento1 = LocalDate.parse(fecha.format(fechaNacimiento1).fmt);
		LocalDate ahora = LocalDate.now();
		
		Period periodo = Period.between(fechaNacimiento1, ahora);
		System.out.println("Su edad es: % años, % meses, y los % dias /n");
		periodo.getYears().periodo.getMonths().periodo.getDays();
	
	}
		
}
