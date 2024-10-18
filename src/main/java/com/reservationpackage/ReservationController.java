package com.reservationpackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reservation")
@Controller
public class ReservationController {

    @RequestMapping("/newReservation")
    public String showReservation() {
        return "newReservation";
    }
    @RequestMapping("/reservation-page")
    public String bookingForm(Model model) {
        Reservation res = new Reservation();
        model.addAttribute("reservation", res);
        return "reservation-page";
    }

    @RequestMapping("/confirmation-page")
    public String submitForm(@ModelAttribute("reservation") Reservation res, Model model) {
        System.out.println(res.getFirstName());
        System.out.println(res.getLastName());
        model.addAttribute("reservation", res);
        return "confirmation-page";
    }

}
