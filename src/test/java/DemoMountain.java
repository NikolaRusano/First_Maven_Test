public class DemoMountain {
    public static void main(String[] args) {


        Mountain mountain = new Mountain("Everrest");
        mountain.setCountry("Albania");
        mountain.setLongtitude(950.5);
        mountain.setLatitude(950.5);
        System.out.println(mountain.getCountry());
        System.out.println(mountain.getLatitude());
        System.out.println(mountain.getLongtitude());
        System.out.println(mountain.hashCode());


        System.out.println(mountain.toString());
    }
}