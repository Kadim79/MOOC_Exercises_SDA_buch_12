package mooc.week5;

public class Ex87 {

    public static void main(String[] args) {

        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true

        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400

        System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true
    }
}


class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment compared){
        if(this.squareMeters > compared.squareMeters)
            return true;
        else
            return false;
    }

    public double priceDifference(Apartment compared){
        if(this.pricePerSquareMeter*squareMeters>
                compared.pricePerSquareMeter*compared.squareMeters)
            return this.pricePerSquareMeter*squareMeters-
                    compared.pricePerSquareMeter*compared.squareMeters;
        else
            return compared.pricePerSquareMeter*compared.squareMeters -
                    this.pricePerSquareMeter*squareMeters;
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        if(this.squareMeters*pricePerSquareMeter>
        otherApartment.squareMeters*pricePerSquareMeter)
            return true;
        else
            return false;
    }
}