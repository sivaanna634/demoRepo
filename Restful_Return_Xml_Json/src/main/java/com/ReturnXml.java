/**
 * 
 */
package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 *
 */
@Path("/state/xml")
public class ReturnXml {
	@GET
	@Path("/{param}")
	@Produces({"application/xml"})
	public String getMsg(@PathParam("param") String state) {
		String stateDetails = null;
		if(state.equals("AP"))
		{
			stateDetails = "<State><name>Andhra Pradesh</name><shortname>AP</shortname>" +
			"<headq>Guntur</headq><language>Telugu</language></State>";
		}
		else if (state.equals("KL")) {
			stateDetails = "<State><name>KERALA</name><shortname>KL</shortname>" +
					"<headq>TRIVANDRUM</headq><language>MALAYALAM</language></State>";
		} else if (state.equals("KA")) {
			stateDetails = "<State><name>KARNATAKA</name><shortname>KA</shortname>" +
					"<headq>BANGALORE</headq><language>KANNADA</language></State>";
		} else if (state.equals("TN")) {
			stateDetails = "<State><name>TAMILNADU</name><shortname>TN</shortname>" +
					"<headq>CHENNAI</headq><language>TAMIL</language></State>";
		} else {
			stateDetails = "Data not found";
		}
		return stateDetails;
	}
}
