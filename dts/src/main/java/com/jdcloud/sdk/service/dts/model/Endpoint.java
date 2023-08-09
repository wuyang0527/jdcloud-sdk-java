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

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;

/**
 * endpoint
 */
public class Endpoint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * source
     */
    
    private List<Property> source;
    /**
     * destination
     */
    
    private List<Property> destination;


    /**
    * get source
    *
    * @return
    */
    public List<Property> getSource() {
        return source;
    }

    /**
    * set source
    *
    * @param source
    */
    public void setSource(List<Property> source) {
        this.source = source;
    }


    /**
    * get destination
    *
    * @return
    */
    public List<Property> getDestination() {
        return destination;
    }

    /**
    * set destination
    *
    * @param destination
    */
    public void setDestination(List<Property> destination) {
        this.destination = destination;
    }



    /**
    * set source
    *
    * @param source
    */
    public Endpoint source(List<Property> source) {
        this.source = source;
        return this;
    }


    /**
    * set destination
    *
    * @param destination
    */
    public Endpoint destination(List<Property> destination) {
        this.destination = destination;
        return this;
    }



    /**
     * add item to source
     *
     * @param source
     */
    public void addSource(Property source) {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        this.source.add(source);
    }

    /**
     * add item to destination
     *
     * @param destination
     */
    public void addDestination(Property destination) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        this.destination.add(destination);
    }
}