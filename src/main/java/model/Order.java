package model;

public class Order {


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isComfirmed() {
        return comfirmed;
    }

    public void setComfirmed(boolean comfirmed) {
        this.comfirmed = comfirmed;
    }

    private String id;
    private String requesterId;
    private String providerId;
    private String date;
    private String departure;
    private String destination;
    private boolean comfirmed;

    public Order(String id, String requesterId, String providerId, String date, String departure, String destination, boolean comfirmed) {
        this.id = id;
        this.requesterId = requesterId;
        this.providerId = providerId;
        this.date = date;
        this.departure = departure;
        this.destination = destination;
        this.comfirmed = comfirmed;
    }
}
