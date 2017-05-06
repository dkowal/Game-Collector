package pl.dkowal.domain;

import java.util.Date;

public class Game {

    private String gameId;
    private String name;
    private double buyPrice;
    private String description;
    private Date dateOfPremiere;
    private Date dateOfPurchase;
    private long playTime;
    private Status status;
    private String manufacturer;

    public Game() {
        super();
    }

    public Game(String gameId, String name, double buyPrice, String description, Date dateOfPremiere, Date dateOfPurchase, long playTime, Status status, String manufacturer) {
        this.gameId = gameId;
        this.name = name;
        this.buyPrice = buyPrice;
        this.description = description;
        this.dateOfPremiere = dateOfPremiere;
        this.dateOfPurchase = dateOfPurchase;
        this.playTime = playTime;
        this.status = status;
        this.manufacturer = manufacturer;
    }

    public Date getDateOfPremiere() {
        return dateOfPremiere;
    }

    public void setDateOfPremiere(Date dateOfPremiere) {
        this.dateOfPremiere = dateOfPremiere;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public long getPlayTime() {
        return playTime;
    }

    public void setPlayTime(long playTime) {
        this.playTime = playTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (Double.compare(game.buyPrice, buyPrice) != 0) return false;
        if (playTime != game.playTime) return false;
        if (gameId != null ? !gameId.equals(game.gameId) : game.gameId != null) return false;
        if (name != null ? !name.equals(game.name) : game.name != null) return false;
        if (description != null ? !description.equals(game.description) : game.description != null) return false;
        if (dateOfPurchase != null ? !dateOfPurchase.equals(game.dateOfPurchase) : game.dateOfPurchase != null)
            return false;
        if (status != game.status) return false;
        return manufacturer != null ? manufacturer.equals(game.manufacturer) : game.manufacturer == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = gameId != null ? gameId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(buyPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dateOfPurchase != null ? dateOfPurchase.hashCode() : 0);
        result = 31 * result + (int) (playTime ^ (playTime >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId='" + gameId + '\'' +
                ", name='" + name + '\'' +
                ", buyPrice=" + buyPrice +
                ", description='" + description + '\'' +
                ", dateOfPurchase=" + dateOfPurchase +
                ", playTime=" + playTime +
                ", status=" + status +
                '}';
    }
}