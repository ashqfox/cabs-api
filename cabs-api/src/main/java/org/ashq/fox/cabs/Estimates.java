package org.ashq.fox.cabs;

import java.lang.Object;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.ashq.fox.cabs.beans.PriceEstimate;
import org.ashq.fox.cabs.beans.Product;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/estimates")
public interface Estimates {
  /**
   * The Price Estimates endpoint returns an estimated price range
   * for each product offered at a given location. The price estimate is
   * provided as a formatted string with the full price range and the localized
   * currency symbol.<br><br>The response also includes low and high estimates,
   * and the [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code for
   * situations requiring currency conversion. When surge is active for a particular
   * product, its surge_multiplier will be greater than 1, but the price estimate
   * already factors in this multiplier.
   *
   */
  @Path("/price")
  @GET
  @Produces("application/json")
  List<PriceEstimate> priceEstimates(@QueryParam("start_latitude") Object start_latitude,
      @QueryParam("start_longitude") Object start_longitude,
      @QueryParam("end_latitude") Object end_latitude,
      @QueryParam("end_longitude") Object end_longitude);

  /**
   * The Time Estimates endpoint returns ETAs for all products offered at a given location, with the responses expressed as integers in seconds. We recommend that this endpoint be called every minute to provide the most accurate, up-to-date ETAs.
   */
  @Path("/time")
  @GET
  @Produces("application/json")
  List<Product> timeEstimates(@QueryParam("start_latitude") Object start_latitude,
      @QueryParam("start_longitude") Object start_longitude,
      @QueryParam("customer_uuid") Object customer_uuid,
      @QueryParam("product_id") Object product_id);
}
