public class StringRepeater {
    // NON-OPTIMIZED CODE
    // public String repeatString(String s, int n){
    //     String result = "";
    //     for(int i=0; i<n; i++) {
    //         result = result + s;
    //     }
    //     return result;
    //   }

    // OPTIMIZING CODE with StringBuffer
    public String repeatString(String s, int n){
      StringBuffer sbar = new StringBuffer(s);
      StringBuffer result = new StringBuffer("");
      for(int i=0; i<n; i++) {
          result.append(sbar);
      }
      return result.toString();
    }
}
