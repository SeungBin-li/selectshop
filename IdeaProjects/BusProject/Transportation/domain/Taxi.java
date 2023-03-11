package Transportation.domain;

public class Taxi extends Transportation {
    private String whereToGo;
    private int distance;
    private int basicFare;
    private int basicDistance;
    private int additionalFare;

    public int getDistanceFare() {
        return distanceFare;
    }

    public void setDistanceFare(int distanceFare) {
        this.distanceFare = distanceFare;
    }

    private int distanceFare;

    public String getWhereToGo() {
        return whereToGo;
    }

    public void setWhereToGo(String whereToGo) {
        this.whereToGo = whereToGo;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getBasicFare() {
        return basicFare;
    }

    public void setBasicFare(int basicFare) {
        this.basicFare = basicFare;
    }

    public int getBasicDistance() {
        return basicDistance;
    }

    public void setBasicDistance(int basicDistance) {
        this.basicDistance = basicDistance;
    }

    public int getAdditionalFare() {
        return additionalFare;
    }

    public void setAdditionalFare(int additionalFare) {
        this.additionalFare = additionalFare;
    }

    public Taxi(int num){
        super();
        this.setNowPassenger(3);
        this.setGoStop(true);
        this.setBasicDistance(1);
        this.setNum(num);
        this.setBasicFare(3300);
        this.setAdditionalFare(0);
        this.setDistanceFare(1000);
    }
}
