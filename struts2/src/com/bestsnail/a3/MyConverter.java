package com.bestsnail.a3;

import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by stone on 16-12-5.
 */
public class MyConverter extends StrutsTypeConverter {

    /**
     *  把String类型转换成制定的类型
     * @param map  当前的上下文环境
     * @param strings jsp提交的表单数据
     * @param aClass 要转换的类型
     * @return
     */
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        return null;
    }

    @Override
    public String convertToString(Map map, Object o) {
        return null;
    }
}
