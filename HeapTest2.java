
public class HeapTest2
{
    public static void main (String[] args)
   {
      char[] c = {'d','a','f','e','b','c'};
      char[] b = {'a','b','c','d','e','f'};
      System.out.print("Initial array ");
      System.out.println(c);
      HeapSort.heapsort(c);
      System.out.print("This is the array that was ordered ");
      System.out.println(c);
      System.out.print("Checking against ");
      System.out.println(b);
   }
}
