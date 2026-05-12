public class breakAndContinue {
    public static void main(String[] args) {

//        Break = break out of a loop (Stop)
//        Continue = skip current iteration of a loop (Skip)

        for (int i = 0 ;i < 10;i++){
            if(i==5){
                break; // When 5 comes the iterations is stopped
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("<---------------->");

        for (int i = 0 ;i < 10;i++){
            if(i==5){
                continue; // When 5 comes the iterations is stopped
            }
            System.out.print(i+" ");
        }
    }
}
