public class calc {
    //INTEGER ANSWERS
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mult(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
    //DECIMAL ANSWERS
    public double add(double a, double b) {    
        return a + b;
    }
    public double sub(double a, double b) {    
        return a - b;
    }
    public double mult(double a, double b) {    
        return a * b;
        
    }public double div(double a, double b) {    
        return a / b;
    }
    public static void main(String[] args) {
            calc myCalculator = new calc();
            System.out.println(myCalculator.add(4,7));
    
            System.out.println(myCalculator.sub(7,3));
    
            System.out.println(myCalculator.mult(4,7));
        
            System.out.println(myCalculator.div(4,7));
            
            System.out.println(myCalculator.div(0,7));
            
            System.out.println(myCalculator.add(4.2,7.15));
    }
}
