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

package com.jdcloud.sdk.service.dh.model;

import java.util.List;
import java.util.ArrayList;

/**
 * core
 */
public class Core  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * core id
     */
    private Integer id;

    /**
     * threads of core
     */
    
    private List<Thread> threads;


    /**
     * get core id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set core id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
    * get threads of core
    *
    * @return
    */
    public List<Thread> getThreads() {
        return threads;
    }

    /**
    * set threads of core
    *
    * @param threads
    */
    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }



    /**
     * set core id
     *
     * @param id
     */
    public Core id(Integer id) {
        this.id = id;
        return this;
    }


    /**
    * set threads of core
    *
    * @param threads
    */
    public Core threads(List<Thread> threads) {
        this.threads = threads;
        return this;
    }



    /**
     * add item to threads of core
     *
     * @param thread
     */
    public void addThread(Thread thread) {
        if (this.threads == null) {
            this.threads = new ArrayList<>();
        }
        this.threads.add(thread);
    }
}