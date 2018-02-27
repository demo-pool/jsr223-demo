package cn.devit.demo.jsr233;

import static org.junit.Assert.assertNotNull;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.junit.Test;

public class LoadTest {

    @Test
    public void mimeType() {
        ScriptEngine engine = new ScriptEngineManager()
                .getEngineByMimeType("application/javascript");
        assertNotNull(engine);
    }

    @Test
    public void extension() throws Exception {
        ScriptEngine engine = new ScriptEngineManager()
                .getEngineByExtension("js");
        assertNotNull(engine);
    }
    
    @Test
    public void name() throws Exception {
        ScriptEngine engine = new ScriptEngineManager()
                .getEngineByName("nashorn");
        assertNotNull(engine);
    }
}
