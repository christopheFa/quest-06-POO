package fr.wildcodeschool.quest.poo;

public class Wilder {
    // attributes
    private String firstName;
    private boolean aware;

    // constructors
    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    // instance method
    public String whoAmI() {
        String answerWhoAmI = "Je m'appelle " + this.getFirstName();
        if (this.isAware()) {
            answerWhoAmI += " et je suis aware";
        } else {
            answerWhoAmI += " et je ne suis pas aware";
        }
        return answerWhoAmI;
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}
