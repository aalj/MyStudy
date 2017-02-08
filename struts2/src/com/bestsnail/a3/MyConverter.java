package com.bestsnail.a3;

import org.apache.struts2.util.Counter;
import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 *
 * 自定义struts的类型转换器
 * Created by stone on 16-12-5.
 */
public class MyConverter extends StrutsTypeConverter {
    SimpleDateFormat[] df = {new SimpleDateFormat("yyyyMMdd"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy年MM月dd")};
    /**
     *  把String类型转换成制定的类型
     * @param map  当前的上下文环境
     * @param strings jsp提交的表单数据 考虑到表单在一些情况下会提交一组数据比如复选框
     * @param aClass 要转换的类型
     * @return
     */
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        System.out.println("自定义转换器");
        if(strings != null && strings.length == 0){
            return null;
        }

        if (Date.class != aClass) {
            return null;
        }

        for (int i = 0; i < df.length ; i++) {
            try {
                return df[i].parse(strings[0]);
            } catch (ParseException e) {
                continue;
            }
        }

        return null;
    }

    /**
     * 把特定类型转换成String类型。
     * @param map
     * @param o
     * @return
     */
    @Override
    public String convertToString(Map map, Object o) {
        return null;
    }
}
