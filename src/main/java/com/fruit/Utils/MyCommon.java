package com.fruit.Utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin on 2017/4/12.
 */
public class MyCommon {

    //时间格式转换
    public Timestamp DateToTimestamp( Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate=simpleDateFormat.format(date);
        Timestamp timestamp=Timestamp.valueOf(strDate);
        return timestamp;
    }
}
