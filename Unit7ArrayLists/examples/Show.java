package Unit7ArrayLists.examples;

public class Show {
    private String date;
    private int price;
    private int quantityOfTickets;
    private String artistName;
    private String location;

    public Show(String date, int price, int quantityOfTickets, String artistName, String location) {
        this.date = date;
        this.price = price;
        this.quantityOfTickets = quantityOfTickets;
        this.artistName = artistName;
        this.location = location;
    }

    public String toString(){
        String output = "Date\tPrice\tQty\tPerformer\t\tCity";
        output += "-----------------------------------------------------------------";
        output += date + " " + price + " " + quantityOfTickets + " " + artistName + " " + location;
        return output;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityOfTickets() {
        return quantityOfTickets;
    }

    public void setQuantityOfTickets(int quantityOfTickets) {
        this.quantityOfTickets = quantityOfTickets;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

