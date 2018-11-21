// MEASURING PERFORMANCE

// A) NAIVELY MEASURED TIME
public class Question2 {
    public static void main(String[] args) {
        StringRepeater repeater = new StringRepeater();
        // System.out.println("Naively measured time:");
        // algorithm like in lecture
        long start;
        long end;
        int arr[] = {1,100,1000,10000};
        int n = arr.length;

        for(int i = 0; i < n; i++){
          start = System.nanoTime();
          repeater.repeatString("hello",arr[i]);
          end = System.nanoTime();
          // from nanoseconds to seconds
          System.out.println("T("+ arr[i] + ") = " + (end-start)/1000000000.0 + " seconds");
        }


// B) FAIRLY PRECISE RUNTIME
        // more than 100 repeats did not work for UNOPTIMISED CODE
        // algorithm like in lecture
        long repeats = 100;
        double total;

        for(int i = 0; i < n; i++){
          start = System.nanoTime();
          for(int j = 0; j < repeats; j++){
              repeater.repeatString("hello", arr[i]);
          }
          end = System.nanoTime();
          total = end - start;
          // from nanoseconds to seconds
          System.out.println("T(" + arr[i] + ") = " + total/1000000000.0/repeats + " seconds");
        }
 }
}
