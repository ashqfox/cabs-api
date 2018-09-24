package org.ashq.fox.cabs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.ashq.fox.cabs.beans.Profile;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/me")
public interface Me {
  /**
   * The User Profile endpoint returns information about the Uber user that has authorized with the application.
   */
  @GET
  @Produces("application/json")
  Profile userProfile();
}
