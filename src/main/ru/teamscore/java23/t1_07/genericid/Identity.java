package ru.teamscore.java23.t1_07.genericid;

public class Identity<TId> {
    private final TId id;

    public Identity(TId id) {
        this.id = id;
    }

    public TId getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Identity && id.equals( ((Identity<TId>)obj).getId() )) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Identity{" +
                "id=" + id +
                '}';
    }
}
