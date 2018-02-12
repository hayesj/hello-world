import junit.framework.TestCase;

public class HelloWorldTest
    extends TestCase {
        Hello HelloWorld;

    public HelloWorldTest() {}   //default constructor

    protected void setUp() {  // creates a (simple) test fixture

        hello = new HelloWorld();
    }

    protected void tearDown() {}  //no resources to release

@Test
    public void testSayHello() {
          assert(Hello!=null);
          assertEquals("Hello World",Hello.sayHello());  }

      }


