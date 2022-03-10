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

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 库表空间
 */
public class SchemaView  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表空间，top10
     */
    private List<TableStorage> items;

    /**
     * 扣分说明
     */
    private String message;


    /**
     * get 表空间，top10
     *
     * @return
     */
    public List<TableStorage> getItems() {
        return items;
    }

    /**
     * set 表空间，top10
     *
     * @param items
     */
    public void setItems(List<TableStorage> items) {
        this.items = items;
    }

    /**
     * get 扣分说明
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 扣分说明
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set 表空间，top10
     *
     * @param items
     */
    public SchemaView items(List<TableStorage> items) {
        this.items = items;
        return this;
    }

    /**
     * set 扣分说明
     *
     * @param message
     */
    public SchemaView message(String message) {
        this.message = message;
        return this;
    }


    /**
     * add item to 表空间，top10
     *
     * @param item
     */
    public void addItem(TableStorage item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
    }

}