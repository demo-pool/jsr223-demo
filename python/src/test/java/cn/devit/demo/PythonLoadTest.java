package cn.devit.demo;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.junit.Before;
import org.junit.Test;

public class PythonLoadTest {

    private ScriptEngine engine;
    private ScriptEngineManager scriptEngineManager;

    @Before
    public void setup() {
        System.setProperty("python.home", new File(".").getAbsolutePath());
        scriptEngineManager = new ScriptEngineManager();
    }
    
    @Test
    public void name() throws Exception {
        engine = scriptEngineManager.getEngineByName("python");
        assertNotNull(engine);
    }
    @Test
    public void mimeType() throws Exception {
        engine = scriptEngineManager.getEngineByMimeType("application/python");
        assertNotNull(engine);
    }
    @Test
    public void extension() throws Exception {
        engine = scriptEngineManager.getEngineByExtension("py");
        assertNotNull(engine);
    }

//    @Test
//    public void jsr233() throws Exception {
//        //        engine.eval("import sys");
//        //        engine.eval("print sys");
//        //        engine.put("a", 42);
//        SimpleBindings c1 = new SimpleBindings();
//        SimpleBindings c2 = new SimpleBindings();
//        engine.put("a", "0");
//        engine.eval("a = 2", c1);
//        engine.eval("a = 3", c2);
//
//        System.out.println(c1.get("a"));
//        System.out.println(c2.get("a"));
//        System.out.println(engine.get("a"));
//        engine.eval("from com.ziclix.python.sql import zxJDBC");
//        engine.eval("print zxJDBC");
//    }
//
//    @Test
//    public void test_py() throws Exception {
//        /*
//         * ['/Users/lxb/.m2/repository/org/python/jython-standalone/2.7.0/Lib',
//         *  '/Users/lxb/.m2/repository/org/python/jython-standalone/2.7.0/jython-standalone-2.7.0.jar/Lib',
//         *   '__classpath__',
//         *   '__pyclasspath__/']
//         */
//        String dir = new File("src/main/resources").getAbsolutePath();
//        //        engine.eval(new FileReader(new File("src/main/resources/easy-install.pth")));
//        engine.eval("import site;");
//        engine.eval("site.addsitedir('" + dir + "')");
//        engine.eval("print site.getsitepackages()");
//        engine.eval("import sys");
//        engine.eval("print sys.path");
//        engine.eval(new FileReader(new File("load.py")));
//        System.out.println(engine.get("html"));
//    }
}
