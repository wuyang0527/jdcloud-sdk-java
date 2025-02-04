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

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 禁用命令
 */
public class DisableCommands  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 命令是否禁用
     * Required:true
     */
    @Required
    private Boolean isDisable;

    /**
     * 命令名称
     * Required:true
     */
    @Required
    private String commandName;


    /**
     * get 命令是否禁用
     *
     * @return
     */
    public Boolean getIsDisable() {
        return isDisable;
    }

    /**
     * set 命令是否禁用
     *
     * @param isDisable
     */
    public void setIsDisable(Boolean isDisable) {
        this.isDisable = isDisable;
    }

    /**
     * get 命令名称
     *
     * @return
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * set 命令名称
     *
     * @param commandName
     */
    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }


    /**
     * set 命令是否禁用
     *
     * @param isDisable
     */
    public DisableCommands isDisable(Boolean isDisable) {
        this.isDisable = isDisable;
        return this;
    }

    /**
     * set 命令名称
     *
     * @param commandName
     */
    public DisableCommands commandName(String commandName) {
        this.commandName = commandName;
        return this;
    }


}