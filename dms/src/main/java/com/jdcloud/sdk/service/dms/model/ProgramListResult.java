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
 * DmsProgram
 * 编程对象相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取视图列表
 */
public class ProgramListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 视图名称
     */
    private List<String> viewNames;

    /**
     * 存储过程名称
     */
    private List<String> procedureNames;

    /**
     * 函数名称
     */
    private List<String> functionNames;

    /**
     * 触发器名称
     */
    private List<String> triggerNames;

    /**
     * 事件名称
     */
    private List<String> eventNames;


    /**
     * get 视图名称
     *
     * @return
     */
    public List<String> getViewNames() {
        return viewNames;
    }

    /**
     * set 视图名称
     *
     * @param viewNames
     */
    public void setViewNames(List<String> viewNames) {
        this.viewNames = viewNames;
    }

    /**
     * get 存储过程名称
     *
     * @return
     */
    public List<String> getProcedureNames() {
        return procedureNames;
    }

    /**
     * set 存储过程名称
     *
     * @param procedureNames
     */
    public void setProcedureNames(List<String> procedureNames) {
        this.procedureNames = procedureNames;
    }

    /**
     * get 函数名称
     *
     * @return
     */
    public List<String> getFunctionNames() {
        return functionNames;
    }

    /**
     * set 函数名称
     *
     * @param functionNames
     */
    public void setFunctionNames(List<String> functionNames) {
        this.functionNames = functionNames;
    }

    /**
     * get 触发器名称
     *
     * @return
     */
    public List<String> getTriggerNames() {
        return triggerNames;
    }

    /**
     * set 触发器名称
     *
     * @param triggerNames
     */
    public void setTriggerNames(List<String> triggerNames) {
        this.triggerNames = triggerNames;
    }

    /**
     * get 事件名称
     *
     * @return
     */
    public List<String> getEventNames() {
        return eventNames;
    }

    /**
     * set 事件名称
     *
     * @param eventNames
     */
    public void setEventNames(List<String> eventNames) {
        this.eventNames = eventNames;
    }


    /**
     * set 视图名称
     *
     * @param viewNames
     */
    public ProgramListResult viewNames(List<String> viewNames) {
        this.viewNames = viewNames;
        return this;
    }

    /**
     * set 存储过程名称
     *
     * @param procedureNames
     */
    public ProgramListResult procedureNames(List<String> procedureNames) {
        this.procedureNames = procedureNames;
        return this;
    }

    /**
     * set 函数名称
     *
     * @param functionNames
     */
    public ProgramListResult functionNames(List<String> functionNames) {
        this.functionNames = functionNames;
        return this;
    }

    /**
     * set 触发器名称
     *
     * @param triggerNames
     */
    public ProgramListResult triggerNames(List<String> triggerNames) {
        this.triggerNames = triggerNames;
        return this;
    }

    /**
     * set 事件名称
     *
     * @param eventNames
     */
    public ProgramListResult eventNames(List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }


    /**
     * add item to 视图名称
     *
     * @param viewName
     */
    public void addViewName(String viewName) {
        if (this.viewNames == null) {
            this.viewNames = new ArrayList<>();
        }
        this.viewNames.add(viewName);
    }

    /**
     * add item to 存储过程名称
     *
     * @param procedureName
     */
    public void addProcedureName(String procedureName) {
        if (this.procedureNames == null) {
            this.procedureNames = new ArrayList<>();
        }
        this.procedureNames.add(procedureName);
    }

    /**
     * add item to 函数名称
     *
     * @param functionName
     */
    public void addFunctionName(String functionName) {
        if (this.functionNames == null) {
            this.functionNames = new ArrayList<>();
        }
        this.functionNames.add(functionName);
    }

    /**
     * add item to 触发器名称
     *
     * @param triggerName
     */
    public void addTriggerName(String triggerName) {
        if (this.triggerNames == null) {
            this.triggerNames = new ArrayList<>();
        }
        this.triggerNames.add(triggerName);
    }

    /**
     * add item to 事件名称
     *
     * @param eventName
     */
    public void addEventName(String eventName) {
        if (this.eventNames == null) {
            this.eventNames = new ArrayList<>();
        }
        this.eventNames.add(eventName);
    }

}