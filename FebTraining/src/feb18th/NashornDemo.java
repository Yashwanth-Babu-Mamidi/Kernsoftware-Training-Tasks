package feb18th;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornDemo {

    public static void main(String[] args) throws Exception {

        // Create Script Engine Manager
        ScriptEngineManager manager = new ScriptEngineManager();

        // Get Nashorn JavaScript Engine
        ScriptEngine engine = manager.getEngineByName("nashorn");

        // Execute JavaScript code
        engine.eval("print('Hello from JavaScript using Nashorn');");

        // JavaScript calculation
        engine.eval("var a = 10; var b = 20; print('Sum = ' + (a + b));");
    }
}
