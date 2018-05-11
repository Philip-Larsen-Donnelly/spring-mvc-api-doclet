package biz.rightshift.commons.doclet;

/**
 * Rest Api Parameter.
 */
public class RestApiParameter {
    private String type;
    private String name;
    private String description;
    private String defaultValue;
    private String required = "";

    /**
     * Constructor injecting fields.
     * @param name The variable's name.
     * @param type The variable's type.
     * @param description The variable's description.
     * @param defaultValue The variable's default value.
     * @param required The variable's need.
     */
    public RestApiParameter(final String name, final String type, final String description, final String defaultValue, final String required) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.defaultValue = defaultValue;
        this.required = required;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the default
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * @return the need
     */
    public String getRequired() {
        return required;
    }
}
