package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPut;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;


@SpringBootTest
public class junitTest {
   
   @Test
   //Chequea si se puede ingresar un producto
	  public void crearProducto() throws URISyntaxException, MalformedURLException, IOException {
        
        JSONObject item = new JSONObject().put("nombre", "test")
                                          .put("codigo", "1234")
                                          .put("fecha_v", "2021-03-02")
                                          .put("categoria", "Nacional")
                                          .put("precio", 1.200);
        try{
        URL url = new URL("http://localhost:8081/productos/create/" + item.toString());
        URI uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);
        HttpUriRequest request = new HttpPost(uri);
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        }catch (IOException e) {
            e.printStackTrace();
        }catch (URISyntaxException e) {
            e.printStackTrace();
        }
   
	}

   @Test
    //Realiza un update al producto 2
    public void updateProducto2() throws URISyntaxException, MalformedURLException, IOException {

        JSONObject item = new JSONObject().put("nombre", "update")
                                          .put("codigo", "1234")
                                          .put("fecha_v", "2021-03-02")
                                          .put("categoria", "Nacional")
                                          .put("precio", 1.200);
        try{
        URL url = new URL("http://localhost:8081/productos/2" + item.toString());
        URI uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);
        HttpUriRequest request = new HttpPut(uri);
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        }catch (IOException e) {
            e.printStackTrace();
        }catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
    

	@Test
  //Chequea si se elimina un producto existente
	public void eliminarProducto() throws ClientProtocolException, IOException {
        try{
        HttpUriRequest request = new HttpDelete( "http://localhost:8081/productos/" + 5 );
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        HttpEntity httpEntity = httpResponse.getEntity();
        System.out.println(EntityUtils.toString(httpEntity));
        }catch (IOException e) {
            e.printStackTrace();
        }
	}

}
