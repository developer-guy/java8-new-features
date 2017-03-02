package org.bthnpydn.java8.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

/**
 * Created by bapaydin on 28.02.2017.
 */
public class NashornDemo {
    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {

        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");

        URL resource = NashornDemo.class.getClassLoader().getResource("script.js");

        File file = new File(resource.getFile());

        scriptEngine.eval(new FileReader(file));

        Invocable invocable = (Invocable) scriptEngine;

        Object result = invocable.invokeFunction("hellofunc", "Batuhan Apaydın");

        System.out.println(result);
    }
}
