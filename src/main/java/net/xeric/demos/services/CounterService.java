package net.xeric.demos.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by markshead on 4/2/16.
 */
@Service
@Component
public class CounterService {
    int count = 0;
    public int increment() {
        return count++;
    }
}
