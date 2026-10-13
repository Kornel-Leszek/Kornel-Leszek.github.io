public class WysylaczEmail extends WysylaczWiadomosci {

    @Override
    public void wyslij(String... wiadomosci) {
        for (String wiadomosc : wiadomosci) {
            System.out.println("[EMAIL]: " + wiadomosc.toUpperCase());
        }
    }
}
