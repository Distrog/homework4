public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 20;
        if(age>=18){
            System.out.println("Если возраст человека = "+age+", то он совершеннолетний.");
        }
        else{
            System.out.println("Если возратс человека = "+age+", он не достиг совершеннолетия.");
        }

        //Задача 2
        int temperature = 10;
        if(temperature<5){
            System.out.println("На улице "+temperature+" градусов, нужно надеть шапку.");
        }
        else{
            System.out.println("На улице "+temperature+" градусов, можно идти без шапки.");
        }

        //Задача3
        int speed = 65;
        if(speed>60){
            System.out.println("Если скорость "+speed+" км/ч, то придется заплатить штраф.");
        }
        else{
            System.out.println("Если скорость "+speed+" км/ч, то можно ездить спокойно.");
        }

        //Задача4
        age = 15;
        if(age==1){
            System.out.println("Если возраст человека равен " + age+" лет, то находится дома.");
        }
        else if(age>=2 && age<=6){
            System.out.println("Если возраст человека равен " + age+" лет, то ему нужно ходить в детский сад.");
        }
        else if (age>=7 && age<=17){
            System.out.println("Если возраст человека равен " + age+" лет, то ему нужно ходить в школу.");
        }
        else if(age>=18 && age<=24){
            System.out.println("Если возраст человека равен " + age+" лет, то ему нужно ходить в универститет.");
        }
        else {
            System.out.println("Если возраст человека равен " + age+" лет, то ему нужно ходить на работу.");
        }

        //Задача5
        age = 8;
        if(age<=5){
            System.out.println("Если возраст ребенка равен " + age+" лет, то он не может кататься на аттракционах.");
        }
        else if(age>5&&age<14){
            System.out.println("Если возраст ребенка равен " + age+" лет, то он может кататься на аттракционах только " +
                    "в сопровождении родителей.");
        }
        else{
            System.out.println("Если возраст ребенка равен " + age+" лет, то он может кататься на аттракционах без " +
                    "сопровождения родителей.");
        }

        //Задача6
        int vanCapacity =102;
        int numberSeatingPlaces = 60;
        int numberPassenger = 45;
        if(numberPassenger<numberSeatingPlaces){
            System.out.println("В вагоне есть сидячие и стоячие места.");
        }
        else if(numberPassenger>=numberSeatingPlaces && numberPassenger>vanCapacity){
            System.out.println("В вагоне есть только стоячие места.");
        }
        else{
            System.out.println("В вагоне нет мест.");
        }

        //Задача7
        int one =3;
        int two = 3;
        int three = 2;

        if(one>two && one>three){
            System.out.println("Число "+one+" больше чисел "+two+" и "+three+".");
        }
        else if(two>one && two>three){
            System.out.println("Число "+two+" больше чисел "+one+" и "+three+".");
        }
        else if(three>two && three>one){
            System.out.println("Число "+three+" больше чисел "+one+" и "+two+".");
        }
        else {
            if(one==two){
                System.out.println("Максимальное число равно "+one+". И оно больше чем "+three+".");
            }
            else if(three==two){
                System.out.println("Максимальное число равно "+two+". И оно больше чем "+one+".");
            }
            else{
                System.out.println("Максимальное число равно "+one+". И оно больше чем "+two+".");
            }
        }
    }
}