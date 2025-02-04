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
 * dataSource
 */
public class DataSource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id。
     */
    private Integer id;

    /**
     * 数据库ip地址。
     */
    private String ip;

    /**
     * 数据库端口。
     */
    private Integer port;

    /**
     * dbName，数据库名称，RDS或DRDS实例时为空。
     */
    private String dbName;

    /**
     * 修改用户。
     */
    private String modifiedBy;

    /**
     * 0为有效，1为无效。
     */
    private String status;

    /**
     * 数据库用户名。
     */
    private String userName;

    /**
     * 数据库密码。
     */
    private String passwd;

    /**
     * 数据库加密密码。
     */
    private String passwdEcrypt;

    /**
     * Cds集群名称。
     */
    private String cdsCluster;

    /**
     * 数据库类型，CDS(&quot;CDS&quot;, 1), MYSQL(&quot;MYSQL&quot;, 2), ORACLE(&quot;ORACLE&quot;, 3), SQLSERVER(&quot;SQLSERVER&quot;, 4), CDSMYSQL(&quot;CDSMYSQL&quot;, 5), CDSORACLE(&quot;CDSORACLE&quot;, 6), CDSSQLSERVER(&quot;CDSSQLSERVER&quot;, 7), DATACENTER(&quot;DATACENTER&quot;, 8), HBASE(&quot;Hbase&quot;,9),MONGODB(&quot;MongoDb&quot;,10),ES(&quot;ES&quot;,11), MYSQL_INS(&quot;MYSQL_INS&quot;,12), DRDS_INS(&quot;DRDS_INS&quot;,13),STARDB_INS(&quot;STARDB_INS&quot;,14), STARDB_PROXY_INS(&quot;STARDB_PROXY_INS&quot;,15);。
     */
    private Integer dbType;

    /**
     * 创建时间。
     */
    private String createTime;

    /**
     * 环境类型，已废弃。
     */
    private Integer environmentType;

    /**
     * 已废弃。
     */
    private String dbTypeName;

    /**
     * 已废弃。
     */
    private String sensitivity;

    /**
     * 已废弃。
     */
    private Integer userType;

    /**
     * mongo权限类型。
     */
    private String mongoAuth;

    /**
     * 数据库中文名备注，已废弃。
     */
    private String schemaCname;

    /**
     * 数据库所属部门，已废弃。
     */
    private String schemaDepartment;

    /**
     * 数据库维护dba，已废弃。
     */
    private String schemaDba;

    /**
     * 数据库owner，已废弃。
     */
    private String schemaOwner;

    /**
     * 已废弃。
     */
    private String isStandard;

    /**
     * 已废弃。
     */
    private String coldict;

    /**
     * 数据库版本，已废弃。
     */
    private String version;

    /**
     * 数据库环境，已废弃。
     */
    private String schemaEnvironment;

    /**
     * 已废弃。
     */
    private String query;

    /**
     * 数据库所属区域。
     */
    private String region;

    /**
     * 地址模式：CLASSIC(&quot;CLASSIC&quot;, 0), RDS(&quot;RDS&quot;, 1), ECS(&quot;ECS&quot;, 2), VPC(&quot;VPC&quot;, 3);。
     */
    private String addrMode;

    /**
     * 原生地址，RDS，DRDS为实例id。
     */
    private String addrOrigin;

    /**
     * 保留字段。
     */
    private String addrKey;

    /**
     * 保留字段。
     */
    private String extra;


    /**
     * get 主键id。
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 主键id。
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 数据库ip地址。
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 数据库ip地址。
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 数据库端口。
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 数据库端口。
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * get dbName，数据库名称，RDS或DRDS实例时为空。
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set dbName，数据库名称，RDS或DRDS实例时为空。
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 修改用户。
     *
     * @return
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * set 修改用户。
     *
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * get 0为有效，1为无效。
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 0为有效，1为无效。
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 数据库用户名。
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 数据库用户名。
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get 数据库密码。
     *
     * @return
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * set 数据库密码。
     *
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * get 数据库加密密码。
     *
     * @return
     */
    public String getPasswdEcrypt() {
        return passwdEcrypt;
    }

    /**
     * set 数据库加密密码。
     *
     * @param passwdEcrypt
     */
    public void setPasswdEcrypt(String passwdEcrypt) {
        this.passwdEcrypt = passwdEcrypt;
    }

    /**
     * get Cds集群名称。
     *
     * @return
     */
    public String getCdsCluster() {
        return cdsCluster;
    }

    /**
     * set Cds集群名称。
     *
     * @param cdsCluster
     */
    public void setCdsCluster(String cdsCluster) {
        this.cdsCluster = cdsCluster;
    }

    /**
     * get 数据库类型，CDS(&quot;CDS&quot;, 1), MYSQL(&quot;MYSQL&quot;, 2), ORACLE(&quot;ORACLE&quot;, 3), SQLSERVER(&quot;SQLSERVER&quot;, 4), CDSMYSQL(&quot;CDSMYSQL&quot;, 5), CDSORACLE(&quot;CDSORACLE&quot;, 6), CDSSQLSERVER(&quot;CDSSQLSERVER&quot;, 7), DATACENTER(&quot;DATACENTER&quot;, 8), HBASE(&quot;Hbase&quot;,9),MONGODB(&quot;MongoDb&quot;,10),ES(&quot;ES&quot;,11), MYSQL_INS(&quot;MYSQL_INS&quot;,12), DRDS_INS(&quot;DRDS_INS&quot;,13),STARDB_INS(&quot;STARDB_INS&quot;,14), STARDB_PROXY_INS(&quot;STARDB_PROXY_INS&quot;,15);。
     *
     * @return
     */
    public Integer getDbType() {
        return dbType;
    }

    /**
     * set 数据库类型，CDS(&quot;CDS&quot;, 1), MYSQL(&quot;MYSQL&quot;, 2), ORACLE(&quot;ORACLE&quot;, 3), SQLSERVER(&quot;SQLSERVER&quot;, 4), CDSMYSQL(&quot;CDSMYSQL&quot;, 5), CDSORACLE(&quot;CDSORACLE&quot;, 6), CDSSQLSERVER(&quot;CDSSQLSERVER&quot;, 7), DATACENTER(&quot;DATACENTER&quot;, 8), HBASE(&quot;Hbase&quot;,9),MONGODB(&quot;MongoDb&quot;,10),ES(&quot;ES&quot;,11), MYSQL_INS(&quot;MYSQL_INS&quot;,12), DRDS_INS(&quot;DRDS_INS&quot;,13),STARDB_INS(&quot;STARDB_INS&quot;,14), STARDB_PROXY_INS(&quot;STARDB_PROXY_INS&quot;,15);。
     *
     * @param dbType
     */
    public void setDbType(Integer dbType) {
        this.dbType = dbType;
    }

    /**
     * get 创建时间。
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间。
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 环境类型，已废弃。
     *
     * @return
     */
    public Integer getEnvironmentType() {
        return environmentType;
    }

    /**
     * set 环境类型，已废弃。
     *
     * @param environmentType
     */
    public void setEnvironmentType(Integer environmentType) {
        this.environmentType = environmentType;
    }

    /**
     * get 已废弃。
     *
     * @return
     */
    public String getDbTypeName() {
        return dbTypeName;
    }

    /**
     * set 已废弃。
     *
     * @param dbTypeName
     */
    public void setDbTypeName(String dbTypeName) {
        this.dbTypeName = dbTypeName;
    }

    /**
     * get 已废弃。
     *
     * @return
     */
    public String getSensitivity() {
        return sensitivity;
    }

    /**
     * set 已废弃。
     *
     * @param sensitivity
     */
    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }

    /**
     * get 已废弃。
     *
     * @return
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * set 已废弃。
     *
     * @param userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * get mongo权限类型。
     *
     * @return
     */
    public String getMongoAuth() {
        return mongoAuth;
    }

    /**
     * set mongo权限类型。
     *
     * @param mongoAuth
     */
    public void setMongoAuth(String mongoAuth) {
        this.mongoAuth = mongoAuth;
    }

    /**
     * get 数据库中文名备注，已废弃。
     *
     * @return
     */
    public String getSchemaCname() {
        return schemaCname;
    }

    /**
     * set 数据库中文名备注，已废弃。
     *
     * @param schemaCname
     */
    public void setSchemaCname(String schemaCname) {
        this.schemaCname = schemaCname;
    }

    /**
     * get 数据库所属部门，已废弃。
     *
     * @return
     */
    public String getSchemaDepartment() {
        return schemaDepartment;
    }

    /**
     * set 数据库所属部门，已废弃。
     *
     * @param schemaDepartment
     */
    public void setSchemaDepartment(String schemaDepartment) {
        this.schemaDepartment = schemaDepartment;
    }

    /**
     * get 数据库维护dba，已废弃。
     *
     * @return
     */
    public String getSchemaDba() {
        return schemaDba;
    }

    /**
     * set 数据库维护dba，已废弃。
     *
     * @param schemaDba
     */
    public void setSchemaDba(String schemaDba) {
        this.schemaDba = schemaDba;
    }

    /**
     * get 数据库owner，已废弃。
     *
     * @return
     */
    public String getSchemaOwner() {
        return schemaOwner;
    }

    /**
     * set 数据库owner，已废弃。
     *
     * @param schemaOwner
     */
    public void setSchemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner;
    }

    /**
     * get 已废弃。
     *
     * @return
     */
    public String getIsStandard() {
        return isStandard;
    }

    /**
     * set 已废弃。
     *
     * @param isStandard
     */
    public void setIsStandard(String isStandard) {
        this.isStandard = isStandard;
    }

    /**
     * get 已废弃。
     *
     * @return
     */
    public String getColdict() {
        return coldict;
    }

    /**
     * set 已废弃。
     *
     * @param coldict
     */
    public void setColdict(String coldict) {
        this.coldict = coldict;
    }

    /**
     * get 数据库版本，已废弃。
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 数据库版本，已废弃。
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 数据库环境，已废弃。
     *
     * @return
     */
    public String getSchemaEnvironment() {
        return schemaEnvironment;
    }

    /**
     * set 数据库环境，已废弃。
     *
     * @param schemaEnvironment
     */
    public void setSchemaEnvironment(String schemaEnvironment) {
        this.schemaEnvironment = schemaEnvironment;
    }

    /**
     * get 已废弃。
     *
     * @return
     */
    public String getQuery() {
        return query;
    }

    /**
     * set 已废弃。
     *
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * get 数据库所属区域。
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 数据库所属区域。
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 地址模式：CLASSIC(&quot;CLASSIC&quot;, 0), RDS(&quot;RDS&quot;, 1), ECS(&quot;ECS&quot;, 2), VPC(&quot;VPC&quot;, 3);。
     *
     * @return
     */
    public String getAddrMode() {
        return addrMode;
    }

    /**
     * set 地址模式：CLASSIC(&quot;CLASSIC&quot;, 0), RDS(&quot;RDS&quot;, 1), ECS(&quot;ECS&quot;, 2), VPC(&quot;VPC&quot;, 3);。
     *
     * @param addrMode
     */
    public void setAddrMode(String addrMode) {
        this.addrMode = addrMode;
    }

    /**
     * get 原生地址，RDS，DRDS为实例id。
     *
     * @return
     */
    public String getAddrOrigin() {
        return addrOrigin;
    }

    /**
     * set 原生地址，RDS，DRDS为实例id。
     *
     * @param addrOrigin
     */
    public void setAddrOrigin(String addrOrigin) {
        this.addrOrigin = addrOrigin;
    }

    /**
     * get 保留字段。
     *
     * @return
     */
    public String getAddrKey() {
        return addrKey;
    }

    /**
     * set 保留字段。
     *
     * @param addrKey
     */
    public void setAddrKey(String addrKey) {
        this.addrKey = addrKey;
    }

    /**
     * get 保留字段。
     *
     * @return
     */
    public String getExtra() {
        return extra;
    }

    /**
     * set 保留字段。
     *
     * @param extra
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }


    /**
     * set 主键id。
     *
     * @param id
     */
    public DataSource id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 数据库ip地址。
     *
     * @param ip
     */
    public DataSource ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 数据库端口。
     *
     * @param port
     */
    public DataSource port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * set dbName，数据库名称，RDS或DRDS实例时为空。
     *
     * @param dbName
     */
    public DataSource dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 修改用户。
     *
     * @param modifiedBy
     */
    public DataSource modifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * set 0为有效，1为无效。
     *
     * @param status
     */
    public DataSource status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 数据库用户名。
     *
     * @param userName
     */
    public DataSource userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * set 数据库密码。
     *
     * @param passwd
     */
    public DataSource passwd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    /**
     * set 数据库加密密码。
     *
     * @param passwdEcrypt
     */
    public DataSource passwdEcrypt(String passwdEcrypt) {
        this.passwdEcrypt = passwdEcrypt;
        return this;
    }

    /**
     * set Cds集群名称。
     *
     * @param cdsCluster
     */
    public DataSource cdsCluster(String cdsCluster) {
        this.cdsCluster = cdsCluster;
        return this;
    }

    /**
     * set 数据库类型，CDS(&quot;CDS&quot;, 1), MYSQL(&quot;MYSQL&quot;, 2), ORACLE(&quot;ORACLE&quot;, 3), SQLSERVER(&quot;SQLSERVER&quot;, 4), CDSMYSQL(&quot;CDSMYSQL&quot;, 5), CDSORACLE(&quot;CDSORACLE&quot;, 6), CDSSQLSERVER(&quot;CDSSQLSERVER&quot;, 7), DATACENTER(&quot;DATACENTER&quot;, 8), HBASE(&quot;Hbase&quot;,9),MONGODB(&quot;MongoDb&quot;,10),ES(&quot;ES&quot;,11), MYSQL_INS(&quot;MYSQL_INS&quot;,12), DRDS_INS(&quot;DRDS_INS&quot;,13),STARDB_INS(&quot;STARDB_INS&quot;,14), STARDB_PROXY_INS(&quot;STARDB_PROXY_INS&quot;,15);。
     *
     * @param dbType
     */
    public DataSource dbType(Integer dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * set 创建时间。
     *
     * @param createTime
     */
    public DataSource createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 环境类型，已废弃。
     *
     * @param environmentType
     */
    public DataSource environmentType(Integer environmentType) {
        this.environmentType = environmentType;
        return this;
    }

    /**
     * set 已废弃。
     *
     * @param dbTypeName
     */
    public DataSource dbTypeName(String dbTypeName) {
        this.dbTypeName = dbTypeName;
        return this;
    }

    /**
     * set 已废弃。
     *
     * @param sensitivity
     */
    public DataSource sensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }

    /**
     * set 已废弃。
     *
     * @param userType
     */
    public DataSource userType(Integer userType) {
        this.userType = userType;
        return this;
    }

    /**
     * set mongo权限类型。
     *
     * @param mongoAuth
     */
    public DataSource mongoAuth(String mongoAuth) {
        this.mongoAuth = mongoAuth;
        return this;
    }

    /**
     * set 数据库中文名备注，已废弃。
     *
     * @param schemaCname
     */
    public DataSource schemaCname(String schemaCname) {
        this.schemaCname = schemaCname;
        return this;
    }

    /**
     * set 数据库所属部门，已废弃。
     *
     * @param schemaDepartment
     */
    public DataSource schemaDepartment(String schemaDepartment) {
        this.schemaDepartment = schemaDepartment;
        return this;
    }

    /**
     * set 数据库维护dba，已废弃。
     *
     * @param schemaDba
     */
    public DataSource schemaDba(String schemaDba) {
        this.schemaDba = schemaDba;
        return this;
    }

    /**
     * set 数据库owner，已废弃。
     *
     * @param schemaOwner
     */
    public DataSource schemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner;
        return this;
    }

    /**
     * set 已废弃。
     *
     * @param isStandard
     */
    public DataSource isStandard(String isStandard) {
        this.isStandard = isStandard;
        return this;
    }

    /**
     * set 已废弃。
     *
     * @param coldict
     */
    public DataSource coldict(String coldict) {
        this.coldict = coldict;
        return this;
    }

    /**
     * set 数据库版本，已废弃。
     *
     * @param version
     */
    public DataSource version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 数据库环境，已废弃。
     *
     * @param schemaEnvironment
     */
    public DataSource schemaEnvironment(String schemaEnvironment) {
        this.schemaEnvironment = schemaEnvironment;
        return this;
    }

    /**
     * set 已废弃。
     *
     * @param query
     */
    public DataSource query(String query) {
        this.query = query;
        return this;
    }

    /**
     * set 数据库所属区域。
     *
     * @param region
     */
    public DataSource region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 地址模式：CLASSIC(&quot;CLASSIC&quot;, 0), RDS(&quot;RDS&quot;, 1), ECS(&quot;ECS&quot;, 2), VPC(&quot;VPC&quot;, 3);。
     *
     * @param addrMode
     */
    public DataSource addrMode(String addrMode) {
        this.addrMode = addrMode;
        return this;
    }

    /**
     * set 原生地址，RDS，DRDS为实例id。
     *
     * @param addrOrigin
     */
    public DataSource addrOrigin(String addrOrigin) {
        this.addrOrigin = addrOrigin;
        return this;
    }

    /**
     * set 保留字段。
     *
     * @param addrKey
     */
    public DataSource addrKey(String addrKey) {
        this.addrKey = addrKey;
        return this;
    }

    /**
     * set 保留字段。
     *
     * @param extra
     */
    public DataSource extra(String extra) {
        this.extra = extra;
        return this;
    }


}