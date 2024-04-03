public class Place {
    private int x;
    private int y;
    private String[] services;

    public Place(int x, int y, String[] services) {
        this.x = x;
        this.y = y;
        this.services = services;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }
}
