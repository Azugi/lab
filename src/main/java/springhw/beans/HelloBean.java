package springhw.beans;

public class HelloBean {
    private String name;

    //Конструктор

    public HelloBean() {}

    public HelloBean(String name) {
        super();
        this.name = name;
    }



    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Печать объекта в строку
    @Override
    public String toString() {
        return "HelloBean [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }


}
