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

package com.jdcloud.sdk.service.cdn.model;


/**
 * backSourceRule
 */
public class BackSourceRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 匹配方式,取值：全站(all)与url(url)
     */
    private String matchMode;

    /**
     * 待改写回源URL,1、选择全站时该项不允许填写，匹配方式为全站时为“^/(.\*)”，选择URL路径时需以/开头;2、若为(/.\*)即与全站等效,请选择全站:all匹配方式；3、\*与\*、\*与.\*不能连续；4、URL匹配方式：仅支持 “-”、“\”、“/”、“.”、字母、数字、通配符\*。
     */
    private String before;

    /**
     * 目标回源URL,URL匹配方式：仅支持“-”、“\”、“/”、“.”、字母、数字、$。
     */
    private String after;

    /**
     * 优先级，1-50,不可重复
     */
    private Integer priority;


    /**
     * get 匹配方式,取值：全站(all)与url(url)
     *
     * @return
     */
    public String getMatchMode() {
        return matchMode;
    }

    /**
     * set 匹配方式,取值：全站(all)与url(url)
     *
     * @param matchMode
     */
    public void setMatchMode(String matchMode) {
        this.matchMode = matchMode;
    }

    /**
     * get 待改写回源URL,1、选择全站时该项不允许填写，匹配方式为全站时为“^/(.\*)”，选择URL路径时需以/开头;2、若为(/.\*)即与全站等效,请选择全站:all匹配方式；3、\*与\*、\*与.\*不能连续；4、URL匹配方式：仅支持 “-”、“\”、“/”、“.”、字母、数字、通配符\*。
     *
     * @return
     */
    public String getBefore() {
        return before;
    }

    /**
     * set 待改写回源URL,1、选择全站时该项不允许填写，匹配方式为全站时为“^/(.\*)”，选择URL路径时需以/开头;2、若为(/.\*)即与全站等效,请选择全站:all匹配方式；3、\*与\*、\*与.\*不能连续；4、URL匹配方式：仅支持 “-”、“\”、“/”、“.”、字母、数字、通配符\*。
     *
     * @param before
     */
    public void setBefore(String before) {
        this.before = before;
    }

    /**
     * get 目标回源URL,URL匹配方式：仅支持“-”、“\”、“/”、“.”、字母、数字、$。
     *
     * @return
     */
    public String getAfter() {
        return after;
    }

    /**
     * set 目标回源URL,URL匹配方式：仅支持“-”、“\”、“/”、“.”、字母、数字、$。
     *
     * @param after
     */
    public void setAfter(String after) {
        this.after = after;
    }

    /**
     * get 优先级，1-50,不可重复
     *
     * @return
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * set 优先级，1-50,不可重复
     *
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    /**
     * set 匹配方式,取值：全站(all)与url(url)
     *
     * @param matchMode
     */
    public BackSourceRule matchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }

    /**
     * set 待改写回源URL,1、选择全站时该项不允许填写，匹配方式为全站时为“^/(.\*)”，选择URL路径时需以/开头;2、若为(/.\*)即与全站等效,请选择全站:all匹配方式；3、\*与\*、\*与.\*不能连续；4、URL匹配方式：仅支持 “-”、“\”、“/”、“.”、字母、数字、通配符\*。
     *
     * @param before
     */
    public BackSourceRule before(String before) {
        this.before = before;
        return this;
    }

    /**
     * set 目标回源URL,URL匹配方式：仅支持“-”、“\”、“/”、“.”、字母、数字、$。
     *
     * @param after
     */
    public BackSourceRule after(String after) {
        this.after = after;
        return this;
    }

    /**
     * set 优先级，1-50,不可重复
     *
     * @param priority
     */
    public BackSourceRule priority(Integer priority) {
        this.priority = priority;
        return this;
    }


}