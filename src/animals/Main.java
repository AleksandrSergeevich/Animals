package animals;

import obstacle.Course;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team("nameTeam"); // Создаем команду
        c.passObstacles(team); // Просим команду пройти полосу
        team.passedTheDistance(); // Показываем результаты
    }
}
