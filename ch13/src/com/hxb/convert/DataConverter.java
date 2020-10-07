package com.hxb.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataConverter implements Converter<String, Date> {
    private String dataPattern = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date convert(String source) {
        //格式化时期
        SimpleDateFormat sdf = new SimpleDateFormat(dataPattern);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("转换失败");
        }
        return new Date();
    }
}
