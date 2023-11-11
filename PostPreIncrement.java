public class PostPreIncrement {
    public static void main(String[] args){
        int x=12;
        int y=15;
        int z=18;
        x=x+1; //new x =old x +1
        x=x-1; //new x =old x -1
        x=x/3;
        x=x*2;
        x=x%2;

        y+=1; //equivalent to y=y+1
        y-=y;  //equivalent to y=y-1
        y/=3;
        y*=2;
        y%=2;

        z++; // equivalent to z=z+1; only for increment by 1--> post increment;
             // added in the memory after executing the line; 15+1
             // performs the operations when y is again called
        z--;  //equivalent to z=z-1 ;only for decrement by 1--> post decrement
        ++z; // adds 1 to the memory before getting to y,
             // and stores the result in the same line-->pre increment; 1+15
             // performs operation before the calling of y
        System.out.println(" "+x);
        System.out.println(" "+y);
        System.out.println(" "+z);

    }
}
