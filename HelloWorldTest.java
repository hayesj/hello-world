import junit.framework.TestCase;

public class HelloWorldTest
    extends junit.framework.TestCase {
       Hello HelloWorld;

    public HelloWorldTest() {}   //default constructor

    protected void setUp() {  // creates a (simple) test fixture

        Hello = new HelloWorld();
    }

    protected void tearDown() {}  //no resources to release

    public void testSayHello() {
          assert(Hello!=null);
          assertEquals("Hello World",Hello.sayHello());  }

      }


