public class Main 
{
  public static void main(String[] args) 
  {
    int amount = 10;
    long totalTime = 0;
    for(int i = 0 ; i < amount ; i++)
    {
      TestRunner testRunner = new TestRunner(10);
      
      long startTime = System.currentTimeMillis();

      testRunner.runTests(Tests.class);

      long endTime = System.currentTimeMillis();
      totalTime += (endTime - startTime);
    }
    totalTime /= amount;
    System.out.println("Average Time Taken: " + totalTime + " ms");
  }
}
