package Task6;

public enum Head implements Make {
HEAD_1("голова терминатора"), HEAD_2("голова робокопа"), HEAD_3("голова трансформера");

private String name;

    Head(String name) {
        this.name = name;
    }

    @Override
    public String makeParts() {
        return null;
    }
}