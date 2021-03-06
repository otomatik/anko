/*
 * Copyright 2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("NOTHING_TO_INLINE")
package org.jetbrains.anko

import android.view.ViewGroup

val matchParent: Int = android.view.ViewGroup.LayoutParams.MATCH_PARENT
val wrapContent: Int = android.view.ViewGroup.LayoutParams.WRAP_CONTENT

var ViewGroup.MarginLayoutParams.verticalMargin: Int
    get() = throw AnkoException("'ViewGroup.MarginLayoutParams.verticalMargin' property does not have a getter")
    set(v) {
        topMargin = v
        bottomMargin = v
    }

var ViewGroup.MarginLayoutParams.horizontalMargin: Int
    get() = throw AnkoException("'ViewGroup.MarginLayoutParams.horizontalMargin' property does not have a getter")
    set(v) {
        leftMargin = v; rightMargin = v
    }

var ViewGroup.MarginLayoutParams.margin: Int
    get() = throw AnkoException("'ViewGroup.MarginLayoutParams.margin' property does not have a getter")
    set(v) {
        leftMargin = v
        rightMargin = v
        topMargin = v
        bottomMargin = v
    }