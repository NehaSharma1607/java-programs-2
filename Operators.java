public class Operators {
    public static void main(String[] args){
        int x=5;
        int y=10;
        int z=y/x;
        float w=(float)x/y;   //type casting int to float, always need to cast the
                                // operation if the values are in int
        float t=(2*6)+(4*4)+5; // will follow the bod mas rule
        float s=(float)x%y;  //reminder
        System.out.println(z);
        System.out.println(w);
        System.out.println(t);
        System.out.println(s);

    }
}
