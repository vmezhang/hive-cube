/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.hive.cube.plugins.util;

/**
 * JDBC constants.
 * 
 * @author smartloli.
 *
 *         Created by Jul 7, 2017
 */
public interface JConstants {

	/** Get databases. */
	public static final String SHOW_DATABASES = "SHOW DATABASES";

	/** Constant property. */
	public static final String DB = "db";
	public static final String COLUMN = "column";
	public static final String DATASETS = "datasets";

	/** MySql type. */
	public static final String MYSQL = "mysql";

	/** MySql driver name. */
	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
}
