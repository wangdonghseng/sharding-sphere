package io.shardingjdbc.console.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * SQL column information.
 *
 * @author zhangyonglun
 */
@AllArgsConstructor
@Getter
@Setter
public class SQLColumnInformation {
    
    private String columnName;
    
    private String columnTypeName;
    
    private Integer columnSize;
}