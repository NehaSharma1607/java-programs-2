public class Student {
    private String name;
    private int id;
    public void setName(String s){
        name=s;
    }
    public String getName(int n){
        return name;
    }
    public void setId(int n){
        id=n;
    }
    public int getId(int n){
        return n;
    }
    public class Main{
        public static void main(String[] args){
            Student st= new Student(); // default constructor
            st.setName("kiran");
            System.out.println(st.getName( 24));
            System.out.println(st.getId(20));

        }
    }
}
