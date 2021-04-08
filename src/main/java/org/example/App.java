package org.example;

import kong.unirest.GetRequest;
import kong.unirest.Unirest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Unirest.config().defaultBaseUrl("https://pokeapi.co/api/v2/type");
        GetRequest getRequest = Unirest.get("/fire");
        System.out.println( getRequest.asString());
    }
}
