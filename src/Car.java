public class Car {
    /* fields */
    private String nickname = "none";
    private String make = "none";
    private String model = "none";
    private int year;
    private int workStage;
    private boolean isComplete;

    /* constructors */
    Car() {
    }
    Car(String nickname, String make, String model, int year, int workStage) {
        setNickname(nickname);
        setMake(make);
        setModel(model);
        setYear(year);
        setWorkStage(workStage);
    }

    //toString override default object and return a report of every field value
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nickname: ").append(nickname).append('\n');
        sb.append("Make: ").append(make).append('\n');
        sb.append("Model: ").append(model).append('\n');
        sb.append("Year: ").append(year).append('\n');
        sb.append("Stage of work: ").append(workStage).append('\n');
        sb.append("Done: ").append(isComplete).append('\n');
        return sb.toString();
    }

    public void workStageAdvance() {
        if (workStage < 4) {
            workStage += 1;
            System.out.println("Car advanced to stage: " + workStage + "\n");
        }
        else {
            System.out.println("Car is already complete!");
        }
    }

    /* getters and setters */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    /*
    *
    * 0 = ready to start bodywork
    * 1 = working on bodywork
    * 2 = bodywork finished, working on paint
    * 3 = paint finished, ready for touchups
    * 4+ = done
     */
    public void setWorkStage(int stage) {
        workStage = stage;
        if (workStage >= 4) {
            setIsComplete(true);
        }
        else {
            setIsComplete(false);
        }
    }
    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public String getNickname() {
        return nickname;
    }
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public int getWorkStage() {
        return this.workStage;
    }
    public boolean isComplete() {
        return this.isComplete;
    }

    /* test main
    public static void main(String[] args) {
        Car mustang = new Car("69 Mustang", "Ford", "Mustang Coupe", 1969, 0, false);
        System.out.println(mustang.toString());
    }
     */
}
