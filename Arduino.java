import jssc.SerialPort;
import jssc.SerialPortException;

public class Arduino {
    private static final String PORTA_PADRAO = "COM4";

    public static void main(String[] args) throws InterruptedException {
        SerialPort serialPort = new SerialPort(PORTA_PADRAO);
        try {
            serialPort.openPort();
            serialPort.setParams(115200, 8, 1, 0);

            int closePort = 1;
            while (closePort <= 10) {
                String informacao = serialPort.readString(11);
                System.out.println(informacao + " - " + closePort);
                closePort++;
            }

            serialPort.closePort();
        } catch (SerialPortException ex) {
            System.out.println(ex);
            System.out.println("Simulando conexão com Arduino");

            SimuladorArduino simular = new SimuladorArduino();
            SimuladorArduino.ValoresArduino();
        }
    }
}
