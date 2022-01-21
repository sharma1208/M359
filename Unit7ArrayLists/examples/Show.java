package Unit7ArrayLists.examples;

public class Show {
    private String date;
    private double price;
    private int quantityOfTickets;
    private String artistName;
    private String location;

    public Show(String date, double price, int quantityOfTickets, String artistName, String location) {
        this.date = date;
        this.price = price;
        this.quantityOfTickets = quantityOfTickets;
        this.artistName = artistName;
        this.location = location;
    }

    public String toString(){
        //String output = date + "" + price + "\t\t" + quantityOfTickets + "\t\t" + artistName;
        String output = date;
         int nextColoumn = 12 - output.length();
         while(nextColoumn >  0 ) {
             output += " ";
             nextColoumn--;
         }
         output += price;
        nextColoumn = 24 - output.length();
        while(nextColoumn>  0 ) {
            output += " ";
            nextColoumn--;
        }
        output += quantityOfTickets;
        nextColoumn = 33 - output.length();
        while(nextColoumn>  0 ) {
            output += " ";
            nextColoumn--;
        }
        output += artistName;
        nextColoumn = 53 - output.length();
        while(nextColoumn >  0 ) {
            output += " ";
            nextColoumn--;
        }
        output += location;
        return output;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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


