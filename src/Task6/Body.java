package Task6;

public enum Body implements Make {
    BODY_1("пластиковое тело"), BODY_2("металлическое тело"), BODY_3("деревяное тело");

    private String name;

    Body(String name) {
        this.name = name;
    }

    @Override
    public String makeParts() {
        return null;
    }
}