package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import cn.itcast.mybatis.domain.Step;

public class CountryInformation extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public CountryInformation() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String countryCode = request.getParameter("countryCode");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		response.setHeader("Cache-control", "no-cache, no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "-1");

		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		response.setHeader("Access-Control-Max-Age", "86400");

		Gson gson = new Gson();
		JsonObject myObj = new JsonObject();

		Step countryInfo = getInfo(countryCode);
		JsonElement countryObj = gson.toJsonTree(countryInfo);
		// if(countryInfo.getName() == null){
		// myObj.addProperty("success", false);
		// }
		// else {
		myObj.addProperty("success", true);
		// }
		myObj.add("step", countryObj);
		out.println(myObj.toString());
		System.out.println(myObj.toString());
		System.out.println(countryCode);
		out.close();
	}

	// Get Country Information
	private Step getInfo(String countryCode) {
		Step country = new Step();

		country.setCla("a");
		country.setId("1");;
		country.setNum("aa");;
		country.setRoom(null);
		return country;

	}

}