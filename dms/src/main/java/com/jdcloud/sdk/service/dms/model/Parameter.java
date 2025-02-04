/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;


/**
 * parameter
 */
public class Parameter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数名称。
     */
    private String name;

    /**
     * 列类型，TINYINT(&quot;TINYINT&quot;, 0), SMALLINT(&quot;SMALLINT&quot;, 1), MEDIUMINT(&quot;MEDIUMINT&quot;, 2), INT(&quot;INT&quot;, 3), BIGINT(&quot;BIGINT&quot;, 4), INTEGER(&quot;INTEGER&quot;, 5), FLOAT(&quot;FLOAT&quot;, 6), DOUBLE(&quot;DOUBLE&quot;, 7), REAL(&quot;REAL&quot;, 8), DECIMAL(&quot;DECIMAL&quot;, 9), CHAR(&quot;CHAR&quot;, 10), VARCHAR(&quot;VARCHAR&quot;, 11), TINYTEXT(&quot;TINYTEXT&quot;, 12), TEXT(&quot;TEXT&quot;, 13), MEDIUMTEXT(&quot;MEDIUMTEXT&quot;, 14), LONGTEXT(&quot;LONGTEXT&quot;, 15), DATE(&quot;DATE&quot;, 16), DATETIME(&quot;DATETIME&quot;, 17), TIMESTAMP(&quot;TIMESTAMP&quot;, 18), TIME(&quot;TIME&quot;, 19), YEAR(&quot;YEAR&quot;, 19), BINARY(&quot;BINARY&quot;, 20), VARBINARY(&quot;VARBINARY&quot;, 21), TINYBLOB(&quot;TINYBLOB&quot;, 22), BLOB(&quot;BLOB&quot;, 23), MEDIUMBLOB(&quot;MEDIUMBLOB&quot;, 24), LONGBLOB(&quot;LONGBLOB&quot;, 25);
     */
    private String columnTypeEnum;

    /**
     * 参数模式，IN(&quot;IN&quot;, 0), OUT(&quot;OUT&quot;, 1), INOUT(&quot;INOUT&quot;, 2);
     */
    private String parameterModeEnum;

    /**
     * 函数调用时传入值;
     */
    private String value;


    /**
     * get 参数名称。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 参数名称。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 列类型，TINYINT(&quot;TINYINT&quot;, 0), SMALLINT(&quot;SMALLINT&quot;, 1), MEDIUMINT(&quot;MEDIUMINT&quot;, 2), INT(&quot;INT&quot;, 3), BIGINT(&quot;BIGINT&quot;, 4), INTEGER(&quot;INTEGER&quot;, 5), FLOAT(&quot;FLOAT&quot;, 6), DOUBLE(&quot;DOUBLE&quot;, 7), REAL(&quot;REAL&quot;, 8), DECIMAL(&quot;DECIMAL&quot;, 9), CHAR(&quot;CHAR&quot;, 10), VARCHAR(&quot;VARCHAR&quot;, 11), TINYTEXT(&quot;TINYTEXT&quot;, 12), TEXT(&quot;TEXT&quot;, 13), MEDIUMTEXT(&quot;MEDIUMTEXT&quot;, 14), LONGTEXT(&quot;LONGTEXT&quot;, 15), DATE(&quot;DATE&quot;, 16), DATETIME(&quot;DATETIME&quot;, 17), TIMESTAMP(&quot;TIMESTAMP&quot;, 18), TIME(&quot;TIME&quot;, 19), YEAR(&quot;YEAR&quot;, 19), BINARY(&quot;BINARY&quot;, 20), VARBINARY(&quot;VARBINARY&quot;, 21), TINYBLOB(&quot;TINYBLOB&quot;, 22), BLOB(&quot;BLOB&quot;, 23), MEDIUMBLOB(&quot;MEDIUMBLOB&quot;, 24), LONGBLOB(&quot;LONGBLOB&quot;, 25);
     *
     * @return
     */
    public String getColumnTypeEnum() {
        return columnTypeEnum;
    }

    /**
     * set 列类型，TINYINT(&quot;TINYINT&quot;, 0), SMALLINT(&quot;SMALLINT&quot;, 1), MEDIUMINT(&quot;MEDIUMINT&quot;, 2), INT(&quot;INT&quot;, 3), BIGINT(&quot;BIGINT&quot;, 4), INTEGER(&quot;INTEGER&quot;, 5), FLOAT(&quot;FLOAT&quot;, 6), DOUBLE(&quot;DOUBLE&quot;, 7), REAL(&quot;REAL&quot;, 8), DECIMAL(&quot;DECIMAL&quot;, 9), CHAR(&quot;CHAR&quot;, 10), VARCHAR(&quot;VARCHAR&quot;, 11), TINYTEXT(&quot;TINYTEXT&quot;, 12), TEXT(&quot;TEXT&quot;, 13), MEDIUMTEXT(&quot;MEDIUMTEXT&quot;, 14), LONGTEXT(&quot;LONGTEXT&quot;, 15), DATE(&quot;DATE&quot;, 16), DATETIME(&quot;DATETIME&quot;, 17), TIMESTAMP(&quot;TIMESTAMP&quot;, 18), TIME(&quot;TIME&quot;, 19), YEAR(&quot;YEAR&quot;, 19), BINARY(&quot;BINARY&quot;, 20), VARBINARY(&quot;VARBINARY&quot;, 21), TINYBLOB(&quot;TINYBLOB&quot;, 22), BLOB(&quot;BLOB&quot;, 23), MEDIUMBLOB(&quot;MEDIUMBLOB&quot;, 24), LONGBLOB(&quot;LONGBLOB&quot;, 25);
     *
     * @param columnTypeEnum
     */
    public void setColumnTypeEnum(String columnTypeEnum) {
        this.columnTypeEnum = columnTypeEnum;
    }

    /**
     * get 参数模式，IN(&quot;IN&quot;, 0), OUT(&quot;OUT&quot;, 1), INOUT(&quot;INOUT&quot;, 2);
     *
     * @return
     */
    public String getParameterModeEnum() {
        return parameterModeEnum;
    }

    /**
     * set 参数模式，IN(&quot;IN&quot;, 0), OUT(&quot;OUT&quot;, 1), INOUT(&quot;INOUT&quot;, 2);
     *
     * @param parameterModeEnum
     */
    public void setParameterModeEnum(String parameterModeEnum) {
        this.parameterModeEnum = parameterModeEnum;
    }

    /**
     * get 函数调用时传入值;
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 函数调用时传入值;
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * set 参数名称。
     *
     * @param name
     */
    public Parameter name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 列类型，TINYINT(&quot;TINYINT&quot;, 0), SMALLINT(&quot;SMALLINT&quot;, 1), MEDIUMINT(&quot;MEDIUMINT&quot;, 2), INT(&quot;INT&quot;, 3), BIGINT(&quot;BIGINT&quot;, 4), INTEGER(&quot;INTEGER&quot;, 5), FLOAT(&quot;FLOAT&quot;, 6), DOUBLE(&quot;DOUBLE&quot;, 7), REAL(&quot;REAL&quot;, 8), DECIMAL(&quot;DECIMAL&quot;, 9), CHAR(&quot;CHAR&quot;, 10), VARCHAR(&quot;VARCHAR&quot;, 11), TINYTEXT(&quot;TINYTEXT&quot;, 12), TEXT(&quot;TEXT&quot;, 13), MEDIUMTEXT(&quot;MEDIUMTEXT&quot;, 14), LONGTEXT(&quot;LONGTEXT&quot;, 15), DATE(&quot;DATE&quot;, 16), DATETIME(&quot;DATETIME&quot;, 17), TIMESTAMP(&quot;TIMESTAMP&quot;, 18), TIME(&quot;TIME&quot;, 19), YEAR(&quot;YEAR&quot;, 19), BINARY(&quot;BINARY&quot;, 20), VARBINARY(&quot;VARBINARY&quot;, 21), TINYBLOB(&quot;TINYBLOB&quot;, 22), BLOB(&quot;BLOB&quot;, 23), MEDIUMBLOB(&quot;MEDIUMBLOB&quot;, 24), LONGBLOB(&quot;LONGBLOB&quot;, 25);
     *
     * @param columnTypeEnum
     */
    public Parameter columnTypeEnum(String columnTypeEnum) {
        this.columnTypeEnum = columnTypeEnum;
        return this;
    }

    /**
     * set 参数模式，IN(&quot;IN&quot;, 0), OUT(&quot;OUT&quot;, 1), INOUT(&quot;INOUT&quot;, 2);
     *
     * @param parameterModeEnum
     */
    public Parameter parameterModeEnum(String parameterModeEnum) {
        this.parameterModeEnum = parameterModeEnum;
        return this;
    }

    /**
     * set 函数调用时传入值;
     *
     * @param value
     */
    public Parameter value(String value) {
        this.value = value;
        return this;
    }


}