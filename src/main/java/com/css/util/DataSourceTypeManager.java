package com.css.util;
import com.css.enums.DataSourceEnum;
public class DataSourceTypeManager {
    private static final ThreadLocal<DataSourceEnum> dataSourceTypes = new ThreadLocal<DataSourceEnum>(){
      @Override
      protected DataSourceEnum initialValue(){
          return DataSourceEnum.POSTSQL;
      }
    };
    public static DataSourceEnum get(){
        return dataSourceTypes.get();
    }
    public static void set(DataSourceEnum dataSourceEnum){
        dataSourceTypes.set(dataSourceEnum);
    }
    public static void reset(){
        dataSourceTypes.set(DataSourceEnum.POSTSQL);
    }
}
