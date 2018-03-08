package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/state/json")
public class ReturnJson {
	@GET
	@Path("/{param}")
	@Produces("application/json")
	public String getMsg(@PathParam("param") String state) {
		String stateDetails = null;
		if(state.equals("AP"))
		{
			stateDetails="{\"State\":{ \"name\": \"Andhra Pradesh\",\"shortname\": \"AP\",\"headq\":\"Guntur\",\"language\":\"Telugu\"}}";
		}
		else if (state.equals("KL")) {
			stateDetails="{\"State\":{ \"name\": \"KERALA\",\"shortname\": \"KL\",\"headq\":\"TRIVANDRUM\",\"language\":\"MALAYALAM\"}}";
		} else if (state.equals("KA")) {
			stateDetails="{\"State\":{ \"name\": \"KARNATAKA\",\"shortname\": \"KA\",\"headq\":\"BANGALORE\",\"language\":\"KANNADA\"}}";
		} else if (state.equals("TN")) {
			stateDetails="{\"State\":{ \"name\": \"Tamilnadu\",\"shortname\": \"TN\",\"headq\":\"Chennai\",\"language\":\"Tamil\"}}";
			
		} else {
			stateDetails = "Data not found";
		}
		return stateDetails;
	}
}
