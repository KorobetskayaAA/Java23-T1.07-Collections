package ru.teamscore.java23.t1_07.genericid;

public class NamedEntity<TId> extends Identity<TId> {
    private String name;

    public NamedEntity(TId tId, String name) {
        super(tId);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
