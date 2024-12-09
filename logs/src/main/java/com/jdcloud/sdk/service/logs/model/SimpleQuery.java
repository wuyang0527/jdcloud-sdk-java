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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * simpleQuery
 */
public class SimpleQuery  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * items
     */
    
    private List<SimpleQueryItem> items;
    /**
     * opt
     */
    private String opt;



    /**
    * get items
    *
    * @return
    */
    public List<SimpleQueryItem> getItems() {
        return items;
    }

    /**
    * set items
    *
    * @param items
    */
    public void setItems(List<SimpleQueryItem> items) {
        this.items = items;
    }


    /**
     * get opt
     *
     * @return
     */
    public String getOpt() {
        return opt;
    }

    /**
     * set opt
     *
     * @param opt
     */
    public void setOpt(String opt) {
        this.opt = opt;
    }



    /**
    * set items
    *
    * @param items
    */
    public SimpleQuery items(List<SimpleQueryItem> items) {
        this.items = items;
        return this;
    }


    /**
     * set opt
     *
     * @param opt
     */
    public SimpleQuery opt(String opt) {
        this.opt = opt;
        return this;
    }



    /**
     * add item to items
     *
     * @param item
     */
    public void addItem(SimpleQueryItem item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
    }
}