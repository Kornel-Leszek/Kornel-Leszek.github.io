public class WysylaczWiadomosci {

    public void wyslij(String... wiadomosci) {
        for (String wiadomosc : wiadomosci) {
            System.out.println("[Ogólny]: " + wiadomosc);
        }
    }
}
