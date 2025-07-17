// Class that represents information about the petrol you purchase

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantityLitres;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType,
                          int quantityLitres, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityLitres = quantityLitres;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityLitres() {
        return quantityLitres;
    }

    public void setQuantityLitres(int quantityLitres) {
        this.quantityLitres = quantityLitres;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount() {
        double purchaseAmount = quantityLitres * pricePerLitre - percentageDiscount;
        return purchaseAmount;
    }
}
