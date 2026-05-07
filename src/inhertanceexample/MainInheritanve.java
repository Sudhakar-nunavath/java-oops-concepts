package inhertanceexample;

public class MainInheritanve {


    public static void main(String[]args){

        System.out.println("Parent class__________________");
        Vehicle vehicle=new Vehicle();

        vehicle.start();;
        vehicle.stop();
        vehicle.fuled();


        System.out.println("WaterChild class _____________");

        WaterVehicle watervehicle=new WaterVehicle();

        watervehicle.start();
        watervehicle.stop();
        watervehicle.fuled();
        watervehicle.isWater();


        System.out.println("Air class _____________");

        AirVehicle air=new  AirVehicle();

        air.start();
        air.stop();
        air.fuled();
        air.isAir();
        System.out.println("Road class _____________");

        RoadVehicle road=new RoadVehicle();

        road.start();
        road.stop();
        road.fuled();
        road.isRoad();


    }
}
