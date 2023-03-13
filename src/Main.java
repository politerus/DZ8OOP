public class Main {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD",
                1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD",
                1280, 1024);

        System.out.println(monitor1.toString() + "\nEquality:" + monitor1.equals(monitor2) +
                "\nMonitor 1 hash code:" + monitor1.hashCode() + "\nMonitor 2 hash code:" + monitor2.hashCode());

        EthernetAdapter eAdapter1 = new EthernetAdapter( "Samsung", 120, "AB1234567CD",
                100, "E0-00-00-01");
        EthernetAdapter eAdapter2 = new EthernetAdapter( "Samsung", 120, "AB1234567CD",
                100, "E0-00-00-01");

        System.out.println(eAdapter1.toString() + "\nAdapters equality:" + eAdapter1.equals(eAdapter2) +
                "\nAdapter 1 hash code:" + eAdapter1.hashCode() + "\nAdapter 2 hash code:" + eAdapter2.hashCode());

    }
}