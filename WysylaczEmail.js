class WysylaczEmail extends WysylaczWiadomosci {
    wyslij(...wiadomosci) {
        for (const wiadomosc of wiadomosci) {
            console.log("[EMAIL]: " + wiadomosc.toUpperCase());
        }
    }
}
