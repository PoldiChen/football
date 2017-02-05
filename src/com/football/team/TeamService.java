package com.football.team;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Path("/team")
public class TeamService {
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public JAXBElement<String> getHelloWorldJSON() {
		System.out.println("test");
		JAXBElement<String> result = new JAXBElement<String>(new QName("", "code"), String.class, getTest());
		return result;
	}
	
	private String getTest() {
		return "test";
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Resp getTeamById(@PathParam("id") int id) {
		Resp resp = new Resp();
		resp.setCode(PublicCode.OK.getCode());
		resp.setData("the team id=" + id);
		resp.setMessage(PublicCode.OK.getDescription());
//		JAXBElement<String> result = new JAXBElement<String>(new QName("", "code"), String.class, "1");
//		return result;
		return resp;
	}
	
	@POST
	@Path("/posttest")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Resp createTeam(Team team) {
		System.out.println("aaa");
		System.out.println(team.getName());
		Resp resp = new Resp();
		resp.setCode(PublicCode.OK.getCode());
		return resp;
	}
	
	
	@GET
	public String getTeamByName(@QueryParam("name") String name) {
		return "team name = " + name;
	}

}
