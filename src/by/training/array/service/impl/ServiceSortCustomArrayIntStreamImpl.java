package by.training.array.service.impl;

import by.training.array.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ServiceSortCustomArrayIntStreamImpl extends ServiceCustomArrayIntStreamImpl {

    static final Logger logger = LogManager.getLogger();

    public int[] sort(CustomArray customArray) {
        int[] array = Arrays.stream(customArray.getCustomArray()).sorted().toArray();
        logger.log(Level.INFO, "CustomArray was sorted by IntStream sort");
        return array;
    }
}
