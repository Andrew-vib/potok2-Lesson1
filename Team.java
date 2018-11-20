package lesson1;

public class Team {
    private String name;
    private int speed;
    private double time;

    public Team(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public double showResults (int distance){
        time = distance / speed;
        return time;
    }

    public void showInfo (){
        System.out.println (name + " run, his time on distance " + time);
    }

    Cat cat = new Cat("cat", 30);
    Dog dog = new Dog("dog", 40);
    Human human = new Human("human", 22);
    Human human2 = new Human ("human2", 20);
    // массив из четырех участников
    Team [] arrTeam = {cat, dog, human, human2};
}
