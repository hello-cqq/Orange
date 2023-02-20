/*
 * Copyright 2023 AhahahQ
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Version: 1.0
 * Date : 2023/2/16
 * Author: hey.cqq@gmail.com
 *
 * ---------------------Revision History: ---------------------
 *  <author>           <data>          <version >       <desc>
 *  AhahahQ            2023/2/16         1.0         build this module
*/
package com.ahahahq.orangedemo.common.utils

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.widget.Toast

object EXJumpUtil {

    fun jumpAlbum(activity: Activity, requestCode: Int) {
        try {
            activity.startActivityForResult(
                Intent().apply {
                    type = "image/*"
                    action = Intent.ACTION_PICK
                }, requestCode
            )
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(activity, "没有找到相关程序", Toast.LENGTH_LONG).show()
        }
    }
}