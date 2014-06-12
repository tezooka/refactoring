package q315;

import java.util.Stack;

public class ResourcePool {

    private Stack _available;

    private Stack _allocated;

    Resource getResource() {
        Resource result;
        if (_available.isEmpty()) {
            result = new Resource();
        } else {
            result = (Resource) _available.pop();
        }
        _allocated.push(result);
        return result;
    }

}
