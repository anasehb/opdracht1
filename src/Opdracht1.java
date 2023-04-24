public class Opdracht1 {

    int getal;

    public static void main(String[] args) {

        priemGetallen();

    }


    public static void priemGetallen() {



        //ga van 1 tot 100, steek in getal i
        for (int i = 1; i < 100; i++) {
            //zoek de delers van getal i
            int aantal_delers = 0;
            // checkt hoeveel delers een getal heeft, door i te delen door j telkens
            for(int j = 1; j<=i; j++){
                if (i % j == 0) {
                    aantal_delers++;
                }
            }
            if(aantal_delers == 2){
                System.out.println(i + "is een priemgetal");
            }

        }
    }
}