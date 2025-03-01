import java.util.Scanner;

public class tiendaderopa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double descuento = 0.15;
        float preciocamiseta = 25;
        float preciopantalon = 30;

        double descuentopantalon = preciocamiseta*(1-descuento);
        double descuentocamiseta = preciocamiseta*(1-descuento);
        double preciototal = (descuentocamiseta+descuentopantalon);
        out (preciototal)
        int cantidadcamiseta = 2;
        int cantidadpantalon = 2;
        out (descuentopantalon*descuentopantalon+descuentocamiseta+descuento);
        out descuentoadicional= descuentocamiseta (1-0,06);

    }
}