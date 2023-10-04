package com.github.kyriosdata;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CsvTest {

    @Test
    public void csv() throws IOException {
        InputStream is = this.getClass().getResourceAsStream("/teste.csv");
        Path temp = Files.createTempFile("teste", ".csv");
        Files.write(temp, is.readAllBytes());

        Main.main(new String[] {temp.toString()});

        Path out = Path.of(temp.toString() + "_out.csv");
        String linha = Files.readString(out);
        assertTrue(linha.endsWith(",3\n"));
    }
}
