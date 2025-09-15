import java.util.Scanner;

public class moduloDeConversaoDeTemperatura {

    public double temperaturaEmCelsius;
    public double temperaturaEmFahrenheit;
    public double temperaturaEmKelvin;

    public void obterDadosDoUsuario(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo à aplicação Conversor de Temperaturas!");
        System.out.print("Digite a temperatura desejada, em graus Celsius: ");
        temperaturaEmCelsius = leitor.nextDouble();
        calcularConversao();
    }

    public void calcularConversao(){
        temperaturaEmFahrenheit =temperaturaEmCelsius*1.8+32;
        temperaturaEmKelvin = temperaturaEmCelsius + 273.15;
        exibirResultado();
    }
    public void exibirResultado(){
        String temperaturaEmFahrenheitComDoisDecimais = String.format ("%.2f",temperaturaEmFahrenheit);
        System.out.printf(temperaturaEmCelsius + "°C é igual a " + temperaturaEmFahrenheitComDoisDecimais + "°F ou "+ temperaturaEmKelvin + "°K" );
    }

}
