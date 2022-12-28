package business;

public class Stat extends Character {
    private String body;
    private String mind;
    private String spirit;

    public Stat(String body, String mind, String spirit) {
        this.body = body;
        this.mind = mind;
        this.spirit = spirit;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMind() {
        return mind;
    }

    public void setMind(String mind) {
        this.mind = mind;
    }

    public String getSpirit() {
        return spirit;
    }

    public void setSpirit(String spirit) {
        this.spirit = spirit;
    }
}
