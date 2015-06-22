import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class Aufgabe2Test {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Rule
    public Timeout globalTimeout = new Timeout(100);

    @Test
    public void test() {
    }
}
