package com.github.kyriosdata.oo;

import com.github.kyriosdata.Banana;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Properties;

public class AplicacaoIndependenteDeComparador {

    public static void main(String[] args) throws IOException {
        Properties prop = getProperties();
        String comparadorClassName = prop.getProperty("comparador");
        Comparator<Banana> comparador = getObject(comparadorClassName);

        Banana[] bananas = Main.getBananas();
        Arrays.sort(bananas, comparador);
        Arrays.stream(bananas).forEach(b -> System.out.println(b.getTipo()));
    }

    private static Comparator<Banana> getObject(String classname) {
        try {
            Class<?> classe = Class.forName(classname);
            return (Comparator<Banana>)
                    classe.getDeclaredConstructors()[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        ClassLoader cl = AplicacaoIndependenteDeComparador.class.getClassLoader();
        try (InputStream is = cl.getResourceAsStream("config.properties")) {
            prop.load(is);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
}
