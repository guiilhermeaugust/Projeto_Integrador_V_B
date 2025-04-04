public class Sensores {
    private int temperatura;
    private int umidade;
    private int luz;

    public Sensores(int temperatura, int umidade, int luz) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.luz = luz;
    }

    public void PrintTemperatura() {
        if (temperatura <= 10) {
            System.out.println("Está fazendo " + temperatura + "º, muito frio (Aconselha-se usar agasalho)");
        } else if (temperatura <= 20) {
            System.out.println("Temperatura: " + temperatura + "º, ambiente agradável");
        } else if (temperatura <= 30) {
            System.out.println("Temperatura: " + temperatura + "º, quente (Aconselha-se ligar o ar condicionado)");
        } else if (temperatura <= 40) {
            System.out.println("Temperatura: " + temperatura + "º, muito quente (Aconselha-se ligar o ar condicionado e se hidratar)");
        } else {
            System.out.println("Temperatura: " + temperatura + "º, extremamente quente (Ligue o ar condicionado e se hidrate bastante)");
        }
    }

    public void PrintUmidade() {
        if(umidade <= 25) {
            System.out.println("Umidade: muito seco (Aconselha-se usar umidificador)");
        }else if (umidade <= 30) {
            System.out.println("Umidade: ligeiramente seco (Aconselha-se usar umidificador)");
        } else if (umidade >= 50 && umidade <= 80) {
            System.out.println("Umidade: Agradável");
        } else if (umidade > 80){
            System.out.println("Umidade: úmido!");
        }
    }

    public void PrintLuz() {
        System.out.println("Luz: " + luz);
    }
}
