package com.geller.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public boolean isPositiveNumber(String str){
        if (NumberUtils.isParsable(str)){
            double number = NumberUtils.toDouble(str);
            return number > 0;
        }

        return false;
    }
}
