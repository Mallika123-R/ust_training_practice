import org.junit.*;

public class calculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void setUpbefore()
    {
        System.out.println("This method will be executed before all test methods");
        calculator=new Calculator();
    }
    @AfterClass
    public static void setUpAfter()
    {
        System.out.println("This method will be executed after all test methods");
        calculator=null;
    }
    @Before
    public void setUp()
    {
        System.out.println("This method will be executed before each test methods");
        calculator=new Calculator();
    }
    @After
    public void tearDown()
    {
        System.out.println("This method will be executed After each test methods");
        calculator=null;
    }
    @Test
    public void additionwithValidInput()
    {

        System.out.println("Test1");
       int result=calculator.addition(10,20);
        Assert.assertEquals(30,result);
        Assert.assertEquals(100, calculator.addition(50,50));

    }

    @Test
    public void substractionwithInputInput()
    {
        System.out.println("Test2");
        Assert.assertEquals(30,calculator.substraction(60,30));
    }
    @Test
    public void factorialPositiveNo()
    {
        System.out.println("Test3");
        Assert.assertEquals(120, calculator.factorial(5));
        Assert.assertEquals(720, calculator.factorial(6));
    }
    @Test
    public void factorialNegativeNo()
    {
        System.out.println("Test4");
        Assert.assertEquals(-1, calculator.factorial(-5));
        //Assert.assertEquals(720, calculator.factorial(6));
    }
    @Test
    public void factorialZeroNo()
    {
        System.out.println("Test5");
        Assert.assertEquals(1, calculator.factorial(0));
        Assert.assertEquals(1, calculator.factorial(1));
    }
}
