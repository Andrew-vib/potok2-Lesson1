package lesson1;

/**
 * @author ilnaz-92@yandex.ru
 * Created on 16/11/2018
 */
public class Cat extends Team{

  private String name;
  private int speed;
  private double time;

  public Cat (String name, int speed){
    super (name, speed);
  }

  @Override
  public double showResults (int distance){
    time = distance / speed;
    return time;
  }

  @Override
  public void showInfo (){
    System.out.println (name + " run, his time on distance " + time);
  }
}
