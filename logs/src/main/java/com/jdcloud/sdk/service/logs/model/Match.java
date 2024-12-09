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


/**
 * match
 */
public class Match  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * eq
     */
    private Object eq;

    /**
     * not
     */
    private Object not;

    /**
     * range
     */
    private Object range;

    /**
     * regexp
     */
    private Object regexp;

    /**
     * simple_query_string
     */
    private Object simple_query_string;

    /**
     * simpleQuery
     */
    private Object simpleQuery;

    /**
     * substring
     */
    private Object substring;



    /**
     * get eq
     *
     * @return
     */
    public Object getEq() {
        return eq;
    }

    /**
     * set eq
     *
     * @param eq
     */
    public void setEq(Object eq) {
        this.eq = eq;
    }


    /**
     * get not
     *
     * @return
     */
    public Object getNot() {
        return not;
    }

    /**
     * set not
     *
     * @param not
     */
    public void setNot(Object not) {
        this.not = not;
    }


    /**
     * get range
     *
     * @return
     */
    public Object getRange() {
        return range;
    }

    /**
     * set range
     *
     * @param range
     */
    public void setRange(Object range) {
        this.range = range;
    }


    /**
     * get regexp
     *
     * @return
     */
    public Object getRegexp() {
        return regexp;
    }

    /**
     * set regexp
     *
     * @param regexp
     */
    public void setRegexp(Object regexp) {
        this.regexp = regexp;
    }


    /**
     * get simple_query_string
     *
     * @return
     */
    public Object getSimple_query_string() {
        return simple_query_string;
    }

    /**
     * set simple_query_string
     *
     * @param simple_query_string
     */
    public void setSimple_query_string(Object simple_query_string) {
        this.simple_query_string = simple_query_string;
    }


    /**
     * get simpleQuery
     *
     * @return
     */
    public Object getSimpleQuery() {
        return simpleQuery;
    }

    /**
     * set simpleQuery
     *
     * @param simpleQuery
     */
    public void setSimpleQuery(Object simpleQuery) {
        this.simpleQuery = simpleQuery;
    }


    /**
     * get substring
     *
     * @return
     */
    public Object getSubstring() {
        return substring;
    }

    /**
     * set substring
     *
     * @param substring
     */
    public void setSubstring(Object substring) {
        this.substring = substring;
    }



    /**
     * set eq
     *
     * @param eq
     */
    public Match eq(Object eq) {
        this.eq = eq;
        return this;
    }


    /**
     * set not
     *
     * @param not
     */
    public Match not(Object not) {
        this.not = not;
        return this;
    }


    /**
     * set range
     *
     * @param range
     */
    public Match range(Object range) {
        this.range = range;
        return this;
    }


    /**
     * set regexp
     *
     * @param regexp
     */
    public Match regexp(Object regexp) {
        this.regexp = regexp;
        return this;
    }


    /**
     * set simple_query_string
     *
     * @param simple_query_string
     */
    public Match simple_query_string(Object simple_query_string) {
        this.simple_query_string = simple_query_string;
        return this;
    }


    /**
     * set simpleQuery
     *
     * @param simpleQuery
     */
    public Match simpleQuery(Object simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }


    /**
     * set substring
     *
     * @param substring
     */
    public Match substring(Object substring) {
        this.substring = substring;
        return this;
    }


}