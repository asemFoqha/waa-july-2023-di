package dependencyInjection;

import java.util.HashMap;
import java.util.Map;

public class Container {
    private Map<Object, Object> _dependencyMapper = new HashMap<>();

    public void addAllDependency(Class<?> clazz) {
        try {
            _dependencyMapper.put(clazz, clazz.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            throw new RuntimeException("Couldn't register this dependency, need to have default constructor");
        }
    }

    public Object getAllDependency(Class<?> clazz) {
        if (_dependencyMapper.get(clazz) == null) {
            throw new RuntimeException("Missing dependency, please provide it first");
        }

        return _dependencyMapper.get(clazz);
    }
}
