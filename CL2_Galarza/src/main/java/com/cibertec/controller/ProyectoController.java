package com.cibertec.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cibertec.model.Reservacion;
import com.cibertec.repository.IReservacionRepository;

@Controller
public class ProyectoController {

	@Autowired
	private IReservacionRepository repo;
	
	@GetMapping("/home")
	public String  greeting(@RequestParam(name= "name", required=false, defaultValue= "world")String name,
			Model model) {
		model.addAttribute("name",name);
		return "home";
	}
	@GetMapping("/reservacion")
	public String registroReservacion(@RequestParam(name="name", required=false , defaultValue="world") String name,
			Model model) {
		Reservacion p = new Reservacion();
		p.setCodigoReserva(100);
		p.setCodigoHotel("H001");
		p.setCodigoHuesped(110);
		p.setCodigoHabitacion(101);
	    p.setFechaInicio(null);
	    p.setFechaFin(null);
	    System.out.println(p);
	    
		
		p=repo.save(p);
		
		model.addAttribute("name", p);
		return "reservacion";
	}
	 @PostMapping("/reservacion")
	    public String registroReservation(Reservacion reservation, Model model) {
	        repo.save(reservation);
	        model.addAttribute("message", "¡Reservación registrada exitosamente!");
	        return "reservacion";
	    }
	
	@GetMapping("/listado")
	public String listadoReservacion(Model model) {
		model.addAttribute("lstReservacion", repo.findAll());
		return "listado";
	}
	


}//fin del controlador
