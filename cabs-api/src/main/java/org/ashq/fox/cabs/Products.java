package org.ashq.fox.cabs;

import java.lang.Object;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.ashq.fox.cabs.beans.Product;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/products")
public interface Products {
  /**
   * The Products endpoint returns information about the *Uber* products
   * offered at a given location. The response includes the display name
   * and other details about each product, and lists the products in the
   * proper display order.
   *
   */
  @GET
  @Produces("application/json")
  List<Product> productTypes(@QueryParam("latitude") Object latitude,
      @QueryParam("longitude") Object longitude);
}
