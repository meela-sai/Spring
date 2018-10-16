package us.mi.state.dhs.bridges.ws.rest.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Test {
 public static void main(String[] args) throws ClientProtocolException, IOException {
  HttpClient client = new DefaultHttpClient();
  HttpGet request = new HttpGet("http://localhost:9083/SpringREST/example/greeting?name=Ravi");
  request.addHeader("Accept", "application/vnd.api.v1+json");
  request.addHeader("Content-type", "application/vnd.api.v1+json");
  HttpResponse response = client.execute(request);
  BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
  String line = "";
  while ((line = rd.readLine()) != null) {
    System.out.println(line);
  }
 }
}