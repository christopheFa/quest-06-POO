package fr.wildcodeschool.quest.poo;

public class Classroom {
    public static void main(String[] args) {
        Wilder jeanClaude = new Wilder("Jean Claude Van Damme",true);
        Wilder raymond = new Wilder("Raymond Domenech",false);

        System.out.println(jeanClaude.whoAmI());
        System.out.println(raymond.whoAmI());

        raymond.setFirstName("Raymond Devos");
        raymond.setAware(true);
        System.out.println(raymond.whoAmI());
    }
}
