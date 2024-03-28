package models.enums;

import java.util.Arrays;

public enum ProfileEnum {

    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_CUSTUMER("ROLE_CUSTUMER"),
    ROLE_TECHNICIAN("ROLE_TECHNICIAN");

    private final String description;

    ProfileEnum(String description) {
        this.description = description;
    }

    public static ProfileEnum toEnum(String description) {
        return Arrays.stream(ProfileEnum.values())
                .filter(profileEnum -> profileEnum.description.equals(description))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid description: " + description));
    }

}
