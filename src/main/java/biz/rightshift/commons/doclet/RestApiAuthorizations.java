package biz.rightshift.commons.doclet;

import java.util.List;

/**
 * Rest Api Authorizations.
 */
public class RestApiAuthorizations {
    private String name;
    private List<String> items;

    /**
     * Constructor injecting fields.
     * @param name The type of authorization.
     * @param items The items associated with the Authorization..
     */
    public RestApiAuthorizations(final String name, final List<String> items) {
        this.name = name;
        this.items = items;
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
    public List<String> getItems() {
        return items;
    }
}
