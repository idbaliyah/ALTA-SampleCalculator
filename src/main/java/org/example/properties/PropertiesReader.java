package org.example.properties;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class PropertiesReader {

  public PropertiesData readProperties(){
    Yaml yaml = new Yaml();
    InputStream inputStream = this.getClass()
        .getClassLoader()
        .getResourceAsStream("configuration.yaml");
    PropertiesData data = yaml.load(inputStream);
    return data;
  }

}
