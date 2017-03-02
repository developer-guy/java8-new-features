package org.bthnpydn.java8.improvements;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bapaydin on 28.02.2017.
 */
public class FilesDemo {
    public static void main(String[] args) throws IOException {
        URL resource = FilesDemo.class.getClassLoader().getResource("hello.txt");
        File file = new File(resource.getFile());
        List<String> lines = Files.lines(file.toPath()).
                map(s -> s.trim()).
                filter(s -> !s.equals("")).collect(Collectors.toList());


        lines.stream().forEach(System.out::println);
    }
}
