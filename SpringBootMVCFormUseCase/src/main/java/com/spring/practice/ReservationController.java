package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reservation")
@Controller
public class ReservationController {

	@ModelAttribute("reservation")
	public Reservation process()
	{
		
		return new Reservation();
	}
	
	@RequestMapping("/bookingform")
	public String bookingForm(@ModelAttribute("reservation") Reservation reservation)
	{
		return "reservation-page";
		
	}
	
	@RequestMapping("/submitForm")  
	public String submitForm(@ModelAttribute("reservation") Reservation res)  
	{  
	    return "confirmation-form";  
	}  
}
