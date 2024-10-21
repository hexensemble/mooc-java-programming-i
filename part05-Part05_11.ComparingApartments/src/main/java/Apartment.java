
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int thisPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.getPricePerSquare() * compared.getSquares();

        if (thisPrice < comparedPrice) {
            return comparedPrice - thisPrice;
        } else {
            return thisPrice - comparedPrice;
        }

    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.getPricePerSquare() * compared.getSquares();

        if (thisPrice > comparedPrice) {
            return true;
        } else {
            return false;
        }
    }

    public int getRooms() {
        return this.rooms;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPricePerSquare() {
        return this.pricePerSquare;
    }

}
