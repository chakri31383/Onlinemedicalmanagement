package com.spring.bioMedical.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bioMedical.entity.Admin;
import com.spring.bioMedical.entity.Appointment;
import com.spring.bioMedical.repository.AppointmentRepository;


@Service
public class AppointmentServiceImplementation  {

	private AppointmentRepository appointmentRepository;

	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public AppointmentServiceImplementation( AppointmentRepository obj)
	{
		appointmentRepository=obj;
	}
	
	
	public void save(Appointment app)
	{
		if (app.getRegtime() == null) {
		    app.setRegtime(LocalDateTime.now());
		}
		appointmentRepository.save(app);

		//appointmentRepository.save(app);
	}
	
	
	public List<Appointment> findAll() {
		return appointmentRepository.findAll();
	}
	public List<Appointment> findByEmail(String email) {
        return appointmentRepository.findByEmail(email);
    }

	public Optional<Appointment> findById(Integer id) {
	      return appointmentRepository.findById(id);
    }

	    // Delete an appointment by ID
	    public void deleteById(Integer id) {
	        appointmentRepository.deleteById(id);
	    }
	
	
}
