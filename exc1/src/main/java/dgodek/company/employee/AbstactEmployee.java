package dgodek.company.employee;

/**
 * Created by matematyk60 on 23.07.17.
 */
public abstract class AbstactEmployee implements Employee {

    private String name;

    private Role role;

    private int amountOfWork;


    public AbstactEmployee(String name, Role role) {
        this.name = name;
        this.role = role;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public int getAmountOfWork() {
        return amountOfWork;
    }

    public void setAmountOfWork(int amountOfWork) {
        this.amountOfWork = amountOfWork;
    }

    @Override
    public String toString() {
        return ("Name: " + name + " Role:" + role);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstactEmployee that = (AbstactEmployee) o;

        if (amountOfWork != that.amountOfWork) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return role == that.role;
    }


}