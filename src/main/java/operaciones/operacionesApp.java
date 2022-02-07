package operaciones;

import java.sql.Date;
import java.time.LocalDate;

import operaciones.damain.Cliente;

public class operacionesApp {
	
	public static void main(String[] args) {
        
		/*operacionesApp operacion = new operacionesApp();
			operacion.setValues1(50);
		    operacion.setValues2(83);
		    operacion.Sumar();
		    
		    operacion.setValues1(60);
		    operacion.setValues2(43);
		    operacion.Restar();
		    
		    operacion.setValues1(5);
		    operacion.setValues2(7);
		    operacion.Multiplicar();
		    		    
		   operacion.setValues1(200);
		   operacion.setValues2(8);
		   operacion.Dividir1();*/
		   
		   
		   Cliente cliente = new Cliente();
		   cliente.setCedula("001");
		   cliente.setNombre("Johns Quinche");
		   cliente.setDireccion("Biblian");
		   cliente.setEmail("quinchejohns@gmail.com");
		   cliente.setFechaNacimiento(Date.valueOf("08/01/2002"));
		   
		   Cliente cliente2 = new Cliente();
		   cliente.setCedula("002");
		   cliente.setNombre("Valeria Dominguez");
		   cliente.setDireccion("Azogues");
		   cliente.setEmail("valedominguez@hotmail.com");
		   cliente.setFechaNacimiento(Date.valueOf("16/6/1993"));    
	
		   
		   cliente.setFechaNacimiento(Date.valueOf("1993-06-16"));
		   cliente.CalucloAño(cliente.getFechaNacimiento());
		   System.out.println(cliente);
		   
	}
	
}
