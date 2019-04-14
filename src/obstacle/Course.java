package obstacle;

import java.util.*;
import animals.*;

public class Course {
    Let[] let = new Let[3];
    Random random = new Random();
    // Создаем полосу препятствий
    public Course() {
        Run track = new Run(random.nextInt(100));
        Vaulting wall = new Vaulting(random.nextFloat() * 10);
        Swimming water = new Swimming(random.nextInt(100));
        let[0] = (Let) track;
        let[1] = (Let) wall;
        let[2] = (Let) water;
    }
    //Вывод информации о полосе препятствий
    public void printInformationAboutTheObstacle() {
        System.out.println("Length track: " + ((Run) let[0]).getLength());
        System.out.println("Height wall: " + ((Vaulting) let[1]).getHeight());
        System.out.println("Length water: " + ((Swimming) let[2]).getLength());
        System.out.println();
    }
    // Проходим полосу препятствий
    public void passObstacles(Team team){
        for(Animal animal : team.teamAnimal){
            for(Let l : let){
                if(!l.doIt(animal)){
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }
}
