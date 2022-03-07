public class Controller {
    // Transfer data between Model and View
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public String getCarName() {
        return this.model.getModelName();
    }

    public void setCarName(String name) {
        this.model.setModelName(name);
    }

    public String getLicensePlate() {
        return this.model.getLicensePlate();
    }

    public void setLicensePlate(String licensePlate) {
        this.model.setLicensePlate(licensePlate);
    }

    public String getReleaseDate() {
        return this.model.getReleaseDate();
    }

    public void setReleaseDate(String releaseDate) {
        this.model.setReleaseDate(releaseDate);
    }

    public int getSeatNum() {
        return this.model.getSeatNum();
    }

    public void setSeatNum(int seatNum) {
        this.model.setSeatNum(seatNum);
    }

    public void viewInfo() {
        view.printCarInfo(model.getModelName(), model.getLicensePlate(), model.getReleaseDate(), model.getSeatNum());
    }
}
