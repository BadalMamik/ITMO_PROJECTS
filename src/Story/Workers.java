package Story;


public class Workers extends Character {
    protected String name;
    static int workersNum = 20;

    public Workers(String name, int money, float salary, String status) {
        super(name, money, salary, status);

    }

    @Override
    public String toString() {
        return "Workers{" + "name='" + super.name + '\'' + ", salary=" + super.salary + " fertings}";
    }

    // Статический класс
    public static class Worker {
        public static int getWorkersNum() {
            return workersNum;
        }

    }

}
