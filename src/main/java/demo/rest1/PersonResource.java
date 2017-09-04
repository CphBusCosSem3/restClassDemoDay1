
package demo.rest1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import jsonmappers.Person;

@Path("person")
public class PersonResource {

  @Context
  private UriInfo context;

  
  private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
  private static Map<Integer,Person> persons = new HashMap();
  private static int nextId = 0;

  public PersonResource() {
    if(persons.isEmpty()){
      persons.put(nextId, new Person(nextId,"Kurt","Wonnegut","2345"));
      nextId++;
    }
  }

  @GET
  @Path("all")
  @Produces(MediaType.APPLICATION_JSON)
  public String getAll() {
    return gson.toJson(persons.values());
  }
  
  @GET
  @Path("{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public String getJson(@PathParam("id") int id) {
    Person p = persons.get(id);
    return gson.toJson(p);
  }

  
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public String putJson(String personAsJson) {
    Person p = gson.fromJson(personAsJson, Person.class);
    p.setId(nextId);
    
    persons.put(nextId,p);
    nextId++;
    return gson.toJson(p);
  }
}
