package com.example.java;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHTTPClient {

	public OkHTTPClient() throws IOException {
		// TODO Auto-generated constructor stub
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("http://vm-elender:9991/Test/GetScoringContext?loanid=15")
		  .get()
		  .addHeader("tklender_apikey", "AE3FCDB7-833C-4691-B65C-BA4A19C25744")
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "d04cdbc9-534e-ef42-4d69-3fe8d618e5d5")
		  .build();

		Response response = client.newCall(request).execute();
		System.out.println(response);
	}

}
