package company.a_31_ezetap;

import java.util.List;

public class Country {
    private  String name;
    private List<String> callingCodes;

    public Country(String name, List<String> callingCodes) {
        this.name = name;
        this.callingCodes = callingCodes;
    }

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public Country setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
        return this;
    }
}
