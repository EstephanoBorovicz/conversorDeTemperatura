public class conversorApp{
    public static void main(String[] args) {
        System.out.println("Iniciando conversor de temperatura...");
        moduloDeConversaoDeTemperatura conversor = new moduloDeConversaoDeTemperatura();
        conversor.obterDadosDoUsuario();
    }
}