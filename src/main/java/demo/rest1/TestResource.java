
package demo.rest1;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;


@Path("test")
public class TestResource {

  @Context
  private UriInfo context;

  private static String name = "Peter";
  
  public TestResource() {
  }

 
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getJson() {
   return name;
  }

  
  @POST
  @Consumes(MediaType.TEXT_PLAIN)
  @Produces(MediaType.TEXT_PLAIN)
  public String putJson(String newName) {
    name = newName;
    return name;
  }
}
