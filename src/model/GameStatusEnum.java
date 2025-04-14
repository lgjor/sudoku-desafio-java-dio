package model;

public enum GameStatusEnum {
    NON_STARTED("não inciado"),
    IN_PROGRESS("incompleto"),
    FINISHED("completo");

    private final String label;

    GameStatusEnum(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

