package nineoct.PERIODIC_TABLE;

public class PERIODIC_TABLE {
    private static String [][]ELEMENTS = DATA_3.ELEMENTS;

    public static String Electronic_Configuration(int Z){
        System.out.println(ELEMENTS[Z][8]);
        String ec = ELEMENTS[Z][8];
        return ec;

    }
    public static String[] All(int z){
        String[] a = ELEMENTS[z];
        String [] h = ELEMENTS[0];
        for(int i = 0;i<h.length;i++){
            System.out.println(h[i] + " : "+a);
        }
        return a;
    }
    public static void main(String[] args) {
        DATA_3.Electronic_Configuration(20);
        DATA_3.All(20);
        Integer i = 12;
        int x = i+22;
        System.out.println(x);
    }

}
