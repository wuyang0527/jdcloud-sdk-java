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
 * lokiResponseStatsChunkHit
 */
public class LokiResponseStatsChunkHit  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * hit
     */
    
    private List<String> hit;
    /**
     * miss
     */
    
    private List<String> miss;


    /**
    * get hit
    *
    * @return
    */
    public List<String> getHit() {
        return hit;
    }

    /**
    * set hit
    *
    * @param hit
    */
    public void setHit(List<String> hit) {
        this.hit = hit;
    }


    /**
    * get miss
    *
    * @return
    */
    public List<String> getMiss() {
        return miss;
    }

    /**
    * set miss
    *
    * @param miss
    */
    public void setMiss(List<String> miss) {
        this.miss = miss;
    }



    /**
    * set hit
    *
    * @param hit
    */
    public LokiResponseStatsChunkHit hit(List<String> hit) {
        this.hit = hit;
        return this;
    }


    /**
    * set miss
    *
    * @param miss
    */
    public LokiResponseStatsChunkHit miss(List<String> miss) {
        this.miss = miss;
        return this;
    }



    /**
     * add item to hit
     *
     * @param hit
     */
    public void addHit(String hit) {
        if (this.hit == null) {
            this.hit = new ArrayList<>();
        }
        this.hit.add(hit);
    }

    /**
     * add item to miss
     *
     * @param mis
     */
    public void addMis(String mis) {
        if (this.miss == null) {
            this.miss = new ArrayList<>();
        }
        this.miss.add(mis);
    }
}