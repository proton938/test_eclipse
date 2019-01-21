public class Test {
    public static void main(String[] args) {
        class CircleStuff1 {
            static final String GREETING = "Hello, world";
            
            public CircleStuff1 () {
                System.out.println(" " + GREETING);    
            }                
        }  
        
        CircleStuff1 cs = new CircleStuff1();         
    }    
}