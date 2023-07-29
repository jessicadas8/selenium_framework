package org.seleniumFramework.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.seleniumFramework.pojos.Configs;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public static Configs getTestConfigsFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File("src/test/resources/config.json"), Configs.class);
    }

}
