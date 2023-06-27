/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 08:44:06 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Factorial_ESTest extends Factorial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Factorial.factorial(32);
      Factorial factorial0 = new Factorial();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        Factorial.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = (-4540);
      Factorial.factorial(int0);
      String[] stringArray0 = new String[1];
      String string0 = "";
      stringArray0[0] = string0;
      Factorial.main(stringArray0);
      int int1 = (-207);
      Factorial.factorial(int1);
      Factorial.factorial(int0);
      Factorial factorial0 = new Factorial();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Factorial.factorial(109);
      Factorial.factorial(0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "<xsQUz9EOs6*(8";
      stringArray0[1] = "Cr:r0";
      stringArray0[2] = "Factorial";
      stringArray0[3] = "VBk";
      // Undeclared exception!
      try { 
        Factorial.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Factorial factorial0 = new Factorial();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "{j";
      stringArray0[2] = "";
      stringArray0[3] = "SxY=6,{7\"?ZE4/e'0";
      stringArray0[4] = "=d+xq6ogit";
      stringArray0[5] = "&T([sy:}b>y5+9\"";
      stringArray0[6] = "<)ykHNQxj2}nLL4JQ ";
      // Undeclared exception!
      try { 
        Factorial.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "{";
      stringArray0[1] = "";
      stringArray0[2] = ">=Mu%Peb]9RK";
      stringArray0[3] = "2ItizCr%7fySl";
      stringArray0[4] = "";
      stringArray0[5] = "BJ+j_UTqWdLk{H3eC";
      stringArray0[6] = "MTdi\"Z";
      stringArray0[7] = "Error: n must be non-negative";
      // Undeclared exception!
      try { 
        Factorial.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 2431;
      Factorial.factorial(int0);
  }
}
