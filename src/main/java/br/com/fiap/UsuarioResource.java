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
    @Path("/id/{idUsuario}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deletarUsuarioRs(@PathParam("idUsuario") int idUsuario) throws SQLException, ClassNotFoundException {
        usuarioBO.deletarUsuarioBo(idUsuario);
        return Response.ok().build();
    }

    // Select Usuario ID
    @GET
    @Path("/id/{idUsuario}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario selecionarUsuarioPorIdRs(@PathParam("idUsuario") int idUsuario) throws SQLException, ClassNotFoundException {
        return usuarioBO.selecionarUsuarioPorIdBo(idUsuario);
    }

    // Login
    @GET
    @Path("/login/{email}/{senha}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginUsuario(@PathParam("email") String email, @PathParam("senha") String senha) throws SQLException, ClassNotFoundException {
        boolean ok = usuarioBO.verificarLogin(email, senha);

        if (ok) {
            return Response.ok("Login realizado com sucesso").build();
        } else {
            return Response.status(Response.Status.UNAUTHORIZED).entity("Email ou senha incorretos").build();
        }
    }


}
