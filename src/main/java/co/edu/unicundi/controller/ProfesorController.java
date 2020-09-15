/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.controller;

import co.edu.unicundi.controller.pojo.Profesor;
import co.edu.unicundi.logica.ProfesorService;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Juan Jose Rangel
 */
@Stateless
@Path("/Profesores")
public class ProfesorController {

    @Path("/retornarProfesores")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response retornarProfesor() {
        return Response.status(Response.Status.OK).entity(GestorDB.cargarProfesores()).build();
    }

    @Path("/retornarProfesorCedula/{cedula}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response retornarProfesorPorCedula(@PathParam("cedula") int cedula) {
        try {
            ProfesorService service = new ProfesorService();
            ArrayList resultado = service.retornarProfesorPorCedula(cedula);
            return Response.status(Response.Status.OK).entity(resultado).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Cédula invalida").build();
        }
    }
    
    @Path("/retornarProfesorMateria/{materia}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response retornarProfesorPorMateria(@PathParam("materia") int materia) {
        try {
            ProfesorService service = new ProfesorService();
            ArrayList resultado = service.retornarProfesorPorMateria(materia);
            return Response.status(Response.Status.OK).entity(resultado).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Codigo materia invalido").build();
        }
    }

    @Path("/insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertarProfesor(@Valid Profesor profesor) {
        ProfesorService service = new ProfesorService();
        service.insertarProfesor(profesor);
        return Response.status(Response.Status.OK).build();
    }

    @Path("/editar")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editar(Profesor profesor) {
        ProfesorService service = new ProfesorService();
        service.editarProfesor(profesor);
        return Response.status(Response.Status.OK).build();
    }

    @Path("eliminar/{cedula}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminar(@PathParam("cedula") int profesor) {
        ProfesorService service = new ProfesorService();
        service.eliminarProfesor(profesor);
        return Response.status(Response.Status.OK).build();
    }

}
