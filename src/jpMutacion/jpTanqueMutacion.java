package jpMutacion;

public class jpTanqueMutacion implements jpIAMutacion {

    public String jpMutar(String clase) {
        if (clase.equalsIgnoreCase("cocodrilo")) {

            int jpTotal = (int) (Math.random() * (1000 - 100 + 1)) + 100;
            int jpContador = 0;
            double jpAumento = jpTotal / 100.00;
            try {
                while (jpContador < jpTotal) {
                    System.out.print(
                            "\rMutacion en proceso: ------   " + jpContador + " de " + (jpTotal) + "(mSv)");
                    jpContador += jpAumento;
                    Thread.sleep(333);
                }
                if (jpContador <= jpTotal) {
                    while (jpContador <= jpTotal) {
                        System.out.print(
                                "\rMutacion en proceso: ------   " + jpContador + " de " + (jpTotal) + "(mSv)");
                        jpContador += 1;
                        Thread.sleep(333);
                    }
                }
                System.out.println("\n----------------------------------------------------------");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            return "Cocodrilo Pincay";
        } else {
            System.out.println("Mutacion fallida");
            return null;
        }
    }

}
