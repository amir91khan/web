package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientAppTest {

	public static void main(String[] args) {
		Client c=Client.create();
		String URL="http://localhost:7474/web-services1/rest/path";
		WebResource wr=c.resource(URL);
		ClientResponse cr=wr.get(ClientResponse.class);
		String s=cr.getEntity(String.class);
		System.out.println(s);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());

	}

}
