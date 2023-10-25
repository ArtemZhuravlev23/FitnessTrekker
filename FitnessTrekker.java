public class FitnessTrekker {

    private static final int current_year = 2023;
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phone;
    private String lastname;
    private double weight;
    private String pressure;
    private int steps;
    private int age;


    public FitnessTrekker(String name, String lastname, int birthDay, int birthMonth, int birthYear, String email, String phone, double weight, String pressure, int steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.lastname = lastname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = current_year - this.birthYear;
        printAccountInfo();
    }

    public String getName() {return name; }

    public int getBirthDay() {return birthDay; }

    public int getBirthMonth() {return birthMonth; }

    public int getBirthYear() {return birthYear; }

    public String getEmail() {return email; }

    public String getPhone() {return phone; }

    public String getLastname() {return lastname; }

    public void setLastname(String lastname) {this.lastname = lastname; }

    public double getWeight() {return weight; }

    public void setWeight(double weight) {this.weight = weight; }

    public String getPressure() {return pressure; }

    public void setPressure(String pressure) {this.pressure = pressure; }

    public int getSteps() {return steps; }

    public void setSteps(int steps) {this.steps = steps; }

    public int getAge() {return age; }

    public void printAccountInfo() {
        System.out.println("FitnessTrekker {" +
                "name = " + name +
                ", birthDay = " + birthDay +
                ", birthMonth = " + birthMonth +
                ", birthYear = " + birthYear +
                ", email = '" + email + '\'' +
                ", phone = " + phone +
                ", lastname = " + lastname +
                ", weight = " + weight +
                ", pressure = " + pressure +
                ", steps = " + steps +
                ", age = " + age +
                '}');

    }

}

        class FitnessTrekkerRunner {
            public static void main(String[] args) {
                FitnessTrekker[] fitnessTrekkers = {
                        new FitnessTrekker("Will",
                                "Smith",
                                25,
                                9,
                                1968,
                                "w.smith@gmail.com",
                                "2936729462846",
                                82,
                                "80",
                                15000),
                        new FitnessTrekker("Jackie",
                                "Chan",
                                13,
                                7,
                                1957,
                                "j.chan@gmail.com",
                                "18273981236",
                                67,
                                "92",
                                20000),
                        new FitnessTrekker("Jason",
                                "Statham",
                                15,
                                5,
                                1970,
                                "j.statham@gmail.com",
                                "981237129313",
                                70,
                                "94",
                                50000),
                        new FitnessTrekker("Daniel",
                                "D.Lewis",
                                7,
                                2,
                                1960,
                                "d.dlewis@gmail.com",
                                "91827381236123",
                                80,
                                "92",
                                18000)};
            }

        }
