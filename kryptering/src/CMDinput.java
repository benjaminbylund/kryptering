

public class CMDinput {
    public static void main(String[] args) {

        if(args.length <= 0) {
            System.out.println("Programmet vet inte vad det ska göra! Avbryter...");
        }
        if(args.length == 1) {
            System.out.println("så du säger");
        }
        if(args.length == 2) { // behandla det som siffor och räkna ut summan
            int n = 0;
            for (int i = 0; i < args.length; i++) {
                if (args[i].matches("[0-9]+")) {
                    n += Integer.parseInt(args[i]);
                }else{
                        System.out.println("Du använder ingen siffra");
                }
                System.out.println(n);
            }
        }
        if(args.length == 3) { // Skriv ut argumentet i omvänd ordning
            for (int i = args.length -1; i >= 0; i--){
                System.out.println(args[i]);
            }
        }
        if(args.length >= 4) {
            System.out.println("Jag orkar inte, jag stänger ner");

        }
    }
}

