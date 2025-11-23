package br.com.fiap;

import br.com.fiap.beans.Interesse;
import br.com.fiap.bo.InteresseBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/interesse")
public class InteresseResource {

    private InteresseBO interesseBO = new InteresseBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON) // único produces
    public ArrayList<Interesse> selecionarInteresseRs() throws ClassNotFoundException, SQLException, SQLException {
        return  (ArrayList<Interesse>) interesseBO.selecionarInteresseBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirInteresseRs(Interesse interesse, @Context UriInfo uriInfo) throws SQLException, ClassNotFoundException {
        interesseBO.inserirInteresseBo(interesse);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(interesse.getIdInteresse()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarInteresseRS(Interesse interesse, @PathParam("idInteresse") int idInteresse) throws SQLException, ClassNotFoundException {
        interesseBO.atualizarInteresseBo(interesse);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("/id/{idInteresse}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarInteresseRs(@PathParam("idInteresse") int idInteresse) throws SQLException, ClassNotFoundException {
        interesseBO.deletarInteresseBo(idInteresse);
        return Response.ok().build();
    }



}
