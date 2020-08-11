public class bmwFactory {

    public static registrationBMW carInfo(){

        registrationBMW car = new registrationBMW();
        car.setBrand("BMW");
        car.setModel("318");
        car.setStartYear("1991");
        car.setEndYear("1998");
        car.setEngineType("Бензинов");
        car.setGearboxType("Ръчна");
        car.setCoupeType("Купе");
        car.setSortingType("7");
        return car;
    }
}
