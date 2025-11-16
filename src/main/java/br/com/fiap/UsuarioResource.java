package br.com.fiap;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.ext.Provider;

import java.sql.SQLException;
import java.util.ArrayList;

@Provider

@Path("/usuario")
public class UsuarioResource {

    private UsuarioBO usuarioBO = new UsuarioBO();

    // Selecionar
    @GET
    @Produces(MediaType.APPLICATION_JSON) // único produces
    public ArrayList<Usuario> selecionarUsuarioRs() throws ClassNotFoundException, SQLException, SQLException {
        return  (ArrayList<Usuario>) usuarioBO.selecionarUsuarioBo();
    }

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inserirUsuarioRs(Usuario usuario, @Context UriInfo uriInfo) throws SQLException, ClassNotFoundException {
        usuarioBO.inserirUsuarioBo(usuario);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
        builder.path(Integer.toString(usuario.getIdUsuario()));
        return Response.created(builder.build()).build();
    }

    // Atualizar
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response atualizarUsuarioRS(Usuario usuario, @PathParam("idUsuario") int idUsuario) throws SQLException, ClassNotFoundException {
        usuarioBO.atualizarUsuariorBo(usuario);
        return Response.ok().build();
    }

    // Deletar
    @DELETE
    @Path("{idUsuario}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarUsuarioRs(@PathParam("idUsuario") int idUsuario) throws SQLException, ClassNotFoundException {
        usuarioBO.deletarUsuarioBo(idUsuario);
        return Response.ok().build();
    }

    // Select Usuario ID
    @GET
    @Path("/{idUsuario}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario selecionarUsuarioPorIdRs(@PathParam("idUsuario") int idUsuario) throws SQLException, ClassNotFoundException {
        return usuarioBO.selecionarUsuarioPorIdBo(idUsuario);
    }
}
