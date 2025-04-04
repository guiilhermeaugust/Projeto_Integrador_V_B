import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class SimuladorArduino {

    private static final Random random = new Random(); // Gerador de números aleatórios

    public static List<Integer> ValoresArduino() {
        List<Integer> dados = new ArrayList<>();
        dados.add(random.nextInt(-40, 126));  // Temp
        dados.add(random.nextInt(552, 1024)); // Luz
        dados.add(random.nextInt(-50, 150));  // Umidade
        return dados;
    }

    public static void printValoresArduino() throws InterruptedException {
        while (true) {
            List<Integer> dados = ValoresArduino(); // Simulando os dados do Arduino
            Sensores sensores = new Sensores(dados.get(0), dados.get(1), dados.get(2));

            sensores.PrintTemperatura();
            sensores.PrintUmidade();
            sensores.PrintLuz();

            System.out.println("\n");
            Thread.sleep(2000); // Pausa de 2 segundos entre leituras
        }
    }

}
