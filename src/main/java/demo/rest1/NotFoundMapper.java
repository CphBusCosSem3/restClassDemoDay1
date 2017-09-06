/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.rest1;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 *
 * @author bladt
 */
@Provider
public class NotFoundMapper implements ExceptionMapper<NotFoundException>{
    @Override
    public Response toResponse(NotFoundException ex) {
        return Response.status(Response.Status.NOT_FOUND).build();
        
    }
}
