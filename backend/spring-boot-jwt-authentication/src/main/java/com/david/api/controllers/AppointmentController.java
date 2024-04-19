package com.david.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.api.models.Appointment;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@Tag(name = "AppointmentController", description = "Controlador de citas")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/appointments")
public class AppointmentController {


    @Operation(summary = "Lista de todas las citas")
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Lista de citas encontrada exitosamente", content = @Content(schema = @Schema(implementation = Appointment.class))),
	        @ApiResponse(responseCode = "404", description = "No se encontraron citas") })
	@GetMapping
	public List<Appointment> getAllArticles(){
		return null;
		
	}
}
