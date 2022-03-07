public class ModelViewController {
    public static void main(String args[]){
        System.out.println("This is MVC model!");
        Model car = makeCarinfo();
        View view = new View();

        Controller controller = new Controller(car, view);
        controller.viewInfo();

    }

    private static Model makeCarinfo()
    {
        Model car = new Model();
        car.setModelName("BMW");
        car.setSeatNum(5);
        car.setReleaseDate("2022");
        car.setLicensePlate("111-111");
        return car;
    }
}
