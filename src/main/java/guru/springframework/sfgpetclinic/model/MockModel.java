package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.fauxspring.Model;

import java.util.HashMap;
import java.util.Map;

public class MockModel implements Model {

    private final Map<String, Object> atribute = new HashMap<>();

    @Override
    public void addAttribute(String key, Object o) {
        this.atribute.put(key, o);
    }

    @Override
    public void addAttribute(Object o) {

    }

    public Map<String, Object> getValues(){

        return this.atribute;

    }
}
