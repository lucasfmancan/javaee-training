package ws;



import model.PessoaTeste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ws")
public class TesteWebService {

    @GET
    public Response getMessage(){
//
//        Pessoa pessoa = new Pessoa();
//        pessoa.setIdade(19);
//        pessoa.setNome("Teteu");
//        pessoa.setSexo(Pessoa.Sexo.F);

        return Response.status(Response.Status.OK).entity("Hello World!").build();
    }


    @POST
    @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PessoaTeste pessoa){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PLLDS");

        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        pessoa = em.merge(pessoa);

        em.getTransaction().commit();

        return Response.status(Response.Status.CREATED).entity(pessoa).build();

    }
}
