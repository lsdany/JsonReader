package com.umg;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class JsonReader {

    private final String path = "src/main/resources/ejemplo.json";

    public JsonReader(){

    }

    public void leerArchivo(){
        String contenidoArchivo = "";
        try {
            contenidoArchivo = Files.readString(Paths.get(path));
        } catch (IOException e) {
            System.out.println("Ocurrio un error al leer el archivo");
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            Usuario[] userJsons = mapper.readValue(contenidoArchivo, Usuario[].class);
            System.out.println(Arrays.toString(userJsons));
        } catch (JsonProcessingException e) {
            System.out.println("Ocurrio un error al parcear el archivo JSON");
        }

    }

    public static void main(String[] args) {
        JsonReader jsonReader = new JsonReader();
        jsonReader.leerArchivo();
    }

}
