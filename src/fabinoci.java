public class fabinoci {
   public static void main(String[] args) {


       int fn = 1;
       int sn = 1;
       for (int i = 1; i<=6; i++) {
           System.out.print(fn+ " ");
           int tn = fn + sn;
           fn = sn;
           sn = tn;
       }
   }
}



