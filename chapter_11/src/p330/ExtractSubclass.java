package p330;

public class ExtractSubclass {

    public static void main(String[] args) {
        Employee kent = new Employee(1);
        JobItem j1 = new LaborItem(5, kent);
        JobItem j2 = new PartsItem(10, 15);
    }

}
