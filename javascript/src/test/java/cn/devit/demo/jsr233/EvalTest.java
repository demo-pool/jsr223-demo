package cn.devit.demo.jsr233;

import static org.junit.Assert.*;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.junit.Before;
import org.junit.Test;

public class EvalTest {

    private ScriptEngine engine;

    @Before
    public void setup() {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        engine = scriptEngineManager
                .getEngineByMimeType("application/javascript");
    }

    @Test
    public void eval() throws Exception {
        Bindings bindings = engine.createBindings();
        bindings.put("a", 1);
        engine.eval("a++;",bindings);
        
        assertEquals(2.0, bindings.get("a"));
    }
    
    @Test
    public void returnValue() throws Exception {
        engine.put("a", 1);
        Object result = engine.eval("a++;"
                + "a;");
        assertEquals(2.0, result);
    }

}
