public class Assignment5 {

    
    public static void main(String[] args) {
        System.out.print("Kilograms  Pounds   |   Pounds  Kilograms");
        for(int i = 0;i<100;i++){
            int kIteration = 1+2*i;
            System.out.print("\n" + (kIteration));
            
            while(kIteration<100){
                System.out.print(" ");
                kIteration *= 10;
            }
            
            System.out.print("         ");
            
            double pounds = (Math.round(((1+2*i)*2.2)*10));
            pounds /= 10;
            
            for(double a = pounds;a<100;a*=10){
                System.out.print(" ");
            }
            
            System.out.print(pounds + "       ");
            
            int pIteration = i*5 + 20;
            System.out.print(pIteration);
            
            if(pIteration<100){
                System.out.print(" ");
            }
            
            System.out.print("        ");
            
            double kilo = Math.round((pIteration/2.2)*100);
            kilo /= 100;
            
            for(double a = kilo;a<100;a*=10){
                System.out.print(" ");
            }
            
            System.out.print(kilo);
        }
    }  
}