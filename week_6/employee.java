public class employee {
    protected String id;
    protected String name;

    public employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + this.id);
        System.out.println("Name        : " + this.name);
    }
}
