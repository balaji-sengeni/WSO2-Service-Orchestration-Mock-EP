package com.examples.rest;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/hello")
public class OrchestrationEndPoint {
    
    private static AtomicInteger atomicCount = new AtomicInteger();
    
    @GET
    @Path("/name/{nino}")
    @Produces({"application/json"})
    public Response getName(@PathParam("nino") String nino)
    {
      System.out.println("nino :" + nino);
      Name name = new Name();
      return Response.ok().entity(name).build();
    }
    
    @GET
    @Path("/name/{nino}/{name}")
    @Produces({"application/json"})
    public Response getCarNumber(@PathParam("nino") String nino, @PathParam("name") String name)
    {
      System.out.println("nino :" + nino);
      System.out.println("name :" + name);
      CarList carList = new CarList();
      return Response.ok().entity(carList).build();
    }
    
    @GET
    @Path("/name/{nino}/{name}/{car_number}")
    @Produces({"application/json"})
    public Response getCarDetails(@PathParam("nino") String nino, @PathParam("name") String name, @PathParam("car_number") String car_number)
    {
      System.out.println("nino :" + nino);
      System.out.println("name :" + name);
      System.out.println("car_number :" + car_number);
      CarDetails carDetails = new CarDetails();
      return Response.ok().entity(carDetails).build();
    }
    
    @POST
    @Produces({"application/json"})
    @Consumes({"application/json"})
    @Path("/jsonBean")
    public Response modifyJson(JsonBean input)
    {
      input.setVal2(input.getVal1());
      return Response.ok().entity(input).build();
    }
    
    @GET
    @Path("/greeting/{name}")
    @Produces({"application/json"})
    public Response greeting(@PathParam("name") String name)
    {
      System.out.println("name" + name);
      Greeting greeting = new Greeting(Integer.valueOf(atomicCount.getAndIncrement()), name);
      return Response.ok().entity(greeting).header("Content-Length", Integer.valueOf(greeting.toString().length())).build();
    }

    @GET
    @Path("/echo/{input}")
    @Produces("text/plain")
    public String ping(@PathParam("input") String input) {
        return input;
    }

}

