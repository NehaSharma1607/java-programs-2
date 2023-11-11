public class AssigningVariables {
    public static void main(String[] args){
        //Declaring variables
        int x,z,w; //int x;int y;int w;

        double y;
        // Assigning values
        //cannot assign double to int but vice versa is true
        y=2+3; // 5.0 ;java promotes the integer into double
        x=(int)(3.5*6.3);  //type casting
        int t=5+6*9+6; //operators start from left to right
        // Assignement variables is done from right to left
        x=z=w=2*5+6;  // assignment will be done first to w then z then x
        // x=(z=(w=2*5+6))

        System.out.println(x);
        System.out.println(z);
        System.out.println(w);


    }
}
