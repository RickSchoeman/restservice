package restservice;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;

@Path("myresource")
public class MyResource {

    @POST
    public String getOrderInfo(@FormParam("windsnelheid") double windsnelheid) {
        Windmolen w = new Windmolen();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("kwh", w.getKwh(windsnelheid));
        return job.build().toString();
    }
}