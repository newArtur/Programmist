import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person pr = new Person("Adam", "Work");
        pr.eat();
        pr.learn();
        pr.walk();
        Programmer pm = new Programmer("Artur", "Work2", "Microsoft");
        pm.coding();
        pm.eat();
        pm.learn();
        pm.walk();
        Dancer dr = new Dancer("Mikl Jekson", "Work3", "GruppaMechty");
        dr.eat();
        dr.learn();
        dr.walk();
        dr.dancing();
        Singer sr = new Singer("Mikl Jekson2", "Work4", "Banda#1");
        sr.eat();
        sr.learn();
        sr.walk();
        sr.singing();
        System.out.println(pr.toString());
        System.out.println(pm.toString());
        System.out.println(dr.toString());
        System.out.println(sr.toString());

        Person[]massiv = {pr,pm,dr,sr};

        Scanner rt = new Scanner(System.in);
        String con = rt.nextLine();

        for (Person c:massiv) {
            String s = "Mikl Jekson";
            if (c.getName().contains(con)){
                c.learn();
                c.walk();
                c.eat();
                System.out.println("Он любит - петь,танцевать,играть на музыкальных инструментов");
            }

        }

    }}