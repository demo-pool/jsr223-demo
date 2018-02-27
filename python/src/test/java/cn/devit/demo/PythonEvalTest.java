package cn.devit.demo;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.junit.Before;
import org.junit.Test;

public class PythonEvalTest {

    private ScriptEngine engine;
    private ScriptEngineManager scriptEngineManager;

    @Before
    public void setup() {
        System.setProperty("python.home", new File(".").getAbsolutePath());
        scriptEngineManager = new ScriptEngineManager();
        engine = scriptEngineManager.getEngineByName("python");
    }
    
    @Test
    public void simple() throws Exception {
        engine.eval("a = 1");
        assertEquals(1, engine.get("a"));
    }

    @Test
    public void add_library_dir() throws Exception {
        /*
         * default lib path will be:
         * ['~/.m2/repository/org/python/jython-standalone/2.7.0/Lib',
         *  '~/.m2/repository/org/python/jython-standalone/2.7.0/jython-standalone-2.7.0.jar/Lib',
         *   '__classpath__',
         *   '__pyclasspath__/']
         * 
         * you can add site dir to load egg
         */
//        String dir = new File("src/main/resources").getAbsolutePath();
//        engine.eval("import site;");
//        engine.eval("site.addsitedir('" + dir + "')");
//        engine.eval("print site.getsitepackages()");
//        engine.eval("import sys");
//        engine.eval("print sys.path");
        engine.eval(new FileReader(new File("load.py")));
        System.out.println(engine.get("html"));
    }
}
